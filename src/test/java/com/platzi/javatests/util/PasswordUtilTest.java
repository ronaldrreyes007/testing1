package com.platzi.javatests.util;

import Util.PasswordUtil;
import org.junit.Test;

import static Util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
       assertEquals(WEAK, PasswordUtil.assessPassword("12300!"));
    }
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghk"));
    }
    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }
    @Test
    public void strong_when_has_letters_and_numbers_and_simbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));

    }
}