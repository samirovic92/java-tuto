package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "Samir", "vic"));
        employees.add(new Employee(2L, "Amine", "Kamizaki"));
        employees.add(new Employee(4L, "Ghizo", "idrissi"));

        System.out.println("------- Add -------");
        employees.add(2, new Employee(3L, "Zineb", "Baz"));
        employees.forEach(System.out::println);

        System.out.println("------- Set -------");
        employees.set(0, new Employee(100L,  "Boss", "Samirovic"));
        employees.forEach(System.out::println);

        System.out.println("------- Remove -------");
        employees.remove(0);
        employees.forEach(System.out::println);

        System.out.println("------- Contains & index -------");
        System.out.println(employees.contains( new Employee(2L, "Amine", "Kamizaki")) );
        System.out.println(employees.indexOf( new Employee(2L, "Amine", "Kamizaki")) );

    }

}
