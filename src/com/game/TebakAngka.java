/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game;

/**
 *
 * @author zc
 */
import java.util.Random;
import java.util.Scanner;

/**
 * Class TebakAngka berisi logika utama permainan.
 */
public class TebakAngka {
    private int angkaRahasia;
    private Pemain pemain;
    private int[] riwayatTebakan; // array untuk menyimpan tebakan
    private int riwayatIndex;

    // Constructor
    public TebakAngka(Pemain pemain) {
        this.pemain = pemain;
        this.angkaRahasia = new Random().nextInt(100) + 1; // angka 1–100
        this.riwayatTebakan = new int[Pemain.MAX_KESEMPATAN];
        this.riwayatIndex = 0;
    }

    // Method utama game
    public void mulai() {
        Scanner input = new Scanner(System.in);
        System.out.println("Halo " + pemain.getNama().toUpperCase() + "! Selamat bermain Tebak Angka.");
        System.out.println("Saya sudah memilih angka antara 1 sampai 100.");
        System.out.println("Kamu punya " + Pemain.MAX_KESEMPATAN + " kesempatan.");

        while (pemain.getKesempatan() > 0) {
            System.out.print("Masukkan tebakanmu: ");
            int tebakan;

            try {
                tebakan = input.nextInt();
            } catch (Exception e) {
                System.out.println("❌ Input harus berupa angka!");
                input.next(); // buang input salah
                continue;
            }

            // Simpan ke riwayat tebakan
            riwayatTebakan[riwayatIndex++] = tebakan;

            if (tebakan == angkaRahasia) {
                int skor = pemain.getKesempatan() * 20; // bonus skor
                System.out.println("Selamat " + pemain.getNama() + "! Kamu berhasil menebak dengan benar.");
                System.out.println("Skor kamu: " + skor);
                tampilkanRiwayat();
                return;
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else {
                System.out.println("Terlalu kecil!");
            }

            pemain.kurangiKesempatan();
            System.out.println("Sisa kesempatan: " + pemain.getKesempatan());
        }

        System.out.println("HAHAHAAA, kesempatan habis! Angka yang benar adalah: " + angkaRahasia);
        tampilkanRiwayat();
    }

    // Menampilkan riwayat tebakan
    private void tampilkanRiwayat() {
        System.out.println("=== Riwayat Tebakan Kamu ===");
        for (int i = 0; i < riwayatIndex; i++) {
            System.out.print(riwayatTebakan[i] + " ");
        }
        System.out.println("\n============================");
    }
}