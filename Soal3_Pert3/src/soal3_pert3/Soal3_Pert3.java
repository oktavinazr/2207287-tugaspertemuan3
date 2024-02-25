/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3_pert3;

/**
 * @author Oktavina Zahra R
 */
import java.util.Scanner;

public class Soal3_Pert3 {

    public static void main(String[] args) {
        Scanner jam = new Scanner(System.in);

        System.out.print("Masukkan jam masuk kerja (1-12): ");
        int jamMasuk = jam.nextInt();

        System.out.print("Masukkan jam keluar kerja (1-12): ");
        int jamKeluar = jam.nextInt();

        if (jamMasuk < 1 || jamMasuk > 12 || jamKeluar < 1 || jamKeluar > 12) {
            System.out.println("\nFormat salah. Jam masuk dan keluar harus antara 1-12.");
            return;
        }

        int lamaBekerja = (jamKeluar - jamMasuk + 12) % 12;

        if (lamaBekerja == 0) {
            System.out.println("\nLama Bekerja 12 Jam");
        } else if (lamaBekerja <= 12) {
            System.out.println("\nLama Bekerja " + lamaBekerja + " Jam");
        } else {
            System.out.println("\nTidak boleh bekerja lebih dari 12 jam");
        }
    }
    
}
