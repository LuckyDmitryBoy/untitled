package javarush;
import java.util.ArrayList;
import java.util.List;
public class University {
    public List<String> students;

    public University() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        for (String student : students) {}
        for (String student : students){if (student.equals(excludedStudent)) {
                students.remove(student);}
        }
    }

    public static void main(String[] args) {
        University universityGroup = new University();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
