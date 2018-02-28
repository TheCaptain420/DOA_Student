import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   //list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getAargang());
      System.out.println("Student: årgang " + student.getAargang() + ", slettet fra databasse");
   }

   //retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int aargang) {
      return students.get(aargang);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getAargang()).setName(student.getName());
      System.out.println("Student: Årgang " + student.getAargang() + ", updateret i databasen.");
   }
}