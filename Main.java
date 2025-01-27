// Code by: David Comeau
// Date: January 26, 2025
// Class: Introduction to Object Oriented Programming
// Instructor: Nadia Gouda
// Sources Used:
// https://www.geeksforgeeks.org/constructors-in-java/
// https://www.programiz.com/java-programming/constructors
// https://www.w3schools.com/java/java_constructors.asp
// Class exercises

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 3: Using Constructors in Java");
        System.out.println();

        // Using my no-argument constructor
        Book bookOne = new Book();
        System.out.println("Let's use our no-argument constructor here!");
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getTitle());
        System.out.println(bookOne.getAuthor());
        System.out.println();

        // This part updates bookOne with the fifth book in the series, using our setters.
        bookOne.setTitle("Memnoch the Devil");
        System.out.println("Result after using setters (Book Five).");
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getTitle());
        System.out.println(bookOne.getAuthor());
        System.out.println();

        // Now, let's use our parametrized constructor for the sixth book in the series.
        Book bookTwo = new Book("The Vampire Chronicles", "Anne Rice", "The Vampire Armand");
        System.out.println("Here's the results using our Parameterized Constructor for the sixth book.");
        System.out.println(bookTwo.getName());
        System.out.println(bookTwo.getTitle());
        System.out.println(bookTwo.getAuthor());

    }
}