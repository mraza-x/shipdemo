/**
Mohammed Raza
CSC 162 - Lab7 # 2 (class1)
*/

public class Ship
{
   public String name;
   public String year;

   public Ship()
   {
	   name = " ";
	   year = " ";
   }

   public Ship(String n, String y)
   {
	  name = n;
	  year = y;
   }




   public void setName(String n)
   {
      name = n;
   }

   public void setYear(String y)
   {
      year = y;
   }




   public String getName()
   {
      return name;
   }

   public String getYear()
   {
      return year;
   }




   public String toString()
   {
	   String str = "Ship: " + name + " , " + year;
	   return str;
   }


}
