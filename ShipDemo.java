
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab7 #2 (main)
*/

public class ShipDemo
{
   public static void main(String[] args)
   {


	  Ship[] ships = new Ship[3];

	  ships[0] = new Ship("Lolipop","1960");

	  ships[1] = new CruiseShip("DisneyMagic","1988",2400);

	  ships[2] = new CargoShip("Black Pearl","1800",50000);


      System.out.println(ships[0]);

      System.out.println("Ship: " + ships[1].getName() + " , " + ships[1].getYear() + ships[1]);

      System.out.println("Ship: " + ships[2].getName() + " , " + ships[2].getYear() + ships[2]);


   }
}
