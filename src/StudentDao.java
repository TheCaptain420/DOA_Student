import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int aargang);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}
