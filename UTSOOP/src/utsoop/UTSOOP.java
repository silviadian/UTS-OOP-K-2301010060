/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsoop;

/**
 *
 * @author SILVIA DIAN LESTARI
 * UTS OOP
 * TGL 10 MEI 2025
 */
import java.util.Scanner;

public class UTSOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarTugas daftarTugas = new DaftarTugas(10); 

        int pilihan;
        do {
            // Menampilkan menu tugas mahasiswa
            System.out.println("\n--- Menu Aplikasi Tugas Mahasiswa ---");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Tugas");
            System.out.println("3. Ubah Tugas");
            System.out.println("4. Hapus Tugas");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1: // Tambah tugas
                    System.out.print("Masukkan nama tugas: ");
                    String tugas = scanner.nextLine();
                    System.out.print("Masukkan deadline tugas: ");
                    String deadline = scanner.nextLine();
                    daftarTugas.tambahTugas(tugas, deadline);
                    break;

                case 2: // Tampilkan tugas
                    daftarTugas.tampilkanTugas();
                    break;

                case 3: // Ubah tugas
                    System.out.print("Masukkan nomor tugas yang ingin diubah: ");
                    int nomorTugas = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Masukkan nama tugas baru: ");
                    String tugasBaru = scanner.nextLine();
                    System.out.print("Masukkan deadline baru: ");
                    String deadlineBaru = scanner.nextLine();
                    daftarTugas.ubahTugas(nomorTugas, tugasBaru, deadlineBaru);
                    break;

                case 4: // Hapus tugas
                    System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                    int nomorHapus = scanner.nextInt() - 1;
                    daftarTugas.hapusTugas(nomorHapus);
                    break;

                case 5: // Keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
