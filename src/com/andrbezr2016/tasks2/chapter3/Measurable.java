package com.andrbezr2016.tasks2.chapter3;

/*
Provide an interface Measurable with a method double getMeasure() that measures
an object in some way. Make Employee implement Measurable.
 */
public interface Measurable {

    double getMeasure();

    /*
    Provide a method double average(Measurable[] objects) that computes the average
    measure. Use it to compute the average salary of an array of employees.
     */
    static double average(Measurable[] objects) {
        if (objects != null && objects.length != 0) {
            double sum = 0;
            for (Measurable obj : objects) {
                sum += obj.getMeasure();
            }
            return sum / objects.length;
        }
        return 0;
    }

    /*
    Continue with the preceding exercise and provide a method Measurable
    largest(Measurable[] objects). Use it to find the name of the employee with
    the largest salary.

    Why do you need a cast?
    Cast нужен для приведения типов.
    Есть неявное безопасное upcast преобразование и явное небезопасное downcast преобразование.
    Пример upcast:
    Measurable measurable = new Employee(1, "Ivan", "C", 30000);
    Но вызвать методы из Employee не сможем, только из Measurable.
    Пример downcast:
    Employee employee = (Employee) measurable;
    Если здесь объект measurable не является Employee, то бросит исключение ClassCastException.
     */
    static Measurable largest(Measurable[] objects) {
        if (objects != null && objects.length != 0) {
            Measurable result = objects[0];
            for (Measurable obj : objects) {
                if (obj.getMeasure() > result.getMeasure()) result = obj;
            }
            return result;
        }
        return null;
    }
}
