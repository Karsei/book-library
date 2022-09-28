package com.gbook.book.entities;

import com.gbook.book.configs.converters.BookAuthorTypeConverter;
import com.gbook.book.domains.BookAuthorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(
        name = "BOOK_AUTHORS",
        indexes = @Index(
                name = "FK_BOOK_AUTHORS_AUTHOR",
                columnList = "AUTHOR_ID"
        )
)
@IdClass(BookAuthorsId.class)
@DynamicInsert @DynamicUpdate
public class BookAuthors {
    @Id
    @Column(name = "BOOK_ID", nullable = false)
    private Long bookId;

    @Id
    @Column(name = "AUTHOR_ID", nullable = false)
    private Long authorId;

    @Id
    @Convert(converter = BookAuthorTypeConverter.class)
    @Column(name = "TYPE", nullable = false)
    private BookAuthorType type;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;
}
