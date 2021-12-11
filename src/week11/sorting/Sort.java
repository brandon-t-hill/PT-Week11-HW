package week11.sorting;

import java.util.Comparator;
import java.util.List;

public class Sort {
  
  public void run() {
    System.out.println("Sorting with a Lambda expression...");
    lambdaSortAnimals().forEach(animal -> System.out.println(animal.toString()));
    System.out.println("Sorting with a Method Reference...");
    referenceSortAnimals().forEach(animal -> System.out.println(animal.toString()));
  }
  
  public List<Animal> lambdaSortAnimals(){
    List<Animal> animals = Animal.getAnimals();
    Comparator<Animal> comp = (a1, a2) -> Animal.compare(a1, a2);
    animals.sort(comp);
    return animals;
  }
  
  public List<Animal> referenceSortAnimals(){
    List<Animal> animals = Animal.getAnimals();
    Comparator<Animal> comp = Animal::compare;
    animals.sort(comp);
    return animals;
  }
}
