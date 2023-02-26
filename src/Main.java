package com.engeto.autobazar;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CarData carData = new CarData("Ford Perfect 107E",
                                        LocalDate.of(2010,11,10), 8.35,
                                        1, "Karel Dvorak",
                                        BigDecimal.valueOf(89_999.90), true);

        System.out.println(carData.getBrandAndModel());
    }
}
