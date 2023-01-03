package com.example.task;


import com.example.task.config.ContainersEnvironment;
import com.example.task.entities.Student;
import com.example.task.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringTestContainerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentRepositoryTest extends ContainersEnvironment {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void When_GetStudents_Expect_EmptyList(){
        List<Student> list = studentRepository.findAll();
        assertEquals(0,list.size());
    }
}
