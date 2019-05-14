package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array =new int[6];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("\n" + "Nhap gia tri can chen ");
        int value = scanner.nextInt();
        System.out.println("Nhap vi tri can chen");
        int index = scanner.nextInt();

        if (index >= 0 && index < array.length) {
            for (int i = array.length-1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        } else {
            System.out.println("Khong chen duoc phan tu vao mang");
        }
        for (int j = 0; j < array.length-1; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
