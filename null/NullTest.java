class Ciao {
  public void test(long id) {
    System.out.println("this is an id: " + id);
  }
}

public class NullTest {
  public static void main(String[] args) {
    Ciao c = new Ciao();
    c.test(0L);
    // I can't set id to null.
  }
}
