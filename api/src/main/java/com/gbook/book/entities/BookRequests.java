package com.gbook.book.entities;

import com.gbook.book.configs.converters.BookRequestDestinationConverter;
import com.gbook.book.configs.converters.BookRequestStatusConverter;
import com.gbook.book.domains.BookRequestDestination;
import com.gbook.book.domains.BookRequestStatus;
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
@Table(name = "BOOK_REQUESTS")
@DynamicInsert @DynamicUpdate
public class BookRequests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "USER_NO", nullable = false)
    private Long userNo;

    @Convert(converter = BookRequestDestinationConverter.class)
    @Column(name = "DESTINATION", nullable = false)
    private BookRequestDestination destination;

    @Column(name = "BOOK_TITLE", nullable = false)
    private String bookTitle;

    @Column(name = "BOOK_AUTHOR", nullable = false)
    private String bookAuthor;

    @Column(name = "YES24_URL")
    private String yes24Url;

    @Convert(converter = BookRequestStatusConverter.class)
    @Column(name = "STATUS", nullable = false)
    private BookRequestStatus status;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;
}
