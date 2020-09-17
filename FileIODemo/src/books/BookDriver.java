/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class BookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

//        Book b1 = new Book("1233-987", 45.00, "OOP");
//        System.out.println(b1);
//          Scanner scan = new Scanner(System.in);
//          
//          System.out.println("Enter isbn");
//          String isbn = scan.next();
//          System.out.println(isbn);
//          
//          System.out.println("Enter book cost");
//          double price = scan.nextDouble();
//          System.out.println(price);
//          
//          scan.nextLine();
//          
//          System.out.println("Enter title");
//          String title = scan.nextLine();
//          System.out.println(title);     
//          
//          Book b1 = new Book(isbn, price, title);
//          System.out.println(b1);
        Scanner scan = new Scanner(new File("bookData.txt"));
        PrintWriter write = new PrintWriter(new File("bookInfo.txt"));
        while (scan.hasNext()) {
            String isbn = scan.next();
            double price = scan.nextDouble();
            scan.nextLine();
            String title = scan.nextLine();
            Book b = new Book(isbn, price, title);
            System.out.println(b);
            write.println(b);
        }
        System.out.println("I am not printing books");
        write.println("I am not printing books");
        scan.close();
        write.close();
        

    }

}
