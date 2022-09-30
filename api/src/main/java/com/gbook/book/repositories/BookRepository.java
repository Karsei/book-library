package com.gbook.book.repositories;

import com.gbook.book.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
    /**
     * 도서 고유 번호로 하나의 도서를 조회합니다.
     * @param id 도서 고유 번호
     * @return 도서
     */
    Optional<Books> findById(Long id);

    /**
     * 요청하는 QR 코드에 해당되는 도서가 존재하는지 확인합니다.
     * @param bookCode QR 코드
     * @return 있으면 {@code true}; 없으면 {@code false}
     */
    boolean existsByBookCode(Long bookCode);
}
