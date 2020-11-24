package GroupExercise;
//Create a Class Car that would have the following fields:carPrice and color and  method calculate SalePrice()
// which should be returning a price of the car.Create 2 sub classes:Sedan and Truck.TheTruck class has
//   field as weight and has its own implementation of calculate SalePrice()method in which returned
//   price calculated as following:if weight>2000 then returned price car should include 10% discount,
//  otherwise 20% discount.TheSedanclass has field as length and also  does it is own implementation of
//   calculateSalePrice():if length of sedan is>20 feet then returned car price should include 5% discount,
//    otherwise 10% discount
public class Car {
double carPrice;String carColor;
    public double calculateSalePrice(){

        return  this.carPrice;
    }
}
class Sedan extends Car {
    int length;
Sedan(int length,String color,double price){
    this.length=length;
    this.carColor=color;
    this.carPrice=price;
}
public double calculateSalePrice(  ){
    double discount=0;
  if(length>20){
        this.carPrice= ( this.carPrice)*.05;
  }else {
      discount= ( this.carPrice )*.1;}
    return this.carPrice-discount;
}
}
class Truck extends  Car{

    int weight;
    Truck( double price,String color){
        this.weight=weight;
        this.carPrice=price;
        this.carColor=color;
    }
     public double calculateSalePrice(int weight ){
        double discount=0;
        if(weight>2000){
            discount=( this.carPrice)*.2;
        }else {
            discount=( this.carPrice)*.1;}
        return this.carPrice-discount;
    }
}
class Main1{
    public static void main(String[] args) {
        Sedan sedan=new Sedan(20,"Red",20000);
        System.out.println("Sedan's price is " + sedan.calculateSalePrice(  ));
        Truck truck = new Truck(45000,"Black");
        System.out.println("Truck's price is " + truck.calculateSalePrice(2000  )+"Original price is " + truck.carPrice +"Truck's color is " + truck.carColor);
    }


}