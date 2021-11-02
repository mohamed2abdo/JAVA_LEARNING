package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int z[]=new int[x];
        int k[]=new int[x];
        int q=0;
        //int l=0;

        for (int i = 0; i < x; i++)
        {
            z[i] = input.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            for (int j = 0; j < x; j++)
            {
                int h = z[i];
                //l = 0;
                if (h != z[j])
                {
                    k[q]=z[j];
                    q++;
                }
                q=0;

            }
        }
        System.out.print(k[]);
    }
}
