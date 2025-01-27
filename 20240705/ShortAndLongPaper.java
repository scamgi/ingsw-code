class Paper {
  public String toString() {
    return "Paper";
  }

  public void print(Paper a) {
    System.out.println("Paper: " + this + " " + compose(this, a));
  }

  public String compose(Paper a, Paper b) {
    return a.toString() + " and " + b.toString();
  }
}

class Long extends Paper {
  public String toString() {
    return "Long";
  }

  public void print(Long a) {
    System.out.println("Long: " + this + " " + a);
  }
}

class Short extends Paper {
  public String toString() {
    return "Short";
  }

  public void print(Short m) {
    System.out.println("Short: " + this + " " + compose(this, m));
  }

  public String compose(Paper a, Paper b) {
    return b.toString() + " and " + a.toString();
  }
}

public class ShortAndLongPaper {
  public static void main(String[] args) {
    Paper p1, p2;
    Short s1;
    Long l1;
    p1 = new Paper();
    p2 = new Long();
    s1 = new Short();
    l1 = new Long();
    s1.print(p1);
    s1.print(p2);
    s1.print(s1);
    p2.print(p1);
    p2.print(p2);
    p2.print(s1);
    l1.print(l1);
    p2 = s1;
    p1 = l1;
    p2.print(p2);
    p2.print(s1);
    p1.print(l1);
  }
}