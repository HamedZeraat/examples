package streams;

import java.util.List;

public class SalaryMin {
    private static List<Employee> googlers = EmployeeSamples.getGooglers();

    public static int min1() {
        return googlers.stream()
                .mapToInt(Employee::getSalary)
                .min()
                .orElse(Integer.MAX_VALUE);
    }

    public static int min2() {
        return googlers.stream()
                .map(Employee::getSalary)
                .min((n1, n2) -> n1 - n2)
                .orElse(Integer.MAX_VALUE);
    }

    public static int min3() {
        return googlers.stream()
                .map(Employee::getSalary)
                .reduce(Integer.MAX_VALUE, Integer::min);

    }

}
