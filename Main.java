/**.
* This is the main class for Tree program
*
* @version 1.0
* @since 2025-05-1
*/

// Define main class
public final class Main {
    // Declare main method
    public static void main(String[] args) {

        // Create a new instance of the Tree
        Tree myTree = new Tree(35, 4000, "Undefined", 2000, 0);

        // Print current tree information
        System.out.println("Initial tree information:");
        System.out.println("Height: " + myTree.height + "Feet");
        System.out.println("Number of leaves: " + myTree.numOfLeaves);
        System.out.println("Type: " + myTree.type);
        System.out.println("Year planted: " + myTree.yearPlanted);

        // Grow the tree
        myTree.grow();

        // Grow the tree however pass a height for method overloading
        myTree.grow(13);

        // Call the lose leaves method to set leaves to 0
        myTree.loseLeaves();

        // Add to the year
        myTree.year();

        // Set the Tree to a species
        myTree.type = "Willow";

        // Print current tree information
        System.out.println("\nNew tree information:");
        System.out.println("Height: " + myTree.height + " feet");
        System.out.println("Number of leaves: " + myTree.numOfLeaves);
        System.out.println("Type: " + myTree.type);
        System.out.println("Year planted: " + myTree.yearPlanted);
    }
}
