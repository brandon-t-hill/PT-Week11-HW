package week11.sorting;

import java.util.ArrayList;
import java.util.List;

public class Animal {
  private String name;
  private static List<Animal> animals = new ArrayList<Animal>(
      List.of(new Animal("Lion"), new Animal("Tiger"), new Animal("Bear"), new Animal("Snake")));

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static List<Animal> getAnimals() {
    return animals;
  }

  public void addAnimal(Animal a) {
    animals.add(a);
  }

  @Override
  public String toString() {
    return name + " Animal";
  }

  public static int compare(Animal a1, Animal a2) {
    return a1.getName().compareTo(a2.getName());
  }
}
