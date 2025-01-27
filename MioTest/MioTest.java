class Person {
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String isAdult(Person p) {
    return p.age >= 18 ? "Adult" : "Child";
  }
}

class Student extends Person {
  public Student(String name, int age) {
    super(name, age);
  }

  public String sayHi() {
    return "Hi";
  }
}

public class MioTest {
  public static void main(String[] args) {
    Person p = new Person("Mio", 20);
    Student s = new Student("studente bello", 16);

    System.out.println(p.isAdult(p));
    System.out.println(p.isAdult(s));
    System.out.println(s.sayHi());
  }
}
