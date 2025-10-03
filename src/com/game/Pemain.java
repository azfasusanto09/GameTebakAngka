/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game;

/**
 *
 * @author zc
 */
//Class Pemain menyimpan data pemain seperti nama dan jumlah kesempatan.

public class Pemain {
    private String nama;
    private int kesempatan;

    // Konstanta static
    public static final int MAX_KESEMPATAN = 5;

    // Constructor
    public Pemain(String nama) {
        this.nama = nama;
        this.kesempatan = MAX_KESEMPATAN;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getKesempatan() {
        return kesempatan;
    }

    // Mengurangi kesempatan jika salah menebak
    public void kurangiKesempatan() {
        kesempatan--;
    }
}