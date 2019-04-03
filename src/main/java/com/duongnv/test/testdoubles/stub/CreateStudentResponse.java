package com.duongnv.test.testdoubles.stub;

import com.duongnv.test.testdoubles.dummy.Student;
import lombok.Data;

@Data
public class CreateStudentResponse {

    private final String errorMessage;
    private final Student student;

    public boolean isSuccess() {
        return null == errorMessage;
    }
}
