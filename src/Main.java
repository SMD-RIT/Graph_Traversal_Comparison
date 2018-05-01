import java.util.Scanner;

public class Main{
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;

        System.out.println("Graph Traversal Comparison:\n");

        while(!done){
            displayMenu();
            int option = scan.nextInt();

            switch(option){
                case 0:
                    done = true;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
