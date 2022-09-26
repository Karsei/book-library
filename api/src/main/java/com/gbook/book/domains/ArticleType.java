package com.gbook.book.domains;

import lombok.Getter;

@Getter
public enum ArticleType implements DbCommonType {
    NOTICE("notice"),
    HELP("help");

    private final String dbCode;

    ArticleType(String dbCode) {
        this.dbCode = dbCode;
    }
}
