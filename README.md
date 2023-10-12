# POST TEST 2 PBO

Pada Post Test 2 PBO kali ini saya mengambil tema yaitu "Indomaret" dimana pengguna dapat mengelola daftar barang yang ada di Indomaret dengan berbagai menu operasi seperti menambah, melihat, mencari, mengupdate, dan menghapus barang. Program ini menerima masukan dari user. Berikut adalah penjelasn output yang dihasilkan dari program agar user dapat memahami cara kerja program.

# Penjelasan Method 

Program ini memiliki beberapa method dan digunakan untuk mengelola daftar barang di toko. Berikut adalah penjelasan singkat mengenai codingan ini dan method yang digunakan:

1. **Import Statements (Impor)**: Pada awal program, terdapat pernyataan impor yang mengimpor kelas-kelas yang diperlukan, seperti `Indomaret`, `ArrayList`, `Iterator`, dan `Scanner`.

2. **Deklarasi Kelas (Class Declaration)**: Kelas `PostTest2` dideklarasikan sebagai kelas terakhir (final), yang berarti kelas ini tidak dapat diwariskan.

3. **Variabel Anggota (Instance Variables)**:
   - `private final ArrayList<Indomaret> daftarBarang`: Ini adalah ArrayList yang digunakan untuk menyimpan daftar barang dari kelas `Indomaret`.
   - `private Scanner scanner`: Ini adalah objek `Scanner` yang digunakan untuk mengambil masukan dari pengguna.

4. **Metode Utama (Main Method)**: Metode `main` adalah titik masuk utama program. Ketika program dijalankan, objek `PostTest2` dibuat, dan metode `runMenu()` dipanggil untuk memulai eksekusi program.

5. **Metode `runMenu()`**: Metode ini adalah metode yang mengelola menu utama program. Pengguna dapat memilih tindakan yang ingin dilakukan dengan memasukkan nomor pilihan. Ini menggunakan struktur `switch-case` untuk memproses pilihan pengguna.

6. **Metode `lihatDaftarBarang()`**: Metode ini digunakan untuk menampilkan daftar barang yang ada dalam `daftarBarang`. Jika daftar kosong, akan mencetak pesan yang sesuai.

7. **Metode `cariBarang()`**: Metode ini memungkinkan pengguna mencari barang berdasarkan nama. Hasil pencarian akan ditampilkan jika barang ditemukan.

8. **Metode `updateBarang()`**: Metode ini memungkinkan pengguna memperbarui informasi barang berdasarkan nama. Jika barang ditemukan, pengguna diminta memasukkan informasi baru, dan barang akan diperbarui.

9. **Metode `hapusBarang()`**: Metode ini memungkinkan pengguna menghapus barang berdasarkan nama. Jika barang ditemukan, barang tersebut akan dihapus dari daftar.

# Penjelasan Output Program
1. Tambah Barang 
Menu ini meminta user untuk memasukkan ID, Nama, Kategori, dan Harga barang yang ingin ditambahkan. Dimana ID dan Harga yang di input harus berupa angka karena memakai tipe data int, kemudian Nama dan Kategori berupa string. Setelah data barang diinput oleh user program akan memberikan pesan "Barang berhasil ditambahkan!"
2. Lihat Daftar Barang 
Pada menu ini user dapat melihat daftar nama barang yang telah di input. Jika daftar barang tidak kosong, program akan menampilkan semua barang yang ada dalam daftar. Namun jika daftar kosong, program akan mencetak "Daftar Barang Tidak Ada."
3. Cari Barang 
Menu ini meminta user untuk memasukkan nama barang yang ingin dicari. Jika barang dengan nama yang sesuai ditemukan dalam daftar, program akan mencetak detail barang tersebut. Jika tidak ditemukan, program akan memberikan pesan "Barang tidak ditemukan."
tambahan, pada menu ini jika Nama, Kategori, dan Harga diubah maka akan menampilkan update data barang terbaru, namun untuk ID tetap sama dan tidak dapat diubah karena memakai method final dimana data tidak dapat diubah.
4. Update Barang 
Menu ini user diminta untuk memasukkan nama barang yang ingin diupdate. Jika nama barang cocok dengan salah satu barang dalam daftar, pengguna diminta untuk memasukkan nama, kategori, dan harga baru. Kemudian, program akan mengupdate barang dengan nilai-nilai baru tersebut dan memberikan pesan "Barang berhasil diupdate!" Jika barang tidak ditemukan, program akan memberikan pesan "Barang tidak ditemukan."
5. Hapus Barang
Menu ini user diminta untuk memasukkan nama barang yang ingin dihapus. Jika barang dengan nama yang cocok ditemukan dalam daftar, program akan menghapusnya dan memberikan pesan "Barang berhasil dihapus!".


  # 6. Keluar 
Jika user memilih menu ini maka akan mengakhiri program dan akan mencetak pesan "Terima kasih!".

Itu adalah penjelasan singkat cara kerja dari program dengan tema Indomaret. Output yang dihasilkan oleh program akan bergantung pada menu operasi yang dipilih oleh pengguna. 
