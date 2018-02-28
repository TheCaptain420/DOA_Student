public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      //printer alle studenter
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [Årgang : " + student.getAargang() + ", Name : " + student.getName() + " ]");
      }


      //updatere studenter
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      //getter studenter
      studentDao.getStudent(0);
      System.out.println("Student: [Årgang : " + student.getAargang() + ", Name : " + student.getName() + " ]");
   }
}