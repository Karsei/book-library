package com.gbook.book.entities;

import javax.persistence.Column;
import java.io.Serializable;

public class BookCategoriesId implements Serializable {
    @Column(name = "BOOK_ID")
    private Long bookId;

    @Column(name = "CATEGORY_ID")
    private Long categoryId;
}
