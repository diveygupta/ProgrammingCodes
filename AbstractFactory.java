/*Abstract Factory patterns work around a super-factory which creates other factories. 
This factory is also called as factory of factories. 
In Abstract Factory pattern an interface is responsible for creating a factory of related objects 
without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
*/
// Shape.java

public interface Shape {
   void draw();
}

public interface Color {
  void fill();
}

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}

public class Red implements Color {

   @Override
   public void fill() {
    System.out.println("Inside Red::fill() method.");
   }
}

public class Blue implements Color {

   @Override
   public void fill() {
    System.out.println("Inside Blue::fill() method.");
   }
}

public abstract class AbstractFactory() {
  abstract Color getColor(String color);
  abstract Shape getShape(String shape);
}

public class ShapeFactory extends AbstractFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }
      return null;
   }
   
   @Override
   Color getColor(string color) {
   return null;
   }
}

public class ColorFactory extends AbstractFactory {
	@Override
   Shape getShape(String shape) {
    return null;
   }
   
   // use getColor method to get object of type color
   public Color getColor(String colorType){
      if(colorType == null){
         return null;
      }		
      if(colorType.equalsIgnoreCase("Red")){
         return new Red();
         
      } else if(colorType.equalsIgnoreCase("Blue")){
         return new Blue();
         
      }
      return null;
   }
}
