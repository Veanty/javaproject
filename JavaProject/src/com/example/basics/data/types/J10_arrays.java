package com.example.basics.data.types;

import java.sql.SQLOutput;

public class J10_arrays {public static void main(String args[]){
    int numArr[] = new int[10];
    numArr[1] = 7;
    System.out.println("numArr[1]: " + numArr[1] + "\n numARrr.length: " + numArr.length);
    float floatsArr[] = {10.1f, 78.2f, 65.4f, -22.8f};
    floatsArr[0] = 1.0f;

    System.out.println("floatsArr[1]: " + floatsArr[1] + "\n floatsArr.length: " + floatsArr.length);

    String strArr[] = new String[7];
    System.out.println("strArr[1]: " + strArr[1]);
    String namesArr[] = {"Ola", "Ania", "Karol"};
    System.out.println("namesArr[1]: " + namesArr[1]);
    }
}
