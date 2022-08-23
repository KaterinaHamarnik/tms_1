package lesson8.ExObject;

public class Person implements Cloneable{
    private String name;
    private int age;
    private int salary;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    Cat cat;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", age: " + getAge() + ", salary: " + getSalary() + ", cat: " + cat;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
