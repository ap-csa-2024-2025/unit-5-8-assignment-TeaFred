import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Math.abs(3);
    Dog.calculate();
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    dog1.setName("Clam");
    dog2.setID(927);

    Scanner sc = new Scanner(System.in);
    String input = "";
    while (!input.equals("q"))
    {
      System.out.println("Input the make of the car, \"default\" to create a default car or \"q\" to quit:");
      input = sc.nextLine();
      if (input.equals("default"))
      {
        // create default car
      }
      else
      {
        // ask for model, year, miles per gallon
      }

      System.out.println(); // print out the car object
    }
  }
}
