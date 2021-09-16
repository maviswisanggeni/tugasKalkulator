package com.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("kalkulator Matematika");
        Scanner angka = new Scanner(System.in);
        Scanner pilih = new Scanner(System.in);

        System.out.print("Masukkan Angka 1: ");
        int nilai1 = angka.nextInt();
        System.out.print("Masukkan Angka 2: ");
        int nilai2 = angka.nextInt();
        System.out.println("########## KALKULATOR ##########\n" +
                "[1] PENJUMLAHAN\n" +
                "[2] PENGURANGAN\n" +
                "[3] PERKALIAN\n" +
                "[4] PEMBAGIAN\n" +
                "[5] SISA BAGI\n");
        System.out.print("Pilih: ");
        int Pilihan = pilih.nextInt();

        if(Pilihan == 1) {
            int hasilJumlah = nilai1 + nilai2;
            System.out.print("Hasil penjumlahan dari " + nilai1 + " dan " + nilai2 + " adalah " + hasilJumlah);
        } else if(Pilihan == 2) {
            int hasilKurang = nilai1 - nilai2;
            System.out.println("Hasil pengurangan dari " + nilai1 + " dan " + nilai2 + " adalah " + hasilKurang);
        } else if(Pilihan == 3) {
            int hasilkali = nilai1 * nilai2;
            System.out.println("Hasil perkalian dari " + nilai1 + " dan " + nilai2 + " adalah " + hasilkali);
        } else if(Pilihan == 4) {
            double angka1 = nilai1;
            double angka2 = nilai2;
            double hasilBagi = angka1 / angka2;
            System.out.println("Hasil pembagian dari " + nilai1 + " dan " + nilai2 + " adalah " + hasilBagi);
        } else if(Pilihan == 5) {
            int hasilSisa = nilai1 % nilai2;
            System.out.println("Hasil sisa bagi dari " + nilai1 + " dan " + nilai2 + " adalah " + hasilSisa);
        } else {
            System.out.println("ANGKA SALAH!");
        }
    }
}
