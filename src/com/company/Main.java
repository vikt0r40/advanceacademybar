package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Waitress b = new Waitress("Georgi", "0202");
        Waitress a = new Waitress("Viktor", "0101");

        Product product1 = new Product("Wiskey", "50ml", 6.00);
        Product product2 = new Product("Vodka", "50ml", 5.00);
        Product product3 = new Product("Water", "350ml", 2.00);

        AcademyBarFrame frame =  new AcademyBarFrame();

        frame.waitresses.add(a);
        frame.waitresses.add(b);

        frame.products.add(product1);
        frame.products.add(product2);
        frame.products.add(product3);

        //w3schools.com

        frame.setVisible(true);


        //Client - Server -> Teoriq
        //Git -> programa/service
        //Postman -> programa


        //ArrayList -> Question

    }
}
