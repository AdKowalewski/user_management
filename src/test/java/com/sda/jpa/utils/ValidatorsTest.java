package com.sda.jpa.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorsTest {

    @org.junit.jupiter.api.Test

    @ParameterizedTest
    @ValueSource(strings = {
            "2020-01-01T12:00:00",
            "2019-12-12T00:00:00",
            "2019-12-12T23:59:59"
    })
    void shouldPassValidateDatetimeTests(String in) {
        // given
        // when
        boolean returned = Validators.validateDateTime(in);
        // then
        assertFalse(returned);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "2020-01-01R12:00:00",
            "2019-23-12T00:00:00",
            "2019-12-12T25:59:59"
    })
    void shouldFailValidateDatetimeTests(String in) {
        // given
        // when
        boolean returned = Validators.validateDateTime(in);
        // then
        assertFalse(returned);
    }
}