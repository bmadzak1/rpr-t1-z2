package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int n = ulaz.nextInt();
        System.out.print("Brojevi djeljivi sa sumom svojih cifara od 1 do " + n + " su: ");
        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0){
                System.out.print(i + " ");
            }
        }
    }

    private static int sumaCifara(int n) {
        int suma = 0;
        do {
            suma += n % 10;
            n /= 10;
        }
        while (n > 0);
        return suma;
    }
}