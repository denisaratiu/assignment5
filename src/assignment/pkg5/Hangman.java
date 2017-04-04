/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ratid6445
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1: Enter a word for Player 2 to guess: ");
        String word = input.nextLine();
        //insert blank lines
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //insert dashes for word length
        String display = "";
        for (int i = 0; i < word.length(); i++) {
            display = display + "- ";
        }
        System.out.println(display);
        
        //player 2 guess a number
        System.out.println("Player 2: You have 6 lives left. Guess a letter: ");
        String letter = input.nextLine();
        //if letter right replace a dash, if wrong change number of lives
        if(word.contains(letter)){
                //print the character
                int spot = word.indexOf(letter);
        //get character at position spot
                char character = display.charAt(spot);
                //print out each letter in the word
            //start at position 0 go up to length - 1
                
                //print the character
                    //breaking up the string where the vowel was found
                for (int i = 0; i > spot; i++){
                    String firstHalf = display.substring(0, i);
                    String lastHalf = display.substring(i);

                    //create the translated word
                    String output = firstHalf + character + lastHalf;

                    //show the user how many lives they have left
                    System.out.println("You have 6 lives left. Guess a letter: " + output);

                    //stop looking for more vowels
        }
            }
        //if (!word.contains(letter)) {
            //System.out.println("Player 2: You have 5 lives left. Guess a letter: ");
            //insert blank lines for word length
            //for (int i = 0; i < word.length(); i++) {
             //   System.out.print("- ");
           // }
           // System.out.println("");
     //   }
    }
}
