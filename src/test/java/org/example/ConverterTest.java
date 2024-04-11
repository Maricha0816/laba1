package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {
    @Test
    public void whenNumberIsOutOfRangeThenNull() {
        assertNull(Converter.convertArabicToRoman(0));
        assertNull(Converter.convertArabicToRoman(-1));
        assertNull(Converter.convertArabicToRoman(4000000));
    }

    @Test
    public void whenNumberIs_1Then_I() {
        assertEquals("I", Converter.convertArabicToRoman(1));
    }

    @Test
    public void whenNumberIs_3Then_III() {
        assertEquals("III", Converter.convertArabicToRoman(3));
    }

    @Test
    public void whenNumberIs_8Then_VIII() {
        assertEquals("VIII", Converter.convertArabicToRoman(8));
    }

    @Test
    public void whenNumberIs_10Then_X() {
        assertEquals("X", Converter.convertArabicToRoman(10));
    }

    @Test
    public void whenNumberIs_16Then_XVI() {
        assertEquals("XVI", Converter.convertArabicToRoman(16));
    }

    @Test
    public void whenNumberIs_19Then_XIX() {
        assertEquals("XIX", Converter.convertArabicToRoman(19));
    }

    @Test
    public void whenNumberIs_40Then_XL() {
        assertEquals("XL", Converter.convertArabicToRoman(40));
    }

    @Test
    public void whenNumberIs_46Then_XLVI() {
        assertEquals("XLVI", Converter.convertArabicToRoman(46));
    }

    @Test
    public void whenNumberIs_50Then_L() {
        assertEquals("L", Converter.convertArabicToRoman(50));
    }

    @Test
    public void whenNumberIs_73Then_LXXIII() {
        assertEquals("LXXIII", Converter.convertArabicToRoman(73));
    }

    @Test
    public void whenNumberIs_98Then_XCVIII() {
        assertEquals("XCVIII", Converter.convertArabicToRoman(98));
    }

    @Test
    public void whenNumberIs_112Then_MXII() {
        assertEquals("CXII", Converter.convertArabicToRoman(112));
    }

    @Test
    public void whenNumberIs_434Then_CDXXXIV() {
        assertEquals("CDXXXIV", Converter.convertArabicToRoman(434));
    }

    @Test
    public void whenNumberIs_846Then_DCCCXLVI() {
        assertEquals("DCCCXLVI", Converter.convertArabicToRoman(846));
    }

    @Test
    public void whenNumberIs_999Then_CMXCIX() {
        assertEquals("CMXCIX", Converter.convertArabicToRoman(999));
    }

    @Test
    public void whenNumberIs_1345Then_MCCCXLV() {
        assertEquals("MCCCXLV", Converter.convertArabicToRoman(1345));
    }

    @Test
    public void whenNumberIs_3982Then_MMMCMLXXXII() {
        assertEquals("MMMCMLXXXII", Converter.convertArabicToRoman(3982));
    }

    @Test
    public void whenNumberIs_6789Then__VMDCCLXXXIX() {
        assertEquals("_VMDCCLXXXIX", Converter.convertArabicToRoman(6789));
    }

    @Test
    public void whenNumberIs_8347Then__VMMMCCCXLVII() {
        assertEquals("_VMMMCCCXLVII", Converter.convertArabicToRoman(8347));
    }

    @Test//20
    public void whenNumberIs_9999Then__I_XCMXCIX() {
        assertEquals("_I_XCMXCIX", Converter.convertArabicToRoman(9999));
    }

    @Test
    public void whenNumberIs_13456Then__XMMMCDLVI() {
        assertEquals("_XMMMCDLVI", Converter.convertArabicToRoman(13456));
    }

    @Test
    public void whenNumberIs_34567Then__X_X_X_I_VDLXVII() {
        assertEquals("_X_X_X_I_VDLXVII", Converter.convertArabicToRoman(34567));
    }

    @Test
    public void whenNumberIs_75310Then__L_X_X_VCCCX() {
        assertEquals("_L_X_X_VCCCX", Converter.convertArabicToRoman(75310));
    }

    @Test
    public void whenNumberIs_83452Then__L_X_X_XMMMCDLII() {
        assertEquals("_L_X_X_XMMMCDLII", Converter.convertArabicToRoman(83452));
    }

    @Test//25
    public void whenNumberIs_99999Then__X_C_I_XCMXCIX() {
        assertEquals("_X_C_I_XCMXCIX", Converter.convertArabicToRoman(99999));
    }

    @Test
    public void whenNumberIs_193462Then__C_X_CMMMCDLXII() {
        assertEquals("_C_X_CMMMCDLXII", Converter.convertArabicToRoman(193462));
    }

    @Test
    public void whenNumberIs_458673Then__C_D_L_VMMMDCLXXIII() {
        assertEquals("_C_D_L_VMMMDCLXXIII", Converter.convertArabicToRoman(458673));
    }

    @Test
    public void whenNumberIs_571324Then__D_L_X_XMCCCXXIV() {
        assertEquals("_D_L_X_XMCCCXXIV", Converter.convertArabicToRoman(571324));
    }

    @Test
    public void whenNumberIs_834322Then__D_C_C_C_X_X_X_I_VCCCXXII() {
        assertEquals("_D_C_C_C_X_X_X_I_VCCCXXII", Converter.convertArabicToRoman(834322));
    }

    @Test//30
    public void whenNumberIs_1245893Then__M_C_C_X_L_VDCCCXCIII() {
        assertEquals("_M_C_C_X_L_VDCCCXCIII", Converter.convertArabicToRoman(1245893));
    }

    @Test
    public void whenNumberIs_1349502Then__M_C_C_C_X_L_I_XDII() {
        assertEquals("_M_C_C_C_X_L_I_XDII", Converter.convertArabicToRoman(1349502));
    }

    @Test
    public void whenNumberIs_1725648Then__M_D_C_C_X_X_VDCXLVIII() {
        assertEquals("_M_D_C_C_X_X_VDCXLVIII", Converter.convertArabicToRoman(1725648));
    }

    @Test
    public void whenNumberIs_2457894Then__M_M_C_D_L_VMMDCCCXCIV() {
        assertEquals("_M_M_C_D_L_VMMDCCCXCIV", Converter.convertArabicToRoman(2457894));
    }

    @Test
    public void whenNumberIs_2658974Then__M_M_D_C_L_VMMMCMLXXIV() {
        assertEquals("_M_M_D_C_L_VMMMCMLXXIV", Converter.convertArabicToRoman(2658974));
    }

    @Test//35
    public void whenNumberIs_2897564Then__M_M_D_C_C_C_X_C_VMMDLXIV() {
        assertEquals("_M_M_D_C_C_C_X_C_VMMDLXIV", Converter.convertArabicToRoman(2897564));
    }

    @Test
    public void whenNumberIs_3125478Then__M_M_M_C_X_X_VCDLXXVIII() {
        assertEquals("_M_M_M_C_X_X_VCDLXXVIII", Converter.convertArabicToRoman(3125478));
    }

    @Test
    public void whenNumberIs_3256879Then__M_M_M_C_C_L_VMDCCCLXXIX() {
        assertEquals("_M_M_M_C_C_L_VMDCCCLXXIX", Converter.convertArabicToRoman(3256879));
    }

    @Test
    public void whenNumberIs_3598746Then__M_M_M_D_X_C_VMMMDCCXLVI() {
        assertEquals("_M_M_M_D_X_C_VMMMDCCXLVI", Converter.convertArabicToRoman(3598746));
    }

    @Test//39
    public void whenNumberIs_3999999Then__M_M_M_C_M_X_C_I_XCMXCIX() {
        assertEquals("_M_M_M_C_M_X_C_I_XCMXCIX", Converter.convertArabicToRoman(3999999));
    }
}