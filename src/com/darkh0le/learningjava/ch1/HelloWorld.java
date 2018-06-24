package com.darkh0le.learningjava.ch1;

import java.awt.*;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Ivan Aldama");

        Car myCar = new Car(18,
                "HGGL19", Color.BLACK, true);

        System.out.println("Ivan's car color: " + myCar.paintColor);
        myCar.changePaintColor(Color.BLUE);


    }
}
