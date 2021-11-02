package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.print("Enter the integers between 1 and 50: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int z[]=new int[x];
        int k[]=new int[x];
        int l=0;

        for(int i=0;i<x;i++)
        {
            z [i]= input.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            int h=z[i];
            l=0;
            for(int j=0;j<x;j++)
            {
                if(h==z[j])
                {
                    l++;
                }
            }
        }


    }
}
