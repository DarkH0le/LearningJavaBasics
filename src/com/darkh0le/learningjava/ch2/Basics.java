package com.darkh0le.learningjava.ch2;

//Simple introduction to use the string data type and its methods
public class Basics {

    public static void main(String[] args){

        String userInput = "entertaiment";
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char fCharacter = userInput.charAt(0);
        System.out.println(fCharacter);

        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
    }
}
