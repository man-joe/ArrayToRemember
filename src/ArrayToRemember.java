/*
Storing the history of values in a program is a common task. Maintaining an object's history requires the programmer
to either write specific code or use a library which supports history logging. Today you're going to write specific
code to store the history of a list.

Type in the names of the last ten presidents in the order they were elected. When you are done, enter the word history.
Your program should display their names starting with the most recent.

For your convenience, the names of the last 10 presidents are:

Kennedy, Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama
 */
import java.util.Scanner;

public class ArrayToRemember {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] tenPresidents = new String[10];
        String histInput;

        System.out.println("Give me the last 10 presidents (all one line separated by space)");
        for(int i = 0; i < 10; i++)
            tenPresidents[i] = sc.next();


        System.out.println("Would you like a history? (type history or else program will exit)");
        histInput = sc.next();

        if (histInput.toLowerCase().equals("history"))
            for (int i = 9; i >= 0; i--)
                System.out.print(tenPresidents[i] + " ");

    }
}
