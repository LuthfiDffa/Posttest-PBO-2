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

<img width="914" height="254" alt="image" src="https://github.com/user-attachments/assets/f9b9aefa-80c5-4588-96d4-de723fdc86ef" />

Saat memilih menu ini, pengguna diminta menginput informasi mobil seperti merk, model, tahun, dan harga. Data yang sudah diisi akan masuk ke dalam ArrayList dan program menampilkan pesan konfirmasi bahwa data berhasil ditambahkan.

## 2. Lihat Data Mobil

<img width="719" height="176" alt="image" src="https://github.com/user-attachments/assets/366fa961-216f-4824-a77a-d6859f76e1c8" />

Jika pengguna memilih opsi 2 program akan menampilkan seluruh data mobil yang sudah tersimpan. Jika daftar kosong, program akan memberi tahu bahwa belum ada data yang tersedia.

## 3. Ubah Data Mobil

<img width="919" height="305" alt="image" src="https://github.com/user-attachments/assets/7d6bd25d-1f1d-400d-a168-f5951bed8955" />

Pada pilihan ini, pengguna dapat memperbarui data mobil yang sudah ada. Program akan meminta nomor urut data yang ingin diganti, lalu menyuruh pengguna memasukkan input data baru dan menyimpannya sebagai pengganti data lama. Disini saya mengganti data pada bagian harga.

<img width="830" height="182" alt="image" src="https://github.com/user-attachments/assets/de3b04fe-f5b6-45bd-999c-3dbec59b7324" />

Bisa kita lihat jika data di cek kembali maka harga nya telah berubah.

## 4. Hapus Data Mobil

<img width="977" height="215" alt="image" src="https://github.com/user-attachments/assets/e3d8810a-4414-4c18-a27b-e5923e06d477" />

Pada opsi ini memungkinkan pengguna menghilangkan data mobil tertentu dari daftar data. Setelah memilih nomor urut mobil, data tersebut akan dihapus dari ArrayList. Disini saya menghapus data pada nomor 1.

<img width="914" height="170" alt="image" src="https://github.com/user-attachments/assets/1df1d222-100e-4725-8046-a43be58f99ea" />

Bisa dilihat jika kita cek lagi maka data nya mobil nya sudah tidak ada dan menampilkan output "Belum ada data".




