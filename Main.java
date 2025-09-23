//Aleena Khan
//Decorator Pattern HW 2
//9/22/2025

public class Main {
  public static void main(String[] args) {
    
    Trees mytree = new ColoBlue();
  
    mytree = new Star(mytree);
    mytree = new Star(mytree);
    mytree = new Ruffles(mytree);
    mytree = new LEDS(mytree);
    mytree = new BallsBlue(mytree);
    mytree = new BallsRed(mytree);
    mytree = new Star(mytree);

    System.out.println("This Tree has: " + mytree.getDescription() + ".");
    System.out.println("This Tree has a cost of: " + mytree.cost() + "."); 

  }

}
  
