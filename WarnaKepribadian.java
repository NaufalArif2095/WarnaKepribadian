/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/*
 * @author
 * NAMA    : Naufal Arif Maulana
 * KELAS   : PBO12
 * NIM     : 23176026
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 * warna kepribadian
 */

import java.util.Scanner;

public class WarnaKepribadian {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(RED + "YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU" + RESET);
        System.out.println();
        System.out.println(RED + "MERAH" + RESET + ", " + GREEN + "HIJAU" + RESET + ", " + YELLOW + "KUNING" + RESET + ", " + BLUE + "BIRU" + RESET + ", " + PURPLE + "UNGU" + RESET);
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = scanner.next().toUpperCase();

        System.out.print("NAMA KAMU : ");
        String nama = scanner.next();

        System.out.println();
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");

        switch (warna) {
            case "MERAH":
                System.out.println("Warna Favoritmu adalah " + RED + "MERAH" + RESET);
                System.out.println(RED + "1. Periang," + RESET);
                System.out.println(RED + "2. Pemberani," + RESET);
                System.out.println(RED + "3. Berani mengambil risiko dalam setiap langkah," + RESET);
                System.out.println(RED + "4. Menyukai tantangan," + RESET);
                System.out.println(RED + "5. Kurang sabar," + RESET);
                System.out.println(RED + "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol," + RESET);
                System.out.println(RED + "7. Memiliki energi kehangatan dan cinta." + RESET);
                break;
            case "HIJAU":
                System.out.println("Warna Favoritmu adalah " + GREEN + "HIJAU" + RESET);
                System.out.println(GREEN + "1. Romantis," + RESET);
                System.out.println(GREEN + "2. Menyukai hal yang berbau alami dan keindahan," + RESET);
                System.out.println(GREEN + "3. Teguh pada prinsip," + RESET);
                System.out.println(GREEN + "4. Menginginkan kesempurnaan," + RESET);
                System.out.println(GREEN + "5. Mudah cemburu," + RESET);
                System.out.println(GREEN + "6. Mudah merasa iri," + RESET);
                System.out.println(GREEN + "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan." + RESET);
                break;
            case "KUNING":
                System.out.println("Warna Favoritmu adalah " + YELLOW + "KUNING" + RESET);
                System.out.println(YELLOW + "1. Optimis," + RESET);
                System.out.println(YELLOW + "2. Suka bergaul," + RESET);
                System.out.println(YELLOW + "3. Periang," + RESET);
                System.out.println(YELLOW + "4. Senang menolong," + RESET);
                System.out.println(YELLOW + "5. Lincah dan aktif," + RESET);
                System.out.println(YELLOW + "6. Tidak suka meremehkan kekurangan orang lain," + RESET);
                System.out.println(YELLOW + "7. Loyal," + RESET);
                System.out.println(YELLOW + "8. Hangat," + RESET);
                System.out.println(YELLOW + "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil," + RESET);
                System.out.println(YELLOW + "10. Cenderung penakut." + RESET);
                break;
            case "BIRU":
                System.out.println("Warna Favoritmu adalah " + BLUE + "BIRU" + RESET);
                System.out.println(BLUE + "1. Menyenangkan," + RESET);
                System.out.println(BLUE + "2. Bijaksana," + RESET);
                System.out.println(BLUE + "3. Pembawaan diri tenang saat menghadapi masalah," + RESET);
                System.out.println(BLUE + "4. Dinamis," + RESET);
                System.out.println(BLUE + "5. Senang berbagi," + RESET);
                System.out.println(BLUE + "6. Bersahabat," + RESET);
                System.out.println(BLUE + "7. Tidak terlalu suka menjadi sorotan banyak orang," + RESET);
                System.out.println(BLUE + "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai." + RESET);
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu adalah " + PURPLE + "UNGU" + RESET);
                System.out.println(PURPLE + "1. Optimis," + RESET);
                System.out.println(PURPLE + "2. Tidak pernah ragu," + RESET);
                System.out.println(PURPLE + "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat," + RESET);
                System.out.println(PURPLE + "4. Memiliki ambisi yang besar," + RESET);
                System.out.println(PURPLE + "5. Memiliki empati yang besar," + RESET);
                System.out.println(PURPLE + "6. Memiliki sisi misterius sebab seringkali menutupi perasaannya," + RESET);
                System.out.println(PURPLE + "7. Terkadang bersikap keras kepala dan angkuh." + RESET);
                break;
            default:
                System.out.println("Oops! Warna tidak valid, silakan coba lagi.");
                break;
        }

        scanner.close();
    }
}
