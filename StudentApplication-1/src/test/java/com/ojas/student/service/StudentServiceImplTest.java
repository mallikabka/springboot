package com.ojas.student.service;
	import static org.junit.jupiter.api.Assertions.*;
	import static org.mockito.Mockito.*;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Optional;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.MockitoAnnotations;
	import com.ojas.student.entity.Student;
	import com.ojas.student.exceptions.StudentNotFoundException;
	import com.ojas.student.repo.StudentRepo;

	class StudentServiceImplTest {

	    @Mock
	    private StudentRepo repo;

	    @InjectMocks
	    private StudentServiceImpl service;

	    @BeforeEach
	    void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    void getAllStudentsTest() {
	        when(repo.findAll()).thenReturn(Arrays.asList(new Student("John", "CS"), new Student("Jane", "EE")));
	        List<Student> students = service.getAllStudents();
	        assertEquals(2, students.size());
	    }

	    @Test
	    void getStudentByIdTest() {
	        Student student = new Student("John", "CS");
	        when(repo.findById(1)).thenReturn(Optional.of(student));
	        Student found = service.getStudentById(1);
	        assertEquals("John", found.getName());
	    }

	    @Test
	    void deleteStudentByIdTest() {
	        int id = 1;
	        Student student = new Student("John", "CS");
	        when(repo.findById(id)).thenReturn(Optional.of(student));
	        String response = service.deleteStudentById(id);
	        verify(repo, times(1)).deleteById(id);
	        assertEquals("deleted", response);
	    }

	    @Test
	    void deleteStudentByIdNotFoundTest() {
	        int id = 1;
	        when(repo.findById(id)).thenThrow(new StudentNotFoundException("Student with ID " + id + " not found"));
	        
	        Exception exception = assertThrows(StudentNotFoundException.class, () -> {
	            service.deleteStudentById(id);
	        });

	        String expectedMessage = "Student with ID " + id + " not found";
	        String actualMessage = exception.getMessage();

	        assertTrue(actualMessage.contains(expectedMessage));
	    }
	}


