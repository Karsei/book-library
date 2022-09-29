package com.gbook.book.utils;

import com.gbook.book.domains.DbCommonType;
import org.springframework.util.StringUtils;

import java.util.EnumSet;

public class DbCodeEnumConverter {
    public static <T extends Enum<T> & DbCommonType> T ofDbCode(Class<T> clazz,
                                                                String dbCode) {
        if (!StringUtils.hasText(dbCode)) return null;
        return EnumSet.allOf(clazz).stream()
                .filter(t -> t.getDbCode().equals(dbCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("enum=[%s], dbCode=[%s] 가 존재하지 않습니다.", clazz.getName(), dbCode)));
    }

    public static <T extends Enum<T> & DbCommonType> String toDbCode(T value) {
        if (value == null) return "";
        return value.getDbCode();
    }
}
