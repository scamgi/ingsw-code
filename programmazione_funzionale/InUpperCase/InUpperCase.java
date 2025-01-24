import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InUpperCase {
  public static List<String> inUpperCase(List<String> people) {
    return people.stream()
        .filter(name -> !name.equals(name.toUpperCase()))
        .map(String::toUpperCase)  // Metodo alternativo
        .collect(Collectors.toList());
  }

    public static void main(String[] args) {
    List<String> ns = new ArrayList<String>();
    ns.add("Giovanni");
    ns.add("IGNAZIO");
    ns.add("MARCO");
    ns.add("Gianpaolo");
    List<String> res = inUpperCase(ns);
    System.out.println(res.toString());
  }
}
