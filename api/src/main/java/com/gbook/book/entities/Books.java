package com.gbook.book.entities;

import com.gbook.book.configs.converters.BookStatusConverter;
import com.gbook.book.configs.converters.YesNoConverter;
import com.gbook.book.domains.BookStatus;
import com.gbook.book.domains.YesNo;
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
        name = "BOOKS",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_book_code",
                        columnNames={"ID", "BOOK_CODE"}
                )
        }
)
@DynamicInsert @DynamicUpdate
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "BOOK_CODE", nullable = false)
    private Long bookCode;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PREFIX_TITLE")
    private String prefixTitle;

    @Column(name = "SUFFIX_TITLE")
    private String suffixTitle;

    @Column(name = "FEATURE")
    private String feature;

    @Column(name = "ORIGIN_TITLE")
    private String originTitle;

    @Column(name = "PUBLISHER")
    private String publisher;

    @Column(name = "PUBLICATION_DATE")
    private LocalDateTime publicationDate;

    @Column(name = "PAGE")
    private String page;

    @Column(name = "SIZE")
    private String size;

    @Column(name = "WEIGHT")
    private String weight;

    @Column(name = "ISBN10")
    private String isbn10;

    @Column(name = "ISBN13")
    private String isbn13;

    @Column(name = "COVER_IMG_URL")
    private String coverImgUrl;

    @Convert(converter = YesNoConverter.class)
    @Column(name = "IS_COVER_IMG_COPY", nullable = false)
    private YesNo isCoverImgCopy;

    @Convert(converter = BookStatusConverter.class)
    @Column(name = "STATUS", nullable = false)
    private BookStatus status;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "INTRODUCE")
    private String introduce;

    @Column(name = "PLACE")
    private String place;

    @Column(name = "INFO_URL")
    private String infoUrl;

    @Column(name = "DONOR_USER_NO")
    private Long donorUserNo;

    @Column(name = "BOOKCASE_CATEGORY_CODE")
    private String bookcaseCategoryCode;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;
}
