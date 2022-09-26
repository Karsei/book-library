package com.gbook.book.configs.converters;

import com.gbook.book.domains.ArticleType;

import javax.persistence.Converter;

@Converter
public class ArticleTypeConverter extends AbstractDbCodeToEnumConverter<ArticleType> {
    public static final String ENUM_NAME = "게시글종류";

    public ArticleTypeConverter() {
        super(ArticleType.class, ENUM_NAME);
    }
}
