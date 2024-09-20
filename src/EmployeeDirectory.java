import java.util.ArrayList;
import java.util.List;

class EmployeeDirectory {
    private List<Employee> employees;  // Коллекция для хранения сотрудников

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    // Метод добавления нового сотрудника в справочник
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод поиска сотрудников по стажу
    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }
    // Метод возвращает номера телефонов сотрудников по имени
    public List<String> findPhonesByName(String name) {
        List<String> phones = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                phones.add(employee.getPhone());
            }
        }
        return phones;
    }

    // Метод поиска сотрудника по табельному номеру
    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;  // Если сотрудник не найден
    }
}

