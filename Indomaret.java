package Indomaret;

public final class Indomaret {
        private final int id;
        private String nama;
        private String kategori;
        private double harga;

        public Indomaret(int id, String nama, String kategori, double harga) {
            this.id = id;
            this.nama = nama;
            this.kategori = kategori;
            this.harga = harga;
        }

        public int getId() {
            return id;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getKategori() {
            return kategori;
        }

        public void setKategori(String kategori) {
            this.kategori = kategori;
        }

        public double getHarga() {
            return harga;
        }

        public void setHarga(double harga) {
            this.harga = harga;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Nama: " + nama + ", Kategori: " + kategori + ", Harga: " + harga;
        }
    }

