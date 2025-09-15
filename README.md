# Showroom Mobil Sport

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Luthfi Daffa Purbaya   | 2409116102    | Sistem Informasi C |

## Deskripsi Program
Program ini merupakan sebuah sistem manajemen data showroom mobil sport berbasis Java, fitur utama nya sendiri mencakup operasi CRUD (Create, Read, Update, Delete) terhadap data-data mobil yang ada di showroom. Setiap data mobil juga memiliki atribut yaitu merk, model, tahun, dan harga.

## Alur Program
1. Program menampilkan menu utama berupa:
   - Tambah data mobil
   - Lihat semua data
   - Ubah data mobil
   - Hapus data mobil
   - Keluar
2. Pengguna memilih menu dengan memasukkan angka 1–5.
3. Setiap pilihan menu memanggil method dari class `mobilservice`:
   - **Tambah** : membuat data mobil baru lalu disimpan di ArrayList.  
   - **Lihat** : menampilkan seluruh data mobil yang sudah dibuat.  
   - **Ubah** : mengganti data mobil sesuai nomor urut yang dipilih.  
   - **Hapus** : menghapus data mobil sesuai nomor urut yang dipilih.
   - **Keluar** : menghentikan program berjalan. 
4. Program terus berjalan hingga user memilih menu keluar.

##  Struktur Packages & Class
<img width="494" height="202" alt="image" src="https://github.com/user-attachments/assets/cb97bfe9-1450-4435-a2f6-53f8f814737b" />

MVC adalah pola pemrograman yang memisahkan data (Model), tampilan (View), dan logika (Controller) agar program lebih rapi dan mudah dikembangkan. Kebetulan program ini juga menerapkan Model View Control (MVC) sederhana, berikut adalah penerapannya dengan struktur project dibagi menjadi tiga package utama:
1. **Model** (mobilsport.java)
Ini berisi class mobilsport yang menyimpan data-data mobil sport dengan properties (merk, model, tahun, harga), constructor, dan getter. Fungsinya juga hanya untuk merepresentasikan data-data mobil.

2. **View** (MainApp.java)
Ini berisi method **main()** yang menampilkan menu program, berguna untuk mengatur interaksi dengan user seperti menampilkan menu, menmasukkan input, dan menampilkan hasil proses.

3. **Controller** (mobilservice.java)
Berisi logika CRUD terhadap data-data mobil dan juga menghubungkan data dari Model dengan perintah yang diberikan oleh user.

# Penggunaan Program
<details>
<summary><h3>Menu Showroom Mobil Sport</h3></summary>

<img width="653" height="147" alt="image" src="https://github.com/user-attachments/assets/d9bd3829-bdfb-422b-816c-f3f8a3d62c39" />

Ketika program dijalankan, sistem akan langsung menampilkan menu utama yang berisi daftar pilihan menu. Disini pengguna diminta untuk memasukkan nomor menu sesuai dengan pilihan yang mereka inginkan. Setelah itu, inputan pengguna akan dijalankan oleh program dan kemudian kembali menampilkan menu utama, proses ini terus berulang hingga pengguna memilih opsi Keluar untuk menghentikan program.

## 1. Tambah Data Mobil







