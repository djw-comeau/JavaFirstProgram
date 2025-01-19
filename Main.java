// Code by: David Comeau
// Date: January 18, 2025
// Class: Introduction to Object Oriented Programming
// Instructor: Nadia Gouda
// Sources Used:
// https://www.w3schools.com/java/java_oop.asp
// https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
// https://www.geeksforgeeks.org/encapsulation-in-java/

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 2: Extending Your Java Skills");
        System.out.println();

        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book ();
  
        bookOne.Name=("The Vampire Chronicles");
        bookOne.Title=("Interview with a Vampire");
        bookOne.Author=("Anne Rice");
        System.out.println(bookOne.Name);
        System.out.println(bookOne.Title);
        System.out.println(bookOne.Author);
        System.out.println();

        bookTwo.Name=("The Vampire Chronicles");
        bookTwo.Title=("The Vampire Lestat");
        bookTwo.setAuthor("Anne Rice");
        System.out.println(bookTwo.Name);
        System.out.println(bookTwo.Title);
        System.out.println(bookTwo.Author);
        System.out.println();

        bookThree.Name=("The Vampire Chronicles");
        bookThree.setTitle("Queen of the Damned");
        bookThree.setAuthor("Anne Rice");
        System.out.println(bookThree.Name);
        System.out.println(bookThree.Title);
        System.out.println(bookThree.Author);

    }
}