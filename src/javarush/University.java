package javarush;
import java.util.ArrayList;
import java.util.List;
public class University {
    public List<String> students;

    public University() {
        students = new ArrayList<>();
        students.add("������ ����������");
        students.add("������� ���������");
        students.add("������ ���������");
        students.add("������� ����������");
        students.add("��� ���������");
        students.add("������� �������");
        students.add("������� ����������");
    }

    public void exclude(String excludedStudent) {
        for (String student : students) {}
        for (String student : students){if (student.equals(excludedStudent)) {
                students.remove(student);}
        }
    }

    public static void main(String[] args) {
        University universityGroup = new University();
        universityGroup.exclude("������� ���������");
        universityGroup.students.forEach(System.out::println);
    }
}
