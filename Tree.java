/**.
* This is the Tree class for Tree program
*
* @version 1.0
* @since 2025-05-1
*/
public final class Tree {
    // Declare attributes
    int numOfLeaves;
    String type;
    int yearPlanted;
    int height;
    int age;


    /**.
     * This is the tree constructor for Tree class
     * 
     * @param height height of the tree
     * @param numOfLeaves number of leaves on the tree
     * @param type type of the tree
     * @param yearPlanted year the tree was planted
     * @param age age of the tree
     */
    public Tree(final int height, final int numOfLeaves,
            final String type, final int yearPlanted, final int age) {
        // Set the attributes to themselves
        this.height = height;
        this.numOfLeaves = numOfLeaves;
        this.type = type;
        this.yearPlanted = yearPlanted;
        this.age = age;
    }

    /**
    * This is the method for growing the tree.
    */
    public void grow() {
        // Grow tree in height and leaves
        this.height += 10;
        this.numOfLeaves += 100;
    }

    /**
    * This is the method for growing the tree with method overloading.
    *
    * @param height the height of the tree
    */
    public void grow(final int height) {
        // Grow tree in height
        this.height += height;
    }

    /**.
    * This is the method for making the tree lose leaves
    */
    public void loseLeaves() {
        // Set the Tree leaves to 0 to lose all leaves
        this.numOfLeaves = 0;
    }

    /**.
    * This is the method for adding years to the tree
    */
    public void year() {
        // Increment the year planted by 1
        this.yearPlanted += 1;
    }

    /**.
    * This is the method for the age based on year planted
    */
    public void age() {
        // Use year planted to find age
        this.age = 2025 - this.yearPlanted;
    }
}
