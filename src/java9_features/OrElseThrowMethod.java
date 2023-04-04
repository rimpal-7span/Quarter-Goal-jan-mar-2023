package java9_features;

import java.util.Optional;

public class OrElseThrowMethod {
  public static void main(String[] args) {

    String email = null;
   // String email = "aaa@fdk.com";
    Optional<String> stringOptional = Optional.ofNullable(email);
    String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email is not exist"));
    System.out.println(optionalObject);
  }
}
