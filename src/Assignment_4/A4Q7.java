/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Snakes and Ladders!");
        System.out.println("We didn't have a true board for you and your friend to play on but you know what that's okay because we have a coding edition! :)");
        System.out.print("Please Enter Player 1's Name : ");
        String name1 = input.nextLine();
        System.out.print("Please Enter Player 2's Name : ");
        String name2 = input.nextLine();
        System.out.println("");

        System.out.print("Test values for " + name1 + ". Please enter in an integer that is not zero Entering a zero will terminate the game: ");
        int sumOfDice = input.nextInt();
        System.out.print("Test values for " + name2 + ". Please enter in an integer that is not zero. Entering a zero will terminate the game: ");
        int sumOfDice2 = input.nextInt();
        System.out.println("");
        System.out.println("You have now started a game of Snakes and Ladders! " + name1 + " rolls first!");
        System.out.println("");

        int currentSpace = 1;
        int currentSpace2 = 1;

        while (currentSpace != 100 && !(sumOfDice == 0) && currentSpace2 != 100 && !(sumOfDice2 == 0)) {
            for (int name1Turn = 0; name1Turn < 1; name1Turn++) {
                if (!(sumOfDice2 == 0)) {
                    System.out.print(name1 + " enter the sum of the dice: ");
                    sumOfDice = input.nextInt();

                    if (sumOfDice > 1 && sumOfDice < 13) {
                        currentSpace = currentSpace + sumOfDice;
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    } else if (sumOfDice == 1 || sumOfDice > 12) {
                        while (!(sumOfDice > 1 && sumOfDice < 13)) {
                            System.out.println(name1 + " please enter a sum between 2 and 12...");
                            System.out.println("");
                            System.out.print(name1 + " enter the sum of the dice: ");
                            sumOfDice = input.nextInt();
                        }
                        currentSpace = currentSpace + sumOfDice;
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (currentSpace == 54) {
                        currentSpace = 19;
                        System.out.println("You landed on a snake and unforntuately for you, you poor soul, you're moving back! Tough luck.");
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (currentSpace == 90) {
                        currentSpace = 48;
                        System.out.println("You landed on a snake and unforntuately for you, you poor soul, you're moving back! Tough luck.");
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (currentSpace == 99) {
                        currentSpace = 77;
                        System.out.println("You landed on a snake and unforntuately for you, you poor soul, you're moving back! Tough luck.");
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (currentSpace == 9) {
                        currentSpace = 34;
                        System.out.println("You landed on a ladder and fortunately for you, you get to advance further! Enjoy your stroke of luck.");
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (currentSpace == 40) {
                        currentSpace = 64;
                        System.out.println("You landed on a ladder and fortunately for you, you get to advance further! Enjoy your stroke of luck.");
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (currentSpace == 67) {
                        currentSpace = 86;
                        System.out.println("You landed on a ladder and fortunately for you, you get to advance further! Enjoy your stroke of luck.");
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (currentSpace == 100) {
                        System.out.println(name1 + " YOU WIN!!!");
                    }
                    if (currentSpace > 100) {
                        currentSpace = currentSpace - sumOfDice;
                        System.out.println(name1 + " you Rick-Rolled past the 100th space!");
                        System.out.println(name1 + " you are now on square " + currentSpace);
                        System.out.println("");
                    }
                    if (sumOfDice == 0) {
                        System.out.println("");
                        System.out.println(name1 + " you forfeit!");
                        System.out.println(name2 + " wins by default!");
                    }
                }
            }
            for (int name2Turn = 0; name2Turn < 1; name2Turn++) {
                if (!(sumOfDice == 0)) {
                    if (!(currentSpace == 100)) {
                        System.out.print(name2 + " enter the sum of the dice: ");
                        sumOfDice2 = input.nextInt();

                        if (sumOfDice2 > 1 && sumOfDice2 < 13) {
                            currentSpace2 = currentSpace2 + sumOfDice2;
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        } else if (sumOfDice2 == 1 || sumOfDice2 > 12) {
                            while (!(sumOfDice2 > 1 && sumOfDice2 < 13)) {
                                System.out.println(name2 + " please enter a sum between 2 and 12...");
                                System.out.println("");
                                System.out.print(name2 + " enter the sum of the dice: ");
                                sumOfDice2 = input.nextInt();
                            }
                            currentSpace2 = currentSpace2 + sumOfDice2;
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }

                        if (currentSpace2 == 54) {
                            currentSpace2 = 19;
                            System.out.println("You landed on a snake and unforntuately for you, you poor soul, you're moving back! Tough luck.");
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }
                        if (currentSpace2 == 90) {
                            currentSpace2 = 48;
                            System.out.println("You landed on a snake and unforntuately for you, you poor soul, you're moving back! Tough luck.");
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }
                        if (currentSpace2 == 99) {
                            currentSpace2 = 77;
                            System.out.println("You landed on a snake and unforntuately for you, you poor soul, you're moving back! Tough luck.");
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }
                        if (currentSpace2 == 9) {
                            currentSpace2 = 34;
                            System.out.println("You landed on a ladder and fortunately for you, you get to advance further! Enjoy your stroke of luck.");
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }
                        if (currentSpace2 == 40) {
                            currentSpace2 = 64;
                            System.out.println("You landed on a ladder and fortunately for you, you get to advance further! Enjoy your stroke of luck.");
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }
                        if (currentSpace2 == 67) {
                            currentSpace2 = 86;
                            System.out.println("You landed on a ladder and fortunately for you, you get to advance further! Enjoy your stroke of luck.");
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }
                        if (currentSpace2 == 100) {
                            System.out.println(name2 + " YOU WIN!!!");
                        }
                        if (currentSpace2 > 100) {
                            currentSpace2 = currentSpace2 - sumOfDice2;
                            System.out.println(name2 + " you Rick-Rolled past the 100th space!");
                            System.out.println(name2 + " you are now on square " + currentSpace2);
                            System.out.println("");
                        }
                        if (sumOfDice2 == 0) {
                            System.out.println("");
                            System.out.println(name2 + " you forfeit!");
                            System.out.println(name1 + " wins by default!");
                        }
                    }
                }
            }
        }
    }
}
