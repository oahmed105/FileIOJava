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
            int sum = 0;
            while (fileIn.hasNext())
            {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine();
                // Split the line into a String array
                //String[] input = lineIn.split(" ");
                //int[] num = new int[lineIn];

                sum += Integer.parseInt(lineIn);
            }
            System.out.println(sum);
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}