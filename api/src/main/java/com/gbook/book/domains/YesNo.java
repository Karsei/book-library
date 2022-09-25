package com.gbook.book.domains;

import lombok.Getter;

@Getter
public enum YesNo implements DbCommonType {
    YES("Y"),
    NO("N");

    private final String dbCode;

    YesNo(String dbCode) {
        this.dbCode = dbCode;
    }
}
