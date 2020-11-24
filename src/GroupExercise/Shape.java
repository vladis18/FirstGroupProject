package GroupExercise;
//CreateanInterface'Shape'with undefined methods as calculateArea and
//calculatePerimiter.Create 2 classes Circle & Square that implements
// functionality defined in the Shape Interface. Test your code.
public interface Shape {
    final double  Pi=3.14159;
double calculateArea(double value);
double calculatePerimiter(double value);
}

  class Circle implements Shape{

      @Override
      public double calculateArea(double radius ) {

          return radius*=radius *Pi;
      }

      @Override
      public double calculatePerimiter(double radius) {
            return radius*=2*Pi;
      }
  }
 class Square implements Shape{

     @Override
     public double calculateArea(double side) {
         return side * 2;
     }

     @Override
     public double calculatePerimiter(double side) {
         return side *4;
     }


 }
 class TestInterface  {
     public static void main(String[] args) {
         Square sq = new Square();
         Circle cr = new Circle();
         System.out.println("Area of the square is " + sq.calculateArea(+4));
         System.out.println("Perimeter of the square is " + sq.calculatePerimiter(5));
         System.out.println("Area of the circle is " + cr.calculateArea(+4));
         System.out.println("Perimeter of the circle is " + cr.calculatePerimiter(5));
     }
 }