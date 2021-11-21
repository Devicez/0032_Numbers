package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder output = new StringBuilder();

        if(n<2 || n > 1000)
        {
            System.out.println("Error");
            System.exit(0);
        }

        for (int i=0;i<n;i++)
        {
            list.add(input.nextInt());
        }

        Collections.sort(list);

        if(list.get(0) == 0)
        {
            for(int i=1;i<n;i++)
            {
                if(list.get(i)!=0)
                {
                    int temp = list.get(0);
                    list.set(0,list.get(i));
                    list.set(i,temp);
                    break;
                }
            }
        }

        for (int i=0;i<n;i++)
        {
            output.append(list.get(i));
        }

        System.out.println(output);
    }
}
