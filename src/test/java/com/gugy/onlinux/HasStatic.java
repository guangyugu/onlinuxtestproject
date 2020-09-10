package com.gugy.onlinux;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class HasStatic{
           public static void main(String[] args){
               String x="fmn";
               x.toUpperCase();
               String y=x.replace('f','F');
               y=y+"wxy";
               System.out.println(y);

           }

   static String testone(){
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int i = 1;
        if (i==j)
            return null;
        String ss = "123321";
        return ss;
    }
       }

