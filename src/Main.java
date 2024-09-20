import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавляем сотрудников
        directory.addEmployee(new Employee(101, "795551234", "Yana", 5));
        directory.addEmployee(new Employee(102, "795555678", "Yulya", 3));
        directory.addEmployee(new Employee(103, "795559876", "Anna", 2));

        // Поиск по стажу
        List<Employee> employeesWith5Years = directory.findEmployeesByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (Employee employee : employeesWith5Years) {
            System.out.println(employee);
        }

        // Поиск по имени
        List<String> phonesForJohn = directory.findPhonesByName("Anna");
        System.out.println("\nНомера телефонов для Anna:");
        for (String phone : phonesForJohn) {
            System.out.println(phone);
        }

        // Поиск по табельному номеру
        Employee employeeById = directory.findEmployeeById(102);
        System.out.println("\nСотрудник с табельным номером 102:");
        if (employeeById != null) {
            System.out.println(employeeById);
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }
}