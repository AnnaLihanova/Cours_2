package ru.skypro.CourseWork1;


import static ru.skypro.CourseWork1.Min.addEmployee;

public class Middle_Main {
    public static void printIndexingSalary(Employee[] employees) {
        float indexSalary = 0.1f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexSalary);
                System.out.println(employees[i].getFullName() + employees[i].getSalary());
            }
        }
    }

    public static void printDepartmentMaxSalary(Employee[] employees, int department) {
        float maxSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && (employees[i].getSalary() > maxSalary)) {
                maxSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Максимальная зарплата у сотрудника отдела № " + employees[indexEmployee].getDepartment() + " " + employees[indexEmployee].getFullName() + " и составляет: " + maxSalary);
    }

    public static void printDepartmentMinSalary(Employee[] employees, int department) {
        float minSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && (employees[i].getSalary() < minSalary)) {
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника отдела № " + employees[indexEmployee].getDepartment() + " " + employees[indexEmployee].getFullName() + " и составляет: " + minSalary);
    }

    public static void printDepartmentMonthlySalary(Employee[] employees, int department) {
        float sumMonthlyDepartmentSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sumMonthlyDepartmentSalary += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу за месяц: " + sumMonthlyDepartmentSalary);
    }

    public static void printAverageDepartmentSalary(Employee[] employees, int department) {
        float averadgeSunMonthlyDepartmentSalary = 0;
        float sumMonthlyDepartmentSalary = 0;
        int numCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sumMonthlyDepartmentSalary += employees[i].getSalary();
                numCounter++;
            }
        }
        averadgeSunMonthlyDepartmentSalary = sumMonthlyDepartmentSalary / numCounter;
        System.out.println("Среднее значение зарплаты по отделу за месяц: " + averadgeSunMonthlyDepartmentSalary);
    }

    public static void printIndexingDepartmentSalary(Employee[] employees, int department) {
        float indexSalary = (float) 0.1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexSalary);
                System.out.println(employees[i].getFullName() + employees[i].getSalary());
            }
        }
    }

    public static void printAllAboutEmployeeDepartment(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public static void printEmployeeDepartmentWhoHasMin(Employee[] employees, int department, int number) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && employees[i].getSalary() < number) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public static void printEmployeeDepartmentWhoHasMax(Employee[] employees, int department, int number) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && employees[i].getSalary() >= number) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee newEmployee = new Employee("Иванов", "Иван", "Иванович", 2, 50_000);
        addEmployee(employees, newEmployee);
        addEmployee(employees, new Employee("Романов", "Олег", "Игоревич", 5, 150_000));
        addEmployee(employees, new Employee("Егоров", "Евгений", "Николаевич", 3, 70_000));
        addEmployee(employees, new Employee("Кирюнина", "Ольга", "Васильевна", 1, 45_000));
        addEmployee(employees, new Employee("Петрынькин", "Иван", "Иванович", 4, 66_000));
        addEmployee(employees, new Employee("Козлов", "Игорь", "Александрович", 3, 37_000));
        addEmployee(employees, new Employee("Рыбкина", "Татьяна", "Вячеславовна", 2, 98_000));
        addEmployee(employees, new Employee("Власов", "Вячеслав", "Арнольдович", 3, 60_000));
        addEmployee(employees, new Employee("Шерин", "Петр", "Романович", 1, 52_000));
        addEmployee(employees, new Employee("Алехина", "Виктория", "Степановна", 3, 78_000));

        printIndexingSalary(employees);
        printDepartmentMaxSalary(employees, 3);
        printDepartmentMinSalary(employees, 3);
        printDepartmentMonthlySalary(employees, 3);
        printAverageDepartmentSalary(employees, 3);
        printIndexingDepartmentSalary(employees, 3);
        printAllAboutEmployeeDepartment(employees, 3);
        printEmployeeDepartmentWhoHasMin(employees, 3, 70000);
        printEmployeeDepartmentWhoHasMax(employees, 3, 70000);

    }
}