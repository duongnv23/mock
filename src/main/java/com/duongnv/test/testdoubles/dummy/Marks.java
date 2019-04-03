package com.duongnv.test.testdoubles.dummy;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Marks {
    private final Student student;
    private final String subjectId;
    private final BigDecimal marks;
}
