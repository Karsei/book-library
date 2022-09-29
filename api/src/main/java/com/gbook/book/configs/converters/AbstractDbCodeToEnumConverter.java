package com.gbook.book.configs.converters;

import com.gbook.book.domains.DbCommonType;
import com.gbook.book.utils.DbCodeEnumConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
@Getter
@AllArgsConstructor
public class AbstractDbCodeToEnumConverter<E extends Enum<E> & DbCommonType> implements AttributeConverter<E, String> {
    private Class<E> targetClass;
    private String enumName;

    @Override
    public String convertToDatabaseColumn(E attribute) {
        if (attribute == null) throw new IllegalArgumentException("값을 변환할 수 없습니다.");
        return DbCodeEnumConverter.toDbCode(attribute);
    }

    @Override
    public E convertToEntityAttribute(String dbCode) {
        if (!StringUtils.hasText(dbCode)) return null;
        return DbCodeEnumConverter.ofDbCode(targetClass, dbCode);
    }
}
