import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LongestString {
  public static void longest(List<String> names) {
    final Optional<String> theLongest = names.stream().max((a, b) -> Integer.compare(a.length(), b.length()));
    theLongest.ifPresent(System.out::println);
  }

  public static void longestFromTheSolution(List<String> names) {
    final Optional<String> theLongest = names.stream()
      .reduce((n1, n2) -> n1.length() >= n2.length() ? n1 : n2);
    theLongest.ifPresent(System.out::println);
  }

  public static void main(String[] args) {
    List<String> ns = new ArrayList<String>();
    ns.add("Giovanni");
    ns.add("Giuseppe");
    ns.add("Fabrizio");
    ns.add("cfbsjdbfdskjfbsdk");
    ns.add("Gianpaolo");
    longest(ns);
    longestFromTheSolution(ns);
  }
}
