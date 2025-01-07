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
