package UF2.EstudiantCurs;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Course course = new Course();

        String studentName = student.getName();
        int studentAge = student.getAge();

        if(student.isOverEighteen(studentAge)) {
            student.greet(studentName);
            student.showInfo(studentName, studentAge);
        } else {
            System.out.println("El estudiante " + studentName + " es menor.");
        }

        int courseCredits = course.getCredits();
        int courseHours = course.getHours(courseCredits);

        course.showInfo("Matematica", courseHours);
    }
}
