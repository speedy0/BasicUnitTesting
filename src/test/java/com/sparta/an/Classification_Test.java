package com.sparta.an;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Test {
    @Test
    @DisplayName("If Age is less than 12")
    void ifAgeIsLessThan12(){
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications(11));
    }

    @Test
    @DisplayName("If Age is less than 15")
    void ifAgeIsLessThan15(){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications(14));
    }

    @Test
    @DisplayName("If Age is 15")
    void ifAgeIs15(){
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(15));
    }
}
