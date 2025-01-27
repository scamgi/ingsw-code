class Mammal {
  protected String color;

  public Mammal(String c) {
    color = c;
  }

  public String getColor() {
    return color;
  }

  public String speak(Mammal other) {
    return "I am " + getColor() + ", it is " + other.getColor();
  }
}

class Feline extends Mammal {
  public Feline(String c) {
    super(c);
  }

  public String getColor() {
    return color + " feline";
  }

  public String speak(Feline other) {
    return "I am an aggressive " + getColor() + ", it is " + other.getColor();
  }
}

class Cat extends Feline {
  public Cat(String c) {
    super(c);
  }

  public String speak(Mammal other) {
    return "I am a cute " + getColor() + ", it is " + other.getColor();
  }

  public String getColor() {
    return color + " cat";
  }
}

public class ClasseGatti {
  public static void main(String[] args) {
    Mammal m1 = new Mammal("white");
    Mammal m2 = new Feline("brown");
    Mammal m3 = new Cat("striped");
    Feline f1 = new Cat("spotted");
    Cat c1 = new Cat("dark gray");
    System.out.println(m1.speak(m2));
    System.out.println(m2.speak(m1));
    System.out.println(m2.speak(m3));
    System.out.println(m2.speak(f1));
    System.out.println(f1.speak(m2));
    System.out.println(c1.speak(m2));
    System.out.println(c1.speak(f1));
  }
}
