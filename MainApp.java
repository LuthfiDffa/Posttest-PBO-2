/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import model.mobilsport;
import service.mobilservice;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mobilservice svc = new mobilservice();
        int pilih;
        
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Mobil");
            System.out.println("2. Lihat Data Mobil");
            System.out.println("3. Ubah Data Mobil");
            System.out.println("4. Hapus Data Mobil");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(in.nextLine());
            
            switch (pilih) {
                case 1 -> {
                    System.out.print("Merk  : ");  String merk = in.nextLine();
                    System.out.print("Model : ");  String model = in.nextLine();
                    System.out.print("Tahun : ");  int tahun = Integer.parseInt(in.nextLine());
                    System.out.print("Harga : ");  String harga = in.nextLine();
                    svc.tambah(new mobilsport(merk, model, tahun, harga));
                }
                case 2 -> svc.tampil();
                case 3 -> {
                    svc.tampil();
                    System.out.print("Nomor data yang diubah: ");
                    int idx = Integer.parseInt(in.nextLine()) - 1;
                    System.out.print("Merk  : ");  String merk = in.nextLine();
                    System.out.print("Model : ");  String model = in.nextLine();
                    System.out.print("Tahun : ");  int tahun = Integer.parseInt(in.nextLine());
                    System.out.print("Harga : ");  String harga = in.nextLine();
                    svc.ubah(idx, new mobilsport(merk, model, tahun, harga));
                }
                case 4 -> {
                    svc.tampil();
                    System.out.print("Nomor data yang dihapus: ");
                    int idx = Integer.parseInt(in.nextLine()) - 1;
                    svc.hapus(idx);
                }
            }
        } while (pilih != 5);
    }
}
