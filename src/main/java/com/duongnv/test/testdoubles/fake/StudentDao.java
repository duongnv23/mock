package com.duongnv.test.testdoubles.fake;

import com.duongnv.test.testdoubles.dummy.Student;

import java.util.List;

public interface StudentDao {

    void batchUpdate(List<Student> students);
}
