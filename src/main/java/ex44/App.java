/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex44;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import com.google.gson.*;
import java.util.Scanner;

class Product {
    ArrayList<ProductList> products;
}

class ProductList {
    String name;
    double price;
    int quantity;
}

public class App {

    public static Boolean isProduct(String in,  Product product){
        for(ProductList i : product.products){
            if (in.equals(i.name))
                return true;
        }
        return false;
    }

    public static void checkProduct(String in, Product product){
        for(ProductList i : product.products) {
            if (in.equals(i.name)) {
                System.out.println("Name: " + i.name);
                System.out.println("Price: " + i.price);
                System.out.println("Quantity: " + i.quantity);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        String JSONcontent = Files.readString(Path.of("src\\main\\java\\ex44\\exercise44_input.json"), StandardCharsets.US_ASCII);
        JSONcontent = JSONcontent.replaceAll("\\s", ""); // Remove all whitespace

        Product product = new Gson().fromJson(JSONcontent, Product.class);

        // For testing purposes: Print arraylist from product class object
        /*for(ProductList i: product.products){
            System.out.println("Name: " + i.name);
            System.out.println("Price: " + i.price);
            System.out.println("Quantity: " + i.quantity);
            System.out.println();
        }*/

        Scanner s = new Scanner(System.in);

        System.out.print("What's the product name?");

        String in = s.nextLine();

        while (!isProduct(in, product)) {
            System.out.println("Sorry. That product was not found in our inventory.");
            System.out.print("What's the product name?");
                  in = s.nextLine();
        }

        checkProduct(in, product);

    }
}