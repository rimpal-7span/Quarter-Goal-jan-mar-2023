package java17Feature;

import java.util.Comparator;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomNumberGenerator {
  public static void main(String[] args) {
    RandomGenerator pcg64 = RandomGenerator.of("L128X256MixRandom");
    int randomInt = pcg64.nextInt(100);
    System.out.println("Random integer: " + randomInt);

//find all Random Generator Factory and algorithm
    RandomGeneratorFactory.all()
        .sorted(Comparator.comparing(RandomGeneratorFactory::name))
        .forEach(factory -> System.out.println(String.format("%s\t%s\t%s\t%s",
            factory.group(),
            factory.name(),
            factory.isJumpable(),
            factory.isSplittable())));
  }
}
