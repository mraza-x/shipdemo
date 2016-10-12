/**
Mohammed Raza
CSC 162 - Lab7 # 2 (class2)
*/

public class CruiseShip extends Ship
{
   private int max;


   public CruiseShip()
   {   super();

	   max = 0;
   }


   public CruiseShip(String n, String y, int m)
   {  super(n,y);

	  max = m;
   }


   public void setMax(int m)
   {
      max = m;
   }


   public int getMax()
   {
      return max;
   }



   public String toString()
   {
	   String str = " , " + max;
	   return str;
   }


}
