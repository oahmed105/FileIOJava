package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {
            Scanner fileIn = new Scanner(new File("/Users/osama/LocalProjects/FileIOJava/Step4/text.txt"));

            while (fileIn.hasNext())
            {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine();
                // Split the line into a String array
                String[] input = lineIn.split(" ");
                int[] nums = new int[input.length];
                int sum = 0;
                for (int i = 0; i < nums.length; i ++) {
                    sum += Integer.parseInt(input[i]);
                }
                System.out.println(sum);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}