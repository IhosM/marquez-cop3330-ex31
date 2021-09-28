/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise31;
import java.util.Scanner;

public class Solution31
{
    public static int karvonenHeartRate(int intensity, int resting, int age)
    {
        double heartRate = (((220 - age) - resting) * (intensity / 100.0)) + resting;
        return (int) heartRate;
    }
    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your Resting Pulse: ");
        int resting = scan.nextInt();
        System.out.print("Please enter your Age: ");
        int age = scan.nextInt();

        System.out.println("Intensity   | Rate");
        System.out.println("----------- | ----------");
        for(int intensity = 55; intensity <=95; intensity += 5)
        {
            int heartRate = karvonenHeartRate(intensity, resting, age);
            System.out.println(intensity + "%\t \t \t| \t" + heartRate + " bpm");
        }
        scan.close();
    }
}
