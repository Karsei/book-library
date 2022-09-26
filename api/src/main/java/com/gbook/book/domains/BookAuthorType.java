package com.gbook.book.domains;

import lombok.Getter;

@Getter
public enum BookAuthorType implements DbCommonType {
    AUTHOR("author"),
    WRITER("writer"),
    TRANSLATOR("translator"),
    SUPERVISION_TRANSLATOR("supervision_translator"),
    SUPERVISION("supervision"),
    ILLUSTRATOR("illustrator");

    private final String dbCode;

    BookAuthorType(String dbCode) {
        this.dbCode = dbCode;
    }
}
