public class Assignment_001_004 {
    private String name;

    public Assignment_001_004(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Assignment_001_004 cat = new Assignment_001_004("Whiskers");
        Assignment_001_004 cat2 = new Assignment_001_004("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}
