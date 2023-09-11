package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhaseServiceTest {
    private PhaseService phaseService;

    @Before
    public void init() {
        phaseService = new PhaseService();
    }

    @Test
    public void shouldReturnWord1IsLonger() {
        assertEquals("word 1 is longer", phaseService.compareStrings("aaaaaaaaa", "a"));
    }

    @Test
    public void shouldReturnWord2IsLonger() {
        assertEquals("word 2 is longer", phaseService.compareStrings("a", "bbb"));
    }

    @Test
    public void shouldReturnWordsAreSameAndLongerThan5() {
        assertEquals("the same longer than 5", phaseService.compareStrings("abcdef", "abcdef"));
    }

    @Test
    public void shouldReturnWordsAreTHeSame() {
        String result = phaseService.compareStrings("asd", "asd");
    }
}