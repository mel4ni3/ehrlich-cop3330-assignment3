/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex43;

import java.io.FileWriter;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class App {

    public static void createWebsite(String name, String author) throws IOException{

        String html = "<html>\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html\" charset=UTF-8\" author=\"John Doe\">\n" +
                "<title>$title</title>\n" +
                "</head>\n" +
                "<body>$body</body>\n" +
                "</html>";
        new File("./website/"+name).mkdirs();
        FileWriter site = new FileWriter("./website/"+name+"/index.html");
        String htmlString = html.replace("$title", name);
        htmlString = htmlString.replace("John Doe", author);
        site.write(htmlString);
        System.out.println("Created ./website/"+name);
        System.out.println("Created ./website/"+name+"/index.html");
        site.close();

    }

    public static void createJavaScript(String name){
        new File("./website/"+name+"/js").mkdirs();
        System.out.println("Created ./website/"+name+"/js");
    }

    public static void createCSS(String name){
        new File("./website/"+name+"/css").mkdirs();
        System.out.println("Created ./website/"+name+"/css");
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Site name: ");
        String name = input.nextLine();

        System.out.print("Author: ");
        String author = input.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        String js = input.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        String css = input.nextLine();

        createWebsite(name, author);

        if(js.equals("y") || css.equals("Y")){
            createJavaScript(name);
        }

        if(css.equals("y") || css.equals("Y")){
            createCSS(name);
        }


    }


}
