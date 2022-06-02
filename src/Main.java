import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> studentSet = new HashSet<>();

        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\").");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(", ");
            try {
                if (studentSet.add(new Student(parts[0], parts[1], parts[2]))) {
                    System.out.println("Студент добавлен в список.\n");
                } else {
                    System.out.println("Проверьте правильность ввода студенческого билета, такой билет уже существует\n");
                }
            } catch (RuntimeException e) {
                System.out.println("Неправильный формат ввода");
                System.out.println("Введите данные в формате \"Иванов Петр Николаевич, 1243-Б, 31231343\"");
            }
        }
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
