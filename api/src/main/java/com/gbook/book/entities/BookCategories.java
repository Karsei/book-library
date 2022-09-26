package com.gbook.book.entities;

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
@Table(name = "BOOK_CATEGORIES")
@DynamicInsert @DynamicUpdate
@IdClass(BookCategoriesId.class)
public class BookCategories {
    @Id
    @Column(name = "BOOK_ID", nullable = false)
    private Long bookId;

    @Id
    @Column(name = "CATEGORY_ID", nullable = false)
    private Long categoryId;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;
}
