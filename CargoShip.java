/**
Mohammed Raza
CSC 162 - Lab7 # 2 (class3)
*/

public class CargoShip extends Ship
{
   private int cargocap;


   public CargoShip()
   {   super();

	   cargocap = 0;
   }


   public CargoShip(String n, String y, int c)
   {  super(n,y);

	  cargocap = c;
   }


   public void setCargoCap(int c)
   {
      cargocap = c;
   }


   public int getCargoCap()
   {
      return cargocap;
   }



   public String toString()
   {
	   String str = " , " + cargocap;
	   return str;
   }


}
