package com.darkh0le.learningjava.ch2;

//Working with arrays

public class ArrayS {

    public static void main(String[] args){

        //Declaring and array
        //Typing new int[5] help us to allocate space for the array
        int[] numbers = new int[5];

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;

        //Same as above

        int[] numbers2 = {0,1,2,3,4};

        String[] candyBar = {"Twinx", "Hershey","Crunch"};

        System.out.println("Your favorite candies aree: ");
        for(String candy : candyBar){
            System.out.println("- " + candy);
        }
    }


}
