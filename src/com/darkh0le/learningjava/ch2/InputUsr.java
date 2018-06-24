package com.darkh0le.learningjava.ch2;
import java.util.Scanner;

//Class for getting some input from the user and print those out

public class InputUsr {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String userInput;
        int num;

        System.out.println("Enter any word: ");
        userInput = sc.next();

        System.out.println("You entered: " + userInput);

        System.out.println("Type a number: ");
        num = sc.nextInt();

        System.out.println("Number: " + num);

    }
}
