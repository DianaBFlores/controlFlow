package com.company;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.util.regex.Pattern;


public class Main {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput = "";



        do {
        System.out.print("Enter the name of your favorite pet. ");
        String petName = input.next();

        System.out.println("Enter age of your favorite pet");
        int petAge = input.nextInt();

        System.out.println("What is your lucky number?");
        int luckyNum = input.nextInt();

        System.out.println("Do you have a favorite quarterback? If so what is their jersey number?");
        int jerseyNum = input.nextInt();

        System.out.println("What is two-digit model year of your car?");
        int carModel = input.nextInt();

        System.out.println("What is the first name of the your favorite actor or actress?");
        String faveAct = input.next();

        System.out.println("Enter a random number between 1 and 50.");
        int randomNum = input.nextInt();



        int magicBall = luckyNum * randomNum;
        if(magicBall > 75) {
        magicBall = (magicBall % 75) + 1;
        }


        int lottoNum1 = petName.charAt(2);
        if(lottoNum1 > 65) {
        lottoNum1 = (lottoNum1 % 65) + 1;
        }


        int lottoNum2 = carModel + luckyNum;
        if(lottoNum2 > 65) {
        lottoNum2 = (lottoNum2 % 65) + 1;
        }

        int lottNum3 = 42;


        int lottoNum4 = faveAct.charAt(0);
        if(lottoNum4 > 65) {
        lottoNum4 = (lottoNum4 % 65) + 1;
        }


        int lottoNum5 = faveAct.charAt(faveAct.length() - 1);
        if(lottoNum5 > 65) {
        lottoNum5 = (lottoNum5 % 65) + 1;
        }


        System.out.println("Lottery number:" + lottoNum1 + "," + lottoNum2 + "," + lottNum3 + "," + lottoNum4 + "," + lottoNum5);
        System.out.println("Magic ball:" + magicBall);
        System.out.println("Do you want to play again? No = n / Yes = y");

        userInput = input.next();

        } while(!userInput.equals("n"));




        }


        }


