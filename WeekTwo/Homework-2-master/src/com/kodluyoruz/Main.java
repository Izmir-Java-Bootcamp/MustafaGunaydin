package com.kodluyoruz;

import java.util.Scanner;

public class Main {
    /**
     * This is the main class for the application, interacting
     * with the customer, adding to the cart different products to
     * be purchased and finally calculating the total amount to be paid
     */

    /**
     * Allows a cashier to enter the details for a product
     * to be purchased by a customer
     * @param cart the shopping cart of a given customer
     */
    public static void askCustomer(Cart cart){

        int answer=1;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 to buy a product\n" +
                    "Enter 0 to checkout and proceed with the payment");
            answer = scanner.nextInt();

            if ( answer == 1 ){
                System.out.print("Product name: ");
                String productName = scanner.next();

                System.out.print("Seller: ");
                String seller = scanner.next();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                System.out.print("How many: ");
                int numberOfProducts = scanner.nextInt();

                System.out.print("Discount (enter 0 if no discount applies): ");
                int discount = scanner.nextInt();

                System.out.print("Does Buy2Take3 apply? Y/N: ");
                String buy2Take3 = scanner.next();

                if(discount!=0 && buy2Take3.equals("Y")) {
                    throw new IllegalArgumentException("You cannot benefit from two promotions.");
                }

                if (discount != 0) {
                    Product product = new Product(seller, productName, price);
                    DiscountedProduct dP = new DiscountedProduct(product, discount);
                    if (numberOfProducts == 1) {
                        cart.addProduct(dP);
                    }
                    else{
                        cart.addProduct(dP,numberOfProducts);
                    }
                }

                if (buy2Take3.equals("Y")) {
                    Product product = new Product(seller, productName, price);
                    Buy2Take3Product btp = new Buy2Take3Product(product);
                    if (numberOfProducts == 1) {
                        cart.addProduct(btp);
                    } else {
                        cart.addProduct(btp, numberOfProducts);
                    }
                }
            }
        }while (answer==1);


        for (Product item: cart.getProducts()) {
            if(item instanceof DiscountedProduct){
                System.out.println(item.toString()+" "+item.getPrice(cart)+"TL "+" Sold by "+item.getSeller());
            }else{
                System.out.println(item.getName()+" "+item.getPrice(cart)+" TL "+"Sold by "+item.getSeller());
            }

        }
        System.out.println("In total you have to pay "+cart.totalPrice()+" TL");

    }

    // Main method to interact with a customer
    public static void main(String[] args) {
        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What’s your name? ");

        Scanner scanner = new Scanner(System.in);
        String customer = scanner.nextLine();
        System.out.println("Hi " + customer + ". Please choose one of the following options: ");
        System.out.println("");

        Cart cart = new Cart();

        askCustomer(cart);

        // Ask the user to choose 0 (buy product) or
        // 1 (checkout), depending on what they want to do.
        // Use the method askCustomer
    }
}
