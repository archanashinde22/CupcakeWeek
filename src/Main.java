import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? \n(Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        // redVelvet Cupcake :
        System.out.println("We are deciding on the price for our Red Velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? \n(Input a numerical number taken to 2 decimal places)");
         priceText = input.nextLine();
         price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);
        //chocklate cupcake
        System.out.println("We are deciding on the price for our Chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake? \n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);
        // Storing cupcakes in Arraylist cupcake Menu
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
//
//        for( Cupcake cc : cupcakeMenu){
//            System.out.println("\n"+ cc.getClass().getSimpleName() + " Price : " + cc.getPrice() + " \nDescription: "  );
//            cc.type();
//
//        }
        // Checking Soda MAchine part

        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the Drink menu. We currently have three Drinks on the menu but we need to decide on pricing.");
        input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard Drink Water. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the Water? \n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);
        // redVelvet Cupcake :
        System.out.println("We are deciding on the price for our Soda. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the soda? \n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);
        //chocklate cupcake
        System.out.println("We are deciding on the price for our milk. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the milk? \n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

//        for( Drink drink : drinkMenu){
//            System.out.println("\n" +drink.getClass().getSimpleName() + " Price : " + drink.getPrice() + " \nDescription: "  );
//            drink.type();
//
//        }

        new Order(cupcakeMenu,drinkMenu);


    }

}
 class Cupcake {
    public double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}
class Chocolate extends Cupcake {

    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}
class RedVelvet extends Cupcake {

    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}


class Drink{
    public double price;
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void type() {
        System.out.println("A Bottle of Water");
    }
}
 class Soda extends Drink {
    public void type() {
        System.out.println(" A bottle of Soda");
    }
}

 class Milk extends Drink {
     public void type() {
        System.out.println(" A bottle of Milk");
    }
}

