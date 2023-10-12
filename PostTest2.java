package com.mycompany.post.test2;

import Indomaret.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class PostTest2 {
    private final ArrayList<Indomaret> daftarBarang = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public final static void main(String[] args) {
        PostTest2 barangManagement = new PostTest2();
        barangManagement.runMenu();
    }

    public final void runMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Daftar Barang");
            System.out.println("3. Cari Barang");
            System.out.println("4. Update Barang");
            System.out.println("5. Hapus Barang");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tambahBarang();
                    break;

                case "2":
                    lihatDaftarBarang();
                    break;

                case "3":
                    cariBarang();
                    break;

                case "4":
                    updateBarang();
                    break;

                case "5":
                    hapusBarang();
                    break;

                case "6":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public final void tambahBarang() {
        System.out.print("Masukkan ID Barang: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kategori Barang: ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan Harga Barang: ");
        double harga = Double.parseDouble(scanner.nextLine());

        Indomaret barang = new Indomaret(id, nama, kategori, harga);
        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan!");
    }

    public final void lihatDaftarBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Daftar Barang Tidak Ada");
        } else {
            System.out.println("Daftar Barang:");
            for (Indomaret b : daftarBarang) {
                System.out.println(b);
            }
        }
    }

    public final void cariBarang() {
        System.out.print("Masukkan Nama Barang yang dicari: ");
        String namaCari = scanner.nextLine();
        boolean ditemukan = false;

        for (Indomaret b : daftarBarang) {
            if (b.getNama().equalsIgnoreCase(namaCari)) {
                System.out.println("Barang ditemukan:");
                System.out.println(b);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public final void updateBarang() {
        System.out.print("Masukkan Nama Barang yang akan diupdate: ");
        String namaUpdate = scanner.nextLine();
        boolean ditemukanUpdate = false;

        for (int i = 0; i < daftarBarang.size(); i++) {
            Indomaret b = daftarBarang.get(i);
            if (b.getNama().equalsIgnoreCase(namaUpdate)) {
                System.out.print("Masukkan Nama Baru: ");
                String namaBaru = scanner.nextLine();

                System.out.print("Masukkan Kategori Baru: ");
                String kategoriBaru = scanner.nextLine();

                System.out.print("Masukkan Harga Baru: ");
                double hargaBaru = Double.parseDouble(scanner.nextLine());

                Indomaret barangBaru = new Indomaret(b.getId(), namaBaru, kategoriBaru, hargaBaru);

                daftarBarang.set(i, barangBaru);

                System.out.println("Barang berhasil diupdate!");
                ditemukanUpdate = true;
                break;
            }
        }

        if (!ditemukanUpdate) {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public final void hapusBarang() {
        System.out.print("Masukan nama barang yang ingin dihapus: ");
        String namaHapus = scanner.nextLine();

        Iterator<Indomaret> iterator = daftarBarang.iterator();
        while (iterator.hasNext()) {
            Indomaret objekBarang = iterator.next();
            if (objekBarang.getNama().equalsIgnoreCase(namaHapus)) {
                iterator.remove();
                System.out.println("Barang berhasil dihapus!");
            }
        }
    }
}
