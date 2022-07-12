import java.util.*;
import java.util.stream.Collectors;

public class StreamHighestEmployee {

    String empName;
    int salary;

    StreamHighestEmployee(String empName, int salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return this.empName;
    }

    public int getSalary() {
        return this.salary;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        StreamHighestEmployee emp1 = new StreamHighestEmployee("Aman", 123553);
        StreamHighestEmployee emp2 = new StreamHighestEmployee("Kshitij", 67722);
        StreamHighestEmployee emp3 = new StreamHighestEmployee("Anshika", 5663442);

        List<StreamHighestEmployee> empList = new ArrayList<StreamHighestEmployee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        List<StreamHighestEmployee> highestEmpList = empList.stream()
                .sorted(Comparator.comparing(StreamHighestEmployee::getSalary))
                .collect(Collectors.toList());
        int lastIndex = highestEmpList.size() - 1;
        System.out.println(highestEmpList.get(lastIndex).getSalary());

    }
}