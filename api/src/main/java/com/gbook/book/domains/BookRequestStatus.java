package com.gbook.book.domains;

import lombok.Getter;

@Getter
public enum BookRequestStatus implements DbCommonType {
    REQUEST("요청"),
    SOLD_OUT("구매불가(품절)"),
    ONGOING_BUY("구매중"),
    CANCEL_REGIST("신청취소"),
    DONE_PLACE("비치완료"),
    REFER("반려(소장중)"),
    ONGOING_BUY_RESERVED("구매중(예약판매)"),
    ONGOING_BUY_DELAYED("구매중(재고부족지연)"),
    DELIVERED_IDC("IDC전달완료"),
    ONGOING_BUY_WCENTER("구매중(W센터)"),
    DELIVERED_WCENTER("W센터전달완료");

    private final String dbCode;

    BookRequestStatus(String dbCode) {
        this.dbCode = dbCode;
    }
}
