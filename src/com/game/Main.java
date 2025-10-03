/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game;

/**
 *
 * @author zc
 */
import java.util.Scanner;

//Class Main sebagai entry point program.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pemain: ");
        String nama = input.nextLine();

        Pemain pemain = new Pemain(nama);
        TebakAngka game = new TebakAngka(pemain);
        game.mulai();
    }
}