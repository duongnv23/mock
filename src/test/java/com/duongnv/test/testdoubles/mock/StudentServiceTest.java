package com.duongnv.test.testdoubles.mock;

import com.duongnv.test.testdoubles.dummy.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentServiceTest {

    private StudentService service = new StudentService();
    private StudentServiceMockObject mockObject = new StudentServiceMockObject();

    @Test
    public void enrolls_students() {
//create 2 students
        Student bob = new Student("001", "Robert Anthony");
        Student roy = new Student("002", "Roy Noon");
//set mock/spy
        service.setMock(mockObject);
//invoke method twice
        service.enrollToCourse("english", bob);
        service.enrollToCourse("history", roy);
//assert that the method was invoked twice
        assertEquals(2,
                mockObject.invocation("enrollToCourse"));
//verify wrong information, that enrollToCourse was
//invoked once, but actually it is invoked twice
        mockObject.verify("enrollToCourse", 1);
    }
}