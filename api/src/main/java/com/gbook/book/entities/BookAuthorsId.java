package com.gbook.book.entities;

import com.gbook.book.domains.BookAuthorType;

import javax.persistence.Column;
import java.io.Serializable;

public class BookAuthorsId implements Serializable {
    @Column(name = "BOOK_ID")
    private Long bookId;

    @Column(name = "AUTHOR_ID")
    private Long authorId;

    @Column(name = "TYPE")
    private BookAuthorType type;
}
