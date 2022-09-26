package com.gbook.book.configs.converters;

import com.gbook.book.domains.BookRequestDestination;

import javax.persistence.Converter;

@Converter
public class BookRequestDestinationConverter extends AbstractDbCodeToEnumConverter<BookRequestDestination> {
    public static final String ENUM_NAME = "신청도서도착지";

    public BookRequestDestinationConverter() {
        super(BookRequestDestination.class, ENUM_NAME);
    }
}
