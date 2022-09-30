package com.gbook.book.repositories;

import com.gbook.book.entities.Books;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void findById_present() {
        // given
        Long bookId = 1L;

        // when
        Optional<Books> book = bookRepository.findById(bookId);

        // then
        assertTrue(book.isPresent());
    }

    @Test
    void findById_empty() {
        // given
        Long bookId = 0L;

        // when
        Optional<Books> book = bookRepository.findById(bookId);

        // then
        assertTrue(book.isEmpty());
    }
}