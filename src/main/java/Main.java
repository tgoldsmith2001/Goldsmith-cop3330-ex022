/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("How many numbers to enter? ");
        num=input.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<num;i++){
            int temp;
            System.out.format("Enter number %d: ",i+1);
            temp=input.nextInt();
            arr.add(temp);
        }
        int max=0;
        for(int i=0;i<num;i++){
            if(arr.get(i)>max)
                max=arr.get(i);
        }
        System.out.format("The largest number is %d",max);
    }
}
