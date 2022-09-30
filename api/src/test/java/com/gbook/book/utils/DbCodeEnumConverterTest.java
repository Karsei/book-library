package com.gbook.book.utils;

import com.gbook.book.enums.IdeType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DbCodeEnumConverterTest {
    @Test
    void of_success() {
        // given
        String dbCode = "visual studio code";

        // when
        IdeType ideType = DbCodeEnumConverter.ofDbCode(IdeType.class, dbCode);

        // then
        assertNotNull(ideType);
        assertEquals(IdeType.VSCODE, ideType);
    }

    @Test
    void of_fail_notFound() {
        // given
        String dbCode = "visual studio";

        // when
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> DbCodeEnumConverter.ofDbCode(IdeType.class, dbCode));

        // then
        assertNotNull(e);
        assertEquals("enum=[com.gbook.book.enums.IdeType], dbCode=[visual studio] 가 존재하지 않습니다.", e.getMessage());
    }

    @Test
    void to_success() {
        // given
        IdeType ideType = IdeType.VSCODE;

        // when
        String dbCode = DbCodeEnumConverter.toDbCode(ideType);

        // then
        assertNotNull(dbCode);
        assertEquals("visual studio code", dbCode);
    }

    @Test
    void to_fail_notFound() {
        // given
        IdeType ideType = null;

        // when
        String dbCode = DbCodeEnumConverter.toDbCode(ideType);

        // then
        assertNotNull(dbCode);
        assertEquals("", dbCode);
    }
}