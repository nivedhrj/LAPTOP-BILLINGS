import java.util.*;
class Laptop{
    String name;
    int price;
    double discount;
    double amount;

    Laptop(String name,int price){
        this.name=name;
        this.price=price;

    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter the price of the Laptop:");
        price=sc.nextInt();


        sc.close();
    }
    public void compute(){

        if(price<25000){
            discount=(5.0/100)*price;
        }
        else if(price>25000&&price<=50000){
            discount=(7.5/100)*price;
        }
        else if(price>50000&&price<=100000){
            discount=(10.0/100)*price;
        }
        else{
            discount=(15.0/100)*price;
        }

    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Price:"+price);
        System.out.println("Discount: "+discount);
        System.out.println("Amount: "+(price-discount));

    }
    public static void main(String[]Args){
        Laptop laptop=new Laptop("",0);
        laptop.input();
        laptop.compute();
        laptop.display();

    }
}