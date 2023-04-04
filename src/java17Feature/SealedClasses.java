package java17Feature;
sealed class Animal  permits PetAnimal,WildAnimal,Bird
{
  void display()
  {
    System.out.println("This is form Animal class");
  }

}
non-sealed class PetAnimal extends Animal {

  @Override
  void display()
  {
    System.out.println("This is form PetAnimal class");
  }

}
final class WildAnimal extends Animal
{

  @Override
  void display()
  {
    System.out.println("This is form WildAnimal class");
  }
}

sealed class Bird extends Animal
{

}
final class FlyingBirds extends Bird
{

}
public class SealedClasses {

  public static void main(String[] args) {
    PetAnimal animal= new PetAnimal();
    animal.display();

  }
}
