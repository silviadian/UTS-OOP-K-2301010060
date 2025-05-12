/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoop;

/**
 *
 * @author SILVIA DIAN LESTARI
 * UTS OOP
 * TGL 10 MEI 2025
 */
import java.util.Scanner;

public class DaftarTugas {
    private Tugas[] daftarTugas;
    private int jumlahTugas;

    public DaftarTugas(int kapasitas) {
        daftarTugas = new Tugas[kapasitas];
        jumlahTugas = 0;
    }

    // Method untuk menambahkan tugas
    public void tambahTugas(String tugas, String deadline) {
        if (jumlahTugas < daftarTugas.length) {
            daftarTugas[jumlahTugas] = new Tugas(tugas, deadline);
            jumlahTugas++;
        } else {
            System.out.println("Daftar tugas penuh!");
        }
    }

    // Method untuk menampilkan semua tugas
    public void tampilkanTugas() {
        if (jumlahTugas == 0) {
            System.out.println("Tidak ada tugas yang tersimpan.");
        } else {
            for (int i = 0; i < jumlahTugas; i++) {
                System.out.print((i + 1) + ". ");
                System.out.println(daftarTugas[i]); 
            }
        }
    }

    // Method untuk mengubah tugas berdasarkan index
    public void ubahTugas(int index, String tugas, String deadline) {
        if (index >= 0 && index < jumlahTugas) {
            daftarTugas[index].ubahTugas(tugas, deadline);
            System.out.println("Tugas berhasil diubah!");
        } else {
            System.out.println("Tugas tidak ditemukan.");
        }
    }

    // Method untuk menghapus tugas berdasarkan index
    public void hapusTugas(int index) {
        if (index >= 0 && index < jumlahTugas) {
            for (int i = index; i < jumlahTugas - 1; i++) {
                daftarTugas[i] = daftarTugas[i + 1];
            }
            daftarTugas[jumlahTugas - 1] = null;
            jumlahTugas--;
            System.out.println("Tugas berhasil dihapus!");
        } else {
            System.out.println("Tugas tidak ditemukan.");
        }
    }
}

