package com.gbook.book.entities;

import com.gbook.book.configs.converters.YesNoStringToBooleanConverter;
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
@Table(name = "USERS")
@DynamicInsert @DynamicUpdate
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_NO", nullable = false)
    private Long userNo;

    @Column(name = "USER_ID", nullable = false)
    private String userId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Convert(converter = YesNoStringToBooleanConverter.class)
    @Column(name = "IS_ADMIN", nullable = false)
    private Boolean admin;

    @Column(name = "EBOOK_LIB_PASSWD")
    private String ebookLibPassword;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;
}
