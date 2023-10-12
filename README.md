# POST TEST 2 PBO

Pada Post Test 2 PBO kali ini saya mengambil tema yaitu "Indomaret" dimana pengguna dapat mengelola daftar barang yang ada di Indomaret dengan berbagai menu operasi seperti menambah, melihat, mencari, mengupdate, dan menghapus barang. Program ini menerima masukan dari user. Berikut adalah penjelasn output yang dihasilkan dari program agar user dapat memahami cara kerja program.

# Penjelasan Source Code 

Program ini memiliki beberapa method, properti, dan lain lain yang digunakan untuk mengelola Indomaret. Berikut adalah penjelasan komponen komponen utama yang digunakan dalam program.
   1. **Import Statements (Impor)**
<img width="189" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/34cddc4b-2ed9-47b4-b0c9-1570983cc644">

Pada awal program, terdapat pernyataan impor yang mengimpor kelas-kelas yang diperlukan, seperti Indomaret, ArrayList, Iterator, dan Scanner.

   2. **Deklarasi Kelas (Class Declaration)**
<img width="246" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/fb13e1f5-c70f-450d-9494-8f51596c1751">

Kelas PostTest2 dideklarasikan sebagai kelas terakhir (final), yang berarti kelas ini tidak dapat diwariskan.

   3. **Properties**
<img width="425" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/68469de8-9670-4090-8194-b571bdd023fa">

   - private final ArrayList<Indomaret> daftarBarang: Properti ini adalah ArrayList yang digunakan untuk menyimpan daftar barang. Ini adalah struktur data tempat semua barang disimpan.
   - private final Scanner scanner: Properti ini adalah objek Scanner yang digunakan untuk mengambil masukan dari pengguna melalui keyboard.

   4. **Methods**
  
**1. public final static void main(String[] args)** Metode main adalah titik masuk utama program. Ini digunakan untuk membuat objek PostTest2 dan memulai eksekusi program dengan memanggil metode runMenu()
   <img width="330" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/747dd926-b105-4a17-8aa0-870196933eca">

**2. public final void runMenu()** Metode ini mengatur menu utama program dan mengarahkan aliran eksekusi berdasarkan pilihan pengguna. Ini menggunakan struktur switch-case untuk menangani pilihan pengguna.

   <img width="358" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/95969897-ab51-4938-9241-57edfbfdfaa3">   

   
   
   
   
   
   
**3. public final void tambahBarang()** Metode ini memungkinkan pengguna untuk menambahkan barang ke daftar. Pengguna diminta untuk memasukkan ID, nama, kategori, dan harga barang, dan kemudian barang tersebut ditambahkan ke dalam daftar.

   <img width="410" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/cadbd41d-1342-446e-8b14-2d1203f89e70">   

   
   
   
   
   
**4. public final void lihatDaftarBarang()** Metode ini digunakan untuk menampilkan daftar barang yang ada dalam program. Jika daftar kosong, program mencetak pesan yang sesuai, jika tidak, mencetak daftar barang.

   <img width="354" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/97a700ee-ecf1-4b2f-8895-1275c36d1098">




   
   
   
**5. public final void cariBarang()** Metode ini memungkinkan pengguna untuk mencari barang berdasarkan nama. Jika barang dengan nama yang sesuai ditemukan, informasinya ditampilkan

   <img width="408" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/50528233-5b15-41e1-9da6-e4161575d378">






   
   
   
**6. public final void updateBarang()** Metode ini memungkinkan pengguna memperbarui informasi barang dalam daftar. Pengguna diminta untuk memasukkan nama barang yang akan diupdate, dan jika barang tersebut ditemukan, informasi baru (nama baru, kategori baru, dan harga baru) dimasukkan.

   <img width="704" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/1e954741-c1ca-419d-bfc9-f439c19fa32f">
   
   
   
**7. public final void hapusBarang()** Metode ini memungkinkan pengguna menghapus barang dari daftar berdasarkan nama. Jika barang ditemukan, metode ini akan menghapusnya dari daftar.

   <img width="481" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/ebdc39c8-4b4b-4806-b459-824c31cd840e">
   
   
   
   6. **Looping**
   Terdapat looping while yang digunakan dalam metode runMenu() untuk membuat menu utama program tetap berjalan hingga pengguna memilih untuk keluar.
   <img width="344" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/10a88720-661e-4bda-ae5d-e79b6f2c105a">
   
7. **Iterasi (Iteration)**
   - Terdapat penggunaan for-each loop dalam metode lihatDaftarBarang() untuk  menampilkan semua barang dalam daftar.
   - Terdapat penggunaan iterator dalam metode hapusBarang() untuk menghapus   barang dari daftar saat ditemukan.
   <img width="470" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/ab89ffc8-c703-40c9-a51d-773b45c05331">
  
# Penjelasan Output Program
Cara menggunakan program ini sangat sederhana dan berpusat pada menu yang disediakan kepada user. Berikut adalah langkah-langkah umum untuk menggunakan program

1. Tambah Barang 
Menu ini meminta user untuk memasukkan ID, Nama, Kategori, dan Harga barang yang ingin ditambahkan. Dimana ID dan Harga yang di input harus berupa angka karena memakai tipe data int, kemudian Nama dan Kategori berupa string. Setelah data barang diinput oleh user program akan memberikan pesan "Barang berhasil ditambahkan!"
<img width="206" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/20ece851-ed3a-45b8-88aa-b8cb3f5354a0">




2. Lihat Daftar Barang 
Pada menu ini user dapat melihat daftar nama barang yang telah di input. Jika daftar barang tidak kosong, program akan menampilkan semua barang yang ada dalam daftar. Namun jika daftar kosong, program akan mencetak "Daftar Barang Tidak Ada."
<img width="334" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/e009fdc2-76bc-4f2d-a24a-ed18b137f3d0">




3. Cari Barang 
Menu ini meminta user untuk memasukkan nama barang yang ingin dicari. Jika barang dengan nama yang sesuai ditemukan dalam daftar, program akan mencetak detail barang tersebut. Jika tidak ditemukan, program akan memberikan pesan "Barang tidak ditemukan."
tambahan, pada menu ini jika Nama, Kategori, dan Harga diubah maka akan menampilkan update data barang terbaru, namun untuk ID tetap sama dan tidak dapat diubah karena memakai method final dimana data tidak dapat diubah.
<img width="310" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/2e3d6c90-7490-4a73-b0b5-5230d3e5d2bb">

4. Update Barang 
Menu ini user diminta untuk memasukkan nama barang yang ingin diupdate. Jika nama barang cocok dengan salah satu barang dalam daftar, pengguna diminta untuk memasukkan nama, kategori, dan harga baru. Kemudian, program akan mengupdate barang dengan nilai-nilai baru tersebut dan memberikan pesan "Barang berhasil diupdate!" Jika barang tidak ditemukan, program akan memberikan pesan "Barang tidak ditemukan."
<img width="295" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/59bb16da-b254-46f4-a848-d3bbd9e413ff">

5. Hapus Barang
Menu ini user diminta untuk memasukkan nama barang yang ingin dihapus. Jika barang dengan nama yang cocok ditemukan dalam daftar, program akan menghapusnya dan memberikan pesan "Barang berhasil dihapus!".
<img width="282" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/dbea8418-a6f3-4cc3-99cf-2048028fcc25">


6. Keluar 
Jika user memilih menu ini maka akan mengakhiri program dan akan mencetak pesan "Terima kasih!".
<img width="191" alt="image" src="https://github.com/shafaaz11/post-test-2-PBO/assets/127502125/356b01b9-25d9-4334-a4c3-cfc778584753">


Itu adalah penjelasan singkat cara kerja dari program dengan tema Indomaret. Output yang dihasilkan oleh program akan bergantung pada menu operasi yang dipilih oleh pengguna. 
