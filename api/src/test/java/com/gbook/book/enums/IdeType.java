package com.gbook.book.enums;

import com.gbook.book.domains.DbCommonType;
import lombok.Getter;

@Getter
public enum IdeType implements DbCommonType {
    VSCODE("visual studio code");

    @Override
    public String getDbCode() {
        return dbCode;
    }

    private final String dbCode;

    IdeType(String dbCode) {
        this.dbCode = dbCode;
    }
}
