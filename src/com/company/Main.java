package com.company;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.util.regex.Pattern;


class AsciiChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int random1 = (int) (Math.random() * 75);
        int random2 = (int) (Math.random() * 65);
        Pattern pattern = Pattern.compile("[A-Za-z]*");

        printNumbers();
        printLowerCase();
        printUpperCase();

        System.out.println(" ");

        //  questions

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Would you like to continue? y/n");
        String answer = input.nextLine().trim();

        while (answer != null) {

            if (answer.equals("y") || answer.equals("Y") || answer.equals("Yes") || answer.equals("yes")) {

                //declarations
                String redCar = "";
                String petName = "";
                int petAge;
                int lucky = 0;
                String answerQ = "";
                int numQB = 0;
                int carNum = 0;
                String actorName = "";
                int randomNum = 0;


                System.out.println("Do you have a red car? (yes/no)");
                redCar = input.nextLine();


                System.out.println ("What is the name of a favorite pet?");
                petName = input.nextLine();


                System.out.println("What is the age of a favorite pet?");
                petAge = input.nextInt();

                System.out.println("What is your lucky number?");
                lucky = input.nextInt();

                System.out.println("Do you have a favorite quarterback? (yes/no)");
                answerQ = input.nextLine();
                answerQ = input.nextLine();


                if (answerQ.equals("yes") || answerQ.equals("Yes")) {
                    System.out.println("What is their jersey number?");
                    numQB = input.nextInt();

                }

                System.out.println("What is the two-digit model year of your car?");
                carNum = input.nextInt();


                System.out.println("What is the first name of your favorite actor?");
                actorName = input.nextLine();
                actorName = input.nextLine();


                System.out.println("Enter a random number between 1 and 50.");
                randomNum = input.nextInt();
                // System.out.printf("\"%s\" is not a valid response, please enter a number.\n", randomNum);
                // }

                try {
                    System.out.println("Calculating your lottery numbers...");
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }

                int magicBall = 0;

                if (numQB != 0) {
                    magicBall = numQB;
                } else {
                    magicBall = lucky * random1;
                    while (magicBall > 75) {
                        magicBall -= 75;
                    }
                }

                // Random Lottery Number 1 ; * Use the two digit model year of their car and add
                // their lucky number to it.
                int luckNum1 = carNum * lucky;
                while (luckNum1 > 65) {
                    luckNum1 -= 65;
                }

                int luckNum2 = randomNum - random2;
                if (luckNum2 < 0) {
                    luckNum2 += random2;
                }


                int luckNum3 = petAge + carNum;
                if (luckNum3 > 65) {
                    luckNum3 -= 65;
                }

                // Random Lottery Number 4 ; Use the first letter of actor first letter.
                int luckNum4 = actorName.charAt(0);
                while (luckNum4 > 65) {
                    luckNum4 -= 65;
                }

                // Random Lottery Number 5 ; Use the second letter of pet name.
                int luckNum5 = petName.charAt(1);
                while (luckNum5 > 65) {
                    luckNum5 -= 65;
                }

                // Final Output
                System.out.println(" ");
                System.out.println("Lottery Numbers: " + luckNum1 + ", " + luckNum2 + ", " + luckNum3 + ", " + luckNum4 + ", " + luckNum5 + ", "
                        + "Magic Ball: " + magicBall);
                System.out.println(" ");

                System.out.println("Do you want to play again??");
                String cont = input.nextLine();
                cont = input.nextLine();

                if(cont.equals("No") || cont.equals("no")){
                    System.out.println("Thank you for playing!");
                    break;
                }

            } else {
                System.out.println("thank you! see you next time");
                break;
            }
        }

        input.close();
    }

    public static void printNumbers() {

        for (int x = 48; x < 58; x++) {
            char num = (char) x;
            System.out.print(num);
        }

    }

    public static void printLowerCase() {

        for (int x = 97; x < 123; x++) {
            char num = (char) x;
            System.out.print(num);
        }

    }

    public static void printUpperCase(){

        for (int x = 65; x < 91; x++) {
            char num = (char) x;
            System.out.print(num);
        }

    }

}


