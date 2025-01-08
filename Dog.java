public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0; //Static field, meaning its accessed by all and it isn't limited to just the one dog. Every time you make a dog it updates the larger program.
  //By making numDogs static, it belongs to the class so you can easily keep track of it, numDogs isn't a property limited to just one object
  //If you make numDogs not static, each dog gets its own numDogs, it is counted by itself, which is bad.
  //Non Default Constructor
  public Dog(String name)
  {
    this.name = name;
    numDogs ++;
    this.ID = numDogs * numDogs; 
  }
  // Default Dog constructor

  // Setters - instance variables only
  public void setName(String name)
  {
    this.name = name;
  }

  public void setID (int ID)
  {
    this.ID = ID;
  }

  public void setnumDogs (int numDogs)
  {
    this.numDogs = numDogs;
  }

  // Getters - instance variables only

  public String getName()
  {
    return name;
  }

  public int getID()
  {
    return ID;
  }

  public int getnumDogs()
  {
    return numDogs;
  }
}
