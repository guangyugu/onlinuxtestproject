package com.gugy.onlinux;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class OnlinuxApplicationTests {

    @Test
    String testone(){
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int i = 1;
        if (i==j) {
            System.out.println("第一个return");
            return null;
        }
        System.out.println("123");
        return "123";
    }
}
