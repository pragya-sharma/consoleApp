/*
   Author - Pragya Sharma
*/

import java.util.*;
class finalExam{
    private String make;
    private String model;
    private int year;
    private String color;
    private String price;

    public finalExam(String make, String model,int year,String color,String price) {
               this.make = make;
               this.model = model;
               this.year = year;
               this.color = color;
               this.price = price;
    }
    public String getMake() {
        return make;
    }

    // Setter
    public void setMake(String newMake) {
        this.make = newMake;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
    public String getColor(){
        return color;
    }
    public  void  setColor(String newColor){
        this.color = newColor;
    }
    public  String getPrice(){
        return price;
    }
    public void setPrice(String newPrice){
        this.price = newPrice;
    }
    @Override
    public String toString(){
        return getMake()+" " + getModel()+ " " +getYear()+" "+ getColor()+ " " +getPrice();
    }
    
}




public class console  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String make = sc.nextLine();
        String model = sc.next();
        int year = sc.nextInt();
        String color = sc.next();
        String price = sc.next();
        finalExam objj = new finalExam(make, model, year, color, price);


        System.out.println(objj);
    }

}
