import java.util.Scanner;

public class Main{
    //Menu function and menu options
    public static void displayMenu(){
        System.out.println("Please choose an option.");
        System.out.println("0. Quit");
        System.out.println("1. Create a graph");
        System.out.println("2. Edit graph nodes");
        System.out.println("3. Add a new node");
        System.out.println("4. Remove a node");
        System.out.println("5. Start traversals");
        System.out.print("> ");
    }

    public static void createGraph(){

    }

    public static void editGraph(){

    }

    public static void addNode(){

    }

    public static void removeNode(){

    }

    public static void traversalMenu(){
        System.out.println("\nWhich traversal option would you like?");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;

        System.out.println("Graph Traversal Comparison:\n");

        while(!done){
            displayMenu();
            int option = scan.nextInt(); //need to implement checks for if the user inputs a type that's not an int.

            switch(option){
                case 0:
                    done = true;
                    break;
                case 1:
                    createGraph();
                    break;
                case 2:
                    editGraph();
                    break;
                case 3:
                    addNode();
                    break;
                case 4:
                    removeNode();
                    break;
                case 5:
                    traversalMenu();
                    break;
                default:
                    System.err.println("Please enter a valid option.");
                    break;
            }
        }
    }
}
