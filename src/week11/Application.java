package week11;

import week11.optionals.Optionals;
import week11.sorting.Sort;
import week11.streams.Stream;

public class Application {
  public static void main(String[] args) {
    new Application().run();
  }

  private void run() {
    System.out.println("Running Sort Assignment...");
    new Sort().run();
    System.out.println("Running Stream Assignment...");
    new Stream().run();
    System.out.println("Running Optionals Assignment...");
    new Optionals().run();
  }
}
