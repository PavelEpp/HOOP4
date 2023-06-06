package main.java.ru.geekbrains.lesson3.task2;

import java.util.Comparator;

import ru.geekbrains.lesson3.task2.Employee;

public class AgeComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
