package com.gbook.book.domains;

import lombok.Getter;

@Getter
public enum LendRecordStatus implements DbCommonType {
    CHECKED_OUT("대출중"),
    RETURNED("반납완료"),
    LONG_TERM_CHECKED_OUT("장기대여중");

    private final String dbCode;

    LendRecordStatus(String dbCode) {
        this.dbCode = dbCode;
    }
}
