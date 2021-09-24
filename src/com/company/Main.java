package com.company;
import java.lang.String;
import java.util.Random;
import java.util.Scanner;
public class Main {
private float solution(){

    return 0;
}
    public static void main(String[] args) {
        Person man = new Person(100, 12);
        Student guy = new Student(123, 17,2);
        guy.tell();
        man.say(" Guy!\n");
        Scanner scan = new Scanner(System.in);
            int first, second;
            boolean isTrue = false;
            System.out.print("Enter first number ");
            first = scan.nextInt();
            System.out.print("Enter second number ");
            second = scan.nextInt();
            float result = first * second;
            isTrue = first >= second;
            result = first==12 ? 23:32;
        if(first >= second){
            System.out.println("First higher or equal than second \n");
        } else if(first < second){
            System.out.println("first lower than \n" + second);
        }else {
            System.out.println("Unknown result \n");
        }
        switch(first){
            case 51:
                System.out.print("Num is equal 51");
                break;
            case 43:
                System.out.print("Num is equal 43");
                break;
            default:
        }
        int[] a; a = new int[5];
        int[] name; name = new int[]{1,4,32,552};
for(int i = 0; i <5; i++){
    System.out.print("Enter a[" + i + "] =");
    a[i] = scan.nextInt();
}
float[][] array = new float[2][2];
for(int i = 0; i < array.length; i++) array[i] = new float[2];
array[0][1] = 2.5f;
System.out.print(array[0][1]);
//        System.out.print("Your string is: \n" + str.nextLine());

//        byte num = -128;
//        int num1 = 323432321;
//float num2 = 24.54f;
//double nem3 = 24.4325324d;
//boolean cond = false;
//char ans = 's';
//String sent = "Hello!";
//        System.out.println(sent);
    }
}
