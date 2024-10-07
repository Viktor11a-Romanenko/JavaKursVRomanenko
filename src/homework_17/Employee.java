package homework_17;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) return;
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 0) return;
        this.salary = salary;
    }


    public void whoAmI(String name, int age, double salary) {
        System.out.printf("Меня зовут %s, мой возраст: %d, моя зарплата: %d\n", this.name, this.age, this.salary);

    }

}
