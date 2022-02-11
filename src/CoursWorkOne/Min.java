package CoursWorkOne;

public class Min {
    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public static void printAllAboutEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static void printSunMonthlySalary(Employee[] employees) {
        float sumMonthlySalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumMonthlySalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + sumMonthlySalary);
    }

    public static void printAveradgeSunMonthlySalary(Employee[] employees) {
        float averadgeSunMonthlySalary = 0;
        float sumMonthlySalary = 0;
        int numCounter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumMonthlySalary += employee.getSalary();
                numCounter++;
            }
        }
        averadgeSunMonthlySalary = sumMonthlySalary / numCounter;
        System.out.println("Среднее значение зарплаты в месяц: " + averadgeSunMonthlySalary);
    }

    public static void printMaxSalary(Employee[] employees) {
        float maxSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Максимальная зарплата у сотрудника: " + employees[indexEmployee].getFullName() + " и составляет: " + maxSalary);
    }

    public static void printMinSalary(Employee[] employees) {
        float minSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника: " + employees[indexEmployee].getFullName() + " и составляет: " + minSalary);
    }

    public static void printListEmployees(Employee[] employees) {
        System.out.println("Ф.И.О. сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Employee newEmployee = new Employee("Иванов", "Иван", "Иванович", 2, 50_000);
        addEmployee(employees, newEmployee);
        addEmployee(employees, new Employee("Романов", "Олег", "Игоревич", 5, 150_000));
        addEmployee(employees, new Employee("Егоров", "Евгений", "Николаевич", 3, 90_000));
        addEmployee(employees, new Employee("Кирюнина", "Ольга", "Васильевна", 1, 45_000));
        addEmployee(employees, new Employee("Власов", "Вячеслав", "Арнольдович", 3, 80_000));
        addEmployee(employees, new Employee("Петрынькин", "Иван", "Иванович", 4, 66_000));
        addEmployee(employees, new Employee("Козлов", "Игорь", "Александрович", 3, 37_000));
        addEmployee(employees, new Employee("Рыбкина", "Татьяна", "Вячеславовна", 2, 98_000));
        addEmployee(employees, new Employee("Шерин", "Петр", "Романович", 1, 52_000));
        addEmployee(employees, new Employee("Алехина", "Виктория", "Степановна", 3, 78_000));

        printAllAboutEmployee(employees);
        printSunMonthlySalary(employees);
        printAveradgeSunMonthlySalary(employees);
        printMaxSalary(employees);
        printMinSalary(employees);
        printListEmployees(employees);
    }
}