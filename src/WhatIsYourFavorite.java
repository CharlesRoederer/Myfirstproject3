import java.util.Scanner;

/**
 * This is a sample ask a question class. Nothing other than main.
 * @author 26roederer
 * @version 09.13.2022
 */

public class WhatIsYourFavorite {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("what is your favroite movie");
        String movie =in.nextLine();
        System.out.print(movie + "is a terrible! I hate");
        System.out.print("JK!! I love" + movie + "too.");
    }
}
