package com.gbook.book.configs.converters;

import com.gbook.book.domains.LendRecordStatus;

import javax.persistence.Converter;

@Converter
public class LendRecordStatusConverter extends AbstractDbCodeToEnumConverter<LendRecordStatus> {
    public static final String ENUM_NAME = "대출기록상태";

    public LendRecordStatusConverter() {
        super(LendRecordStatus.class, ENUM_NAME);
    }
}
