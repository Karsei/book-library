package com.gbook.book.repositories;

import com.gbook.book.entities.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {
    /**
     * 저자 이름을 조회합니다.
     * @param name 이름
     * @return 저자
     */
    Optional<Authors> findByName(String name);
}
