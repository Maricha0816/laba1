package org.example;

import java.util.List;

public class Converter {
    public static String convertArabicToRoman(int number){

        if ((number <= 0) || (number > 3999999)) {
            return null;
        }
        List<MashaNumber> romanNumerals = MashaNumber.getReverseList();
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            if (romanNumerals.get(i).getValue() <= number) {
                sb.append(romanNumerals.get(i).name());
                number -= romanNumerals.get(i).getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
