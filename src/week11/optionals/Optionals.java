package week11.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;
import week11.sorting.Animal;

public class Optionals {
  public void run() {
    System.out.println("Optional with no object:");
    Optional<Animal> ani = Optional.empty();
    try {
      System.out.println(optionimals(ani).toString());
    } catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Optional with object:");
    ani = Optional.of(new Animal("Giraffe"));
    System.out.println(optionimals(ani).toString());
  }

  private Animal optionimals(Optional<Animal> oAni) {
    return oAni.orElseThrow(() -> new NoSuchElementException("There is no Animal here!"));
  }
}
