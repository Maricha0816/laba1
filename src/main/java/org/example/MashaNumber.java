package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum MashaNumber {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000),
    _I_V(4000),_V(5000),_I_X(9000),_X(10000),
    _X_L(40000),_L(50000),_X_C(90000),_C(100000),
    _C_D(400000),_D(500000),_C_M(900000),_M(1000000);


    private final int value;
    MashaNumber(int i) {
        this.value=i;
    }

    public int getValue() {return value;
    }
    public static List<MashaNumber> getReverseList() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((MashaNumber e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}
