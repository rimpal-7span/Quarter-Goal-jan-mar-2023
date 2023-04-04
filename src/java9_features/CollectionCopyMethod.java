package java9_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCopyMethod {

  public static void main(String[] args) {
    List<String> srclst = new ArrayList<String>(3);
    List<String> destlst = new ArrayList<String>(5);
    srclst.add("one");
    srclst.add("two");
    srclst.add("three");

    destlst.add("a");
    destlst.add("b");
    destlst.add("c");
    destlst.add("d");
    destlst.add("e");
    System.out.println(srclst);
    System.out.println(destlst);

    Collections.copy(destlst,srclst);
    System.out.println(srclst);
    System.out.println(destlst);
  }

}
