package com.gbook.book.domains;

import lombok.Getter;

@Getter
public enum BookRequestDestination implements DbCommonType {
    GABIA("본사"),
    SEOCHO_IDC("서초IDC"),
    GASAN_IDC("가산IDC"),
    GASAN_WCENTER("가산W센터");

    private final String dbCode;

    BookRequestDestination(String dbCode) {
        this.dbCode = dbCode;
    }
}
