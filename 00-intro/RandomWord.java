import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double counter = 0;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String inp = StdIn.readString();
            counter++;
            if (StdRandom.bernoulli(1/counter)) {
                champion = inp;
            } // if
        } // while
        StdOut.println(champion);
    } 
} 
