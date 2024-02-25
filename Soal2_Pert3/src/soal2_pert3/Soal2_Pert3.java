/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2_pert3;

/**
 * @author Oktavina Zahra R
 */
import java.util.Scanner;

public class Soal2_Pert3 {

    public static void main(String[] args) {
        Scanner sisi = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        int a = sisi.nextInt();

        System.out.print("Masukkan sisi kedua: ");
        int b = sisi.nextInt();

        System.out.print("Masukkan sisi ketiga: ");
        int c = sisi.nextInt();

        boolean kubus = a==b && b==c;

        if (kubus) {
            System.out.println("\nTemasuk Kubus");
        } else {
            System.out.println("\nBukan Kubus");
        }
    }
    
}
