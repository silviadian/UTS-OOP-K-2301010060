/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoop;

/**
 *
 * @author SILVIA DIAN LESTARI
 * 
 */
public class Tugas {
    private String tugas;
    private String deadline;

    // Constructor untuk inisialisasi tugas dan deadline
    public Tugas(String tugas, String deadline) {
        this.tugas = tugas;
        this.deadline = deadline;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void tampilkanTugas() {
        System.out.println(this); 
    }

    public void ubahTugas(String tugas, String deadline) {
        this.tugas = tugas;
        this.deadline = deadline;
    }

    // Overriding metode toString() untuk menampilkan informasi tugas dan deadline
    @Override
    public String toString() {
        return "Tugas: " + tugas + ", Deadline: " + deadline;
    }
}

