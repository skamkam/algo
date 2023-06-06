public class HelloGoodbye {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];

        // prints their names in order, then goodbyes them in reverse order
        System.out.println("Hello " + name1 + " and " + name2 + ".");
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    } 
} 