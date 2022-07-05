package knowledge;

import java.util.Arrays;
import java.util.List;

public class EmployeeManager {

    private static Employee[] employees = new Employee[10];
    // Arrays need to know their size upfront so if you know the size of your list upfront like how
    // big it's supposed to be why use more space memory than actually required
    // if you need to add more space to the array you will need to override the array with a new array
    // that has more space. Now that can be annoying when you have an employee set that can grow and grow
    // and idk how many employees I want to add, I might just keep adding employees, and this will
    // require me to ask the system to add new space to the array everytime I run out of capacity
    // take current array copy it into a bigger array


    private static List<Employee> employeesAsList = Arrays.asList();
    // a list on the other hand is dynamic, it doesn't require me to specify the capacity upfront and I
    // can continue to add new space dynamically because behind the scenes when the list reaches a limit
    // it will add space itself, so I don't have to manually do it myself
    // When you want to use the List you have to use the List keyword and specify what data type you are putting
    // into that list

    // add(), remove(), size(), set(), get(), clear()

    public static void main(String[] args) {
        employees[0] = new Employee();
    }
}
