package week11.streams;

import java.util.stream.Collectors;
import week11.sorting.Animal;

public class Stream {
  public void run() {
    System.out.println(streamToString());
  }

  public String streamToString() {
    // @formatter:off
    return Animal.getAnimals().stream()
        .map(Animal::toString)
        .sorted()
        .collect(Collectors.joining(", "));
    // @formatter:on
  }
}
