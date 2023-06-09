import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import main.java.HOOP4.AgeComporator;
import main.java.HOOP4.SurnameAgeComporator;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     * метод должен генерировать рабочих (Employee) разных типов.
     *
     * @return
     */
    static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        if (random.nextInt(0, 2) == 0) {
            double salary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary,
                    random.nextInt(18, 60));
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], 600,
                    random.nextInt(160), random.nextInt(18, 60));
        }

        // return new Worker(names[random.nextInt(names.length)],
        // surnames[random.nextInt(3)], random.nextInt(20000, 80000));
    }

    /**
     * TODO: Придумать новые состояния для наших сотрудников
     * Придумать несколько Comparator'ов для сортировки сотрудников
     * по фамилии + имени или по возрасту и уровню ЗП.
     *
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        // Arrays.sort(employees);

        // Arrays.sort(employees, new SalaryComparator());
        // Arrays.sort(employees, new AgeComporator());

        Arrays.sort(employees, new SurnameAgeComporator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
