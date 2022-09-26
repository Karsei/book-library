package com.gbook.book.domains;

import lombok.Getter;

@Getter
public enum BookStatus implements DbCommonType {
    WAIT_REGIST("등록대기"),
    AVAILABLE_LEND("대출가능"),
    CHECKED_OUT("대출중"),
    WAIT_PLACE("비치대기"),
    LOST("분실"),
    CHECKED_OUT_FOR_STUDY("스터디대출"),
    FOR_DISPLAY("전시용"),
    DIGITIZATION("디지털화"),
    LONG_TERM_CHECKED_OUT("장기대여"),
    PERISHED_DAMAGE("훼손폐기"),
    PERISHED("폐기");

    private final String dbCode;

    BookStatus(String dbCode) {
        this.dbCode = dbCode;
    }
}
