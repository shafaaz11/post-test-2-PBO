# POST TEST 2 PBO

Pada Post Test 2 PBO kali ini saya mengambil tema yaitu "Indomaret" dimana pengguna dapat mengelola daftar barang yang ada di Indomaret dengan berbagai menu operasi seperti menambah, melihat, mencari, mengupdate, dan menghapus barang. Program ini menerima masukan dari user. Berikut adalah penjelasn output yang dihasilkan dari program agar user dapat memahami cara kerja program.

  # Tambah Barang 
Menu ini meminta user untuk memasukkan ID, Nama, Kategori, dan Harga barang yang ingin ditambahkan. Dimana ID dan Harga yang di input harus berupa angka karena memakai tipe data int, kemudian Nama dan Kategori berupa string. Setelah data barang diinput oleh user program akan memberikan pesan "Barang berhasil ditambahkan!"

  # Lihat Daftar Barang: 
Pada menu ini user dapat melihat daftar nama barang yang telah di input. Jika daftar barang tidak kosong, program akan menampilkan semua barang yang ada dalam daftar. Namun jika daftar kosong, program akan mencetak "Daftar Barang Tidak Ada."

  # Cari Barang 
Menu ini meminta user untuk memasukkan nama barang yang ingin dicari. Jika barang dengan nama yang sesuai ditemukan dalam daftar, program akan mencetak detail barang tersebut. Jika tidak ditemukan, program akan memberikan pesan "Barang tidak ditemukan."

tambahan, pada menu ini jika Nama, Kategori, dan Harga diubah maka akan menampilkan update data barang terbaru, namun untuk ID tetap sama dan tidak dapat diubah karena memakai method final dimana data tidak dapat diubah.

  # Update Barang 
Menu ini user diminta untuk memasukkan nama barang yang ingin diupdate. Jika nama barang cocok dengan salah satu barang dalam daftar, pengguna diminta untuk memasukkan nama, kategori, dan harga baru. Kemudian, program akan mengupdate barang dengan nilai-nilai baru tersebut dan memberikan pesan "Barang berhasil diupdate!" Jika barang tidak ditemukan, program akan memberikan pesan "Barang tidak ditemukan."

  # Hapus Barang
Menu ini user diminta untuk memasukkan nama barang yang ingin dihapus. Jika barang dengan nama yang cocok ditemukan dalam daftar, program akan menghapusnya dan memberikan pesan "Barang berhasil dihapus!".


  # Keluar 
Jika user memilih menu ini maka akan mengakhiri program dan akan mencetak pesan "Terima kasih!".

Itu adalah penjelasan singkat cara kerja dari program dengan tema Indomaret. Output yang dihasilkan oleh program akan bergantung pada menu operasi yang dipilih oleh pengguna. 
