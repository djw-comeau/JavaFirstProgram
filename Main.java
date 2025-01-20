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
        Book bookThree = new Book();

        bookOne.setName(("The Vampire Chronicles"));
        bookOne.setTitle(("Interview with a Vampire"));
        bookOne.setAuthor(("Anne Rice"));
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getTitle());
        System.out.println(bookOne.getAuthor());
        System.out.println();

        bookTwo.setName(("The Vampire Chronicles"));
        bookTwo.setTitle(("The Vampire Lestat"));
        bookTwo.setAuthor("Anne Rice");
        System.out.println(bookTwo.getName());
        System.out.println(bookTwo.getTitle());
        System.out.println(bookTwo.getAuthor());
        System.out.println();

        bookThree.setName(("The Vampire Chronicles"));
        bookThree.setTitle("Queen of the Damned");
        bookThree.setAuthor("Anne Rice");
        System.out.println(bookThree.getName());
        System.out.println(bookThree.getTitle());
        System.out.println(bookThree.getAuthor());

    }
}