package java9_features;

import static java.util.Map.entry;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableListSetMap {

  public static void main(String[] args) {
    List<String> stringList = List.of("one","two");
    System.out.println(stringList);

    //not allow to add in list
    //stringList.add("three");

    Set<String> stringSet = Set.of("one","two");
    System.out.println(stringSet);

    Map<Integer, String> stringMap = Map.of(1,"one",2,"two");
    System.out.println(stringMap);

    Map<Integer, String> entryMap = Map.ofEntries(
        entry(1,"one"),
        entry(2,"two"),
        entry(3, "Three")
    );
    System.out.println(entryMap.entrySet());
    //not allow to add in Map
    //entryMap.put(4,"four");

  }
}
