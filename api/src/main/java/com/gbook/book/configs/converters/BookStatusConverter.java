package com.gbook.book.configs.converters;

import com.gbook.book.domains.BookStatus;

import javax.persistence.Converter;

@Converter
public class BookStatusConverter extends AbstractDbCodeToEnumConverter<BookStatus> {
    public static final String ENUM_NAME = "도서상태";

    public BookStatusConverter() {
        super(BookStatus.class, ENUM_NAME);
    }
}
