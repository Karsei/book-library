package com.gbook.book.configs.converters;

import com.gbook.book.domains.BookRequestStatus;

import javax.persistence.Converter;

@Converter
public class BookRequestStatusConverter extends AbstractDbCodeToEnumConverter<BookRequestStatus> {
    public static final String ENUM_NAME = "신청도서상태";

    public BookRequestStatusConverter() {
        super(BookRequestStatus.class, ENUM_NAME);
    }
}
