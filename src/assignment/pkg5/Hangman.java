/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.Scanner;

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
        // insert counter
        int counter = 1;
        //number of lives
        int lives = 6;
        
        boolean check = false;
        // tell player 1 to insert word
        System.out.println("Player 1: Enter a word for Player 2 to guess: ");
        String word = input.nextLine();
        String word2 = word;
        //insert blank lines
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //insert dashes for word length
        for (int i = 0; i < word.length(); i++) {
            String temp = word2.substring(i, i + 1);
            char temp1 = temp.charAt(0);

            word2 = word2.replace(temp1, '-');

        }
        //create a stringBuilder to manipulate easier
        StringBuilder nameOfBuilder = new StringBuilder(word2);
        //create a while statement 
        while (lives > 0) {
            check = false;
            //ask the player to guess a letter and output the number of lives left
            System.out.println("Player 2: You have " + lives + " lives left. Guess a letter: ");
            String letter = input.nextLine();
            //store the letter as a character
            char letterGuessed = letter.charAt(0);
            // create a for loop
            for (int i = 0; i < word.length(); i++) {
                //if statement if the letter guessed is right
                if (letterGuessed == word.charAt(i)) {
                    nameOfBuilder.setCharAt(i, letterGuessed);
                    check  = true;
                }
            }
                //if statement if the letter guessed is wrong
                if (check == false) {
                   //decrease number of lives
                   lives = lives - 1;
                   
            }
            System.out.println(nameOfBuilder);
    }
}
}