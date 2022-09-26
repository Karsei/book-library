package com.gbook.book.configs.converters;

import com.gbook.book.domains.BookAuthorType;

import javax.persistence.Converter;

@Converter
public class BookAuthorTypeConverter extends AbstractDbCodeToEnumConverter<BookAuthorType> {
    public static final String ENUM_NAME = "저자유형";

    public BookAuthorTypeConverter() {
        super(BookAuthorType.class, ENUM_NAME);
    }
}
