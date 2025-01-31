import java.util.List;

public class ListTest {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    System.out.println(list);
    list.add(293);
    System.out.println(list);
  }
}
