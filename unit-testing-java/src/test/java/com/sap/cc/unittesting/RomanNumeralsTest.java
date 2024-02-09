package com.sap.cc.unittesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @BeforeEach
    public void setup() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void toArabic_RomanNumeral_I_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("I")).isEqualTo(1);
    }
    @Test
    public void toArabic_RomanNumeral_V_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("V")).isEqualTo(5);
    }
    @Test
    public void toArabic_RomanNumeral_M_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("M")).isEqualTo(1000);
    }
    @Test
    public void toArabic_RomanNumeral_Invalid_ReturnsErrorValue() {
        assertThat(romanNumerals.toArabic("Invalid")).isEqualTo(-1);
    }
    @Test
    public void toArabic_RomanNumeral_Null_ReturnsErrorValue() {
        assertThat(romanNumerals.toArabic(null)).isEqualTo(-1);
    }
    @Test
    public void toArabic_RomanNumeral_EmptyString_ReturnsErrorValue() {
        assertThat(romanNumerals.toArabic("")).isEqualTo(-1);
    }

    @Test
    public void toArabic_RomanNumeral_InvalidCombination_ReturnsErrorValue() {
        assertThat(romanNumerals.toArabic("XXL")).isEqualTo(-1);
    }
    //Additive and Subtractive Numerals
    @Test
    public void toArabic_RomanNumeral_II_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("II")).isEqualTo(2);
    }

    @Test
    public void toArabic_RomanNumeral_VI_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("VI")).isEqualTo(6);
    }

    @Test
    public void toArabic_RomanNumeral_CXI_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("CXI")).isEqualTo(111);
    }

    @Test
    public void toArabic_RomanNumeral_IV_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("IV")).isEqualTo(4);
    }

    @Test
    public void toArabic_RomanNumeral_XL_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("XL")).isEqualTo(40);
    }

    @Test
    public void toArabic_RomanNumeral_XC_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("XC")).isEqualTo(90);
    }
    // Complex Numeralss
    @Test
    public void toArabic_RomanNumeral_XIV_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("XIV")).isEqualTo(14);
    }

    @Test
    public void toArabic_RomanNumeral_CMXL_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("CMXL")).isEqualTo(940);
    }

    @Test
    public void toArabic_RomanNumeral_MMXXI_ReturnsArabicEquivalent() {
        assertThat(romanNumerals.toArabic("MMXXI")).isEqualTo(2021);
    }


}
