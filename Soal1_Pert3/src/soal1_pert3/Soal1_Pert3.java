/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1_pert3;

/**
 * @author Oktavina Zahra R
 */
import java.util.Scanner;

public class Soal1_Pert3 {

    public static void main(String[] args) {
        Scanner huruf = new Scanner(System.in);

        System.out.print("Masukkan huruf pertama: ");
        char a = huruf.next().charAt(0);

        System.out.print("Masukkan huruf kedua: ");
        char b = huruf.next().charAt(0);

        System.out.print("Masukkan huruf ketiga: ");
        char c = huruf.next().charAt(0);

        boolean periksaHuruf = konsonan(a) && vokal(b) && konsonan(c);

        if (periksaHuruf) {
            System.out.println("\nUrutan huruf " + a + " - " + b + " - " + c + " adalah konsonan - vokal - konsonan.");
        } else {
            System.out.println("\nUrutan huruf " + a + " - " + b + " - " + c + " bukan konsonan - vokal - konsonan.");
        }
    }

    private static boolean konsonan(char karakter) {
        return karakter >= 'a' && karakter <= 'z' && !"aeiou".contains(String.valueOf(karakter));
    }

    private static boolean vokal(char karakter) {
        return "aeiou".contains(String.valueOf(karakter));
    }
}
