package com.gbook.book.repositories;

import com.gbook.book.entities.Authors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class AuthorsRepositoryTest {
    @Autowired
    private AuthorsRepository authorsRepository;

    @Test
    void findByName_present() {
        // given
        String name = "김경민";

        // when
        Optional<Authors> author = authorsRepository.findByName(name);

        // then
        assertTrue(author.isPresent());
    }

    @Test
    void findByName_empty() {
        // given
        String name = "대한민국만만세만세만세";

        // when
        Optional<Authors> author = authorsRepository.findByName(name);

        // then
        assertTrue(author.isEmpty());
    }
}