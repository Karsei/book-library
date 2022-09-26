package com.gbook.book.entities;

import com.gbook.book.configs.converters.LendRecordStatusConverter;
import com.gbook.book.domains.LendRecordStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "LEND_RECORDS")
@DynamicInsert @DynamicUpdate
public class LendRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "BOOK_ID", nullable = false)
    private Long bookId;

    @Column(name = "USER_NO", nullable = false)
    private Long userNo;

    @Convert(converter = LendRecordStatusConverter.class)
    @Column(name = "STATUS", nullable = false)
    private LendRecordStatus status;

    @Column(name = "LEND_DATE", nullable = false)
    private LocalDateTime lendDate;

    @Column(name = "RETURN_DUE_DATE", nullable = false)
    private LocalDate returnDueDate;

    @Column(name = "RETURN_DATE")
    private LocalDateTime returnDate;

    @Column(name = "IS_LONGTERM_LENDING")
    private Integer isLongTermLending;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;
}
