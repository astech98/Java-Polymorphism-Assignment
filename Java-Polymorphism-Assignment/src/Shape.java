/**
 *  A class Shape that holds width and height
 *  of any shape
 */

public class Shape
{
   private double height;  // To hold height.
   private double width;  //To hold width or base

   // Set height and width
   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }

   //Get height
   public double getHeight() 
   {
       return height;
   }
     
   //Get width
   public double getWidth() 
   {
       return width;
   }    
}        