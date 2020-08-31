# PRAKTIKUM | PERTEMUAN 1

## Program Objek Buku

> Program Code

**_class_ Buku**

![](images/code-buku.png)

**_class_ BukuNovel**

![](images/code-buku-novel.png)

**_class_ BukuSekolah**

![](images/code-buku-sekolah.png)

**_class_ PraktikumDemo**

![](images/code-demo-1.png)

> Output Program Code

![](images/output-objek-buku.JPG)

> Penjelasan

- Dalam program objek buku terdapat 3 _class_ diantaranya
  - _class_ Buku
  - _class_ BukuNovel
  - _class_ BukuSekolah
- _class_ Buku adalah _class_ utama atau _class_ yang mewarisi ke _child class_ nya yaitu BukuNovel dan BukuSekolah.
- _class_ BukuNovel dan BukuSekolah adalah _class_ yang diwarisi oleh _class_ Buku.

| Class       | Attribute                                                                     | Method                                                                                                                |
| ----------- | ----------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| Buku        | - penerbit <br> - judulBuku <br> - jenisBuku <br> - tahunTerbit <br> - jumlah | - setPenerbit <br> - setJumlah <br> - setJenis <br> - setTahunTerbit <br> - setJudul <br> - setTambahBuku <br> - info |
| BukuNovel   | - kategori <br> - halaman                                                     | - setKategori <br> - setHalaman <br> - info                                                                           |
| BukuSekolah | - kelasBuku <br> - jenjang                                                    | - setBukuKelas <br> -setJenjang <br> - info                                                                           |

## Program Objek Tas

> Program Code

**_class_ Tas**

![](images/code-tas.JPG)

**_class_ Demo**

![](images/code-demo-2.png)

> Output Program Code

![](images/output-objek-tas.png)

> Penjelasan

- Program objek tas ini hanya menggunakan 1 _class_ tanpa _inheritance class_ atau kelas warisan.

| Class | Attribute                         | Method                                                 |
| ----- | --------------------------------- | ------------------------------------------------------ |
| Tas   | - harga <br> - jenis <br> - warna | - setHarga <br> - setWarna <br> - setJenis <br> - info |

## Program Objek HP

> Output Program Code

![](images/output-objek-hp.JPG)

> Program Code

**_class_ HP**

![](images/code-hp.png)

**_class_ Demo**

![](images/code-demo-3.png)

> Penjelasan

- Program objek hp ini hanya menggunakan 1 _class_ tanpa _inheritance class_ atau kelas warisan

| Class | Attribute                            | Method                                                  |
| ----- | ------------------------------------ | ------------------------------------------------------- |
| HP    | - harga <br> - jumlahHP <br> - merek | - setHarga <br> - setJumlah <br> - setMerek <br> - info |
