package com.gbook.book.configs.converters;

import com.gbook.book.domains.YesNo;

import javax.persistence.Converter;

@Converter
public class YesNoConverter extends AbstractDbCodeToEnumConverter<YesNo> {
    public static final String ENUM_NAME = "해당여부";

    public YesNoConverter() {
        super(YesNo.class, ENUM_NAME);
    }
}
