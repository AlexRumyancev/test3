package ru.vniims.test_teamcity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("/application-test.properties")
class LiveTest {

    @Test
    void getTest() {

    }
}