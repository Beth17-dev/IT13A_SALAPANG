
package salapang_palindrone;

import java.util.Scanner;

public class Salapang_palindrone {

    
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word:");
        String Name = in.nextLine();

        for (int x = Name.length() - 1; x >= 0; x--) {
            System.out.print(Name.charAt(x) + " ");
        }

        System.out.println();

    }
}