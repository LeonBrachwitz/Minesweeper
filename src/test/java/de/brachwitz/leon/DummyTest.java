package de.brachwitz.leon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DummyTest
{
    private Dummy sut = new Dummy();

    @Test
    @DisplayName("Dummy Sollte")
    public void test01()
    {
        final var erwartet = Integer.valueOf(10);
        final var ergebnis = sut.dummyMethode(5,5);

        assertThat(erwartet).isEqualTo(ergebnis);
    }
}
