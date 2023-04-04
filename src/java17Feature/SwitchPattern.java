package java17Feature;

public class SwitchPattern {

  public static void main(String[] args) {
   enum Fruit{
      APPLE, BANANA, ORANGE,MANGO
    }
     switch (Fruit.MANGO)
        {
          case APPLE -> System.out.println( 150);
          case BANANA -> System.out.println(100);
          case ORANGE -> System.out.println(200);
          case MANGO -> System.out.println(250);
        };
  }
}
