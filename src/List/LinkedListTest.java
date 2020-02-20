package List;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class LinkedListTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(4L, "Ghizo", "idrissi");
        Employee emp2 = new Employee(1L, "Samir", "vic");
        Employee emp3 = new Employee(2L, "Amine", "Kamizaki");

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(emp1);
        list.addFirst(emp2);
        list.addFirst(emp3);

        showData().accept(list);

        // ----------- Add && addLast -----------
        // list.add(new Employee(4L, "Bill", "END"));
        list.addLast(new Employee(4L, "Bill", "END"));
        showData().accept(list);

        // ----------- Remove first & last-----------
        list.removeFirst();
        showData().accept(list);

        list.removeLast();
        showData().accept(list);
    }

    public static Consumer showData() {
        Consumer<List<Employee>> consumer = data -> {
            System.out.print("Head =>");
            for (Employee e : data) {
                System.out.print(e);
                System.out.print(" <=> ");
            }
            System.out.println("End");
        };
        return consumer;
    }
}
