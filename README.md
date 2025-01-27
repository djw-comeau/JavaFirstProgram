# Updated January 26, 2025

Objective: 

The goal of this exercise is to extend your Java skills by adding constructors to the Java program you created in Exercise 2. You will modify your Book.java (or Student.java, Car.java, or Avatar.java) class to include constructors for initializing objects. You will also update your Main.java file to demonstrate the use of constructors, manage your code on GitHub, and record a video of the demonstration.
Steps:

    Set Up Your Environment:
        If you completed Exercise 2, your environment should already be set up:
            Java installed on your system.
            An IDE (like IntelliJ IDEA, Eclipse, or Visual Studio Code).
            Your GitHub repository already created and your files uploaded.
        If not, follow the instructions from Exercise 1 and Exercise 2 to ensure everything is ready before proceeding.

    Add a Constructor to Your Class:
        Open the Java project you created in Exercise 2.
        In the Book.java (or your chosen class, like Student.java), add a constructor that allows initializing the class attributes.
        Use both a no-argument constructor and a parameterized constructor to initialize objects of the class. The no-argument constructor should set default values, while the parameterized constructor should allow you to initialize objects with custom values.
        For example, in Book.java, you can add the constructor like this:

    Update Your Main File:
        In the Main.java file, update your code to use both constructors:
            Create objects using the no-argument constructor and the parameterized constructor.
            Demonstrate setting values for attributes using the setters, and use getters to display values in your program.

    Add the Updated Class to GitHub:
        After making the necessary changes, open a terminal, navigate to your project directory, and add the updated Book.java (or Student.java, etc.) file to your GitHub repository.

    Record a Video Demonstration:
        Create a short video (2–3 minutes) that includes:
            Showing both Main.java and Book.java files in your IDE.
            Running the program in your IDE and demonstrating that it works as expected.
            Displaying your updated GitHub repository with both Main.java and Book.java files.
        Submit your recorded video or upload your video to a platform like YouTube, OneDrive, or Google Drive, and share the link.

Submission Requirements:

    GitHub Repository: Share the link to your GitHub repository containing both Main.java and Book.java files with the constructor implementations.
    Video Demonstration: Submit your recorded video or upload your video to a platform like YouTube, OneDrive, or Google Drive and share the link.


# Updated January 18, 2025

Objective:

The goal of this exercise is to build on your previous knowledge by creating a Java program with multiple classes, managing these files using a GitHub repository, and recording a video demonstration. You will create a simple Java program that demonstrates the concept of Encapsulation by using a class to represent books or students, with proper access modifiers and methods.
Steps:
1. Set Up Your Environment:

If you completed Exercise 1, you should already have:

    Java installed on your system.
    An IDE (like IntelliJ IDEA, Eclipse, or Visual Studio Code) set up.
    A GitHub repository created for managing your Java files.

If not, please follow the instructions from Exercise 1 to set up your environment before continuing.
2. Add a New Class File:

    Open the same Java project you created in Exercise 1.
    Create a new file in your project directory and name it Book.java (or Student.java or Car.java or Avatar.java if you prefer).
    Write a class to demonstrate Encapsulation. 

3. Update Your Main File:

Modify your Main.java file to use the Book (or Student) class. Add code to create objects, set their attributes, and call their methods.
4. Add the New Class to GitHub:

    Open a terminal and navigate to your project directory.
    Add the new file to your Git repository

5. Record a Video Demonstration:

Create a short video (2–3 minutes) that includes:

    Showing the Main.java and Book.java files in your IDE.
    Running the program in your IDE and demonstrating that it works as expected.
    Displaying your updated GitHub repository with both Main.java and Book.java files.

Submission Requirements:

    GitHub Repository: Share the link to your GitHub repository containing both Main.java and Book.java files.
    Video Demonstration: Upload your video to a platform like YouTube, OneDrive, or Google Drive and share the link.


# JavaFirstProgram
The goal of this exercise is to ensure you have Java installed on your system, set up an IDE for writing and running Java code, and create your first Java program. You will also learn to create a GitHub repository to manage your code.

Steps:
1. Check if Java is Installed:

    Open your terminal or command prompt.
    Type the command:
    java -version
    Note the version of Java installed on your machine. If Java is not installed:
        Download and install the Java Development Kit (JDK) from Oracle's official site or OpenJDK.
        After installation, re-run the java -version command to confirm the installation.

2. Install an IDE:

    Choose and install one of the following Integrated Development Environments (IDE):
        IntelliJ IDEA Community Edition
        Eclipse IDE
        Visual Studio Code with the Java extension.
    Configure the IDE to recognize your JDK installation.

3. Write Your First Java Program:

    Open your chosen IDE.
    Create a new Java project and add a file named Main.java.
    Write the following code in the Main.java file:
    public class Main {
    public static void main(String[] args) {
    System.out.println("Hello, World!");
    }
    }
    Run the program in your IDE.
    Ensure that "Hello, World!" is displayed in the console.

4. Create a GitHub Repository:

    Go to GitHub and create a new public repository. Name it something meaningful, like JavaFirstProgram.
    Initialize the repository with a README.md.
    Use Git to push your code to the repository:
        Open a terminal and navigate to the directory where your Main.java file is located.
        Initialize a Git repository:
        git init
        Add your files:
        git add Main.java
        Commit your changes:
        git commit -m "Add first Java program"
        Link your local repository to GitHub:
        git remote add origin <your-repository-URL>
        Push your code:
        git push -u origin main

5. Record a Video:

    Create a short video (1–2 minutes) showing the following:
        The Java version installed on your system (via java -version).
        Running your Hello, World! Java program in the IDE.
        Navigating to your GitHub repository and showing that your Main.java file has been uploaded.
