#Wrapper Class

Pada bahasa pemrograman Java, terdapat 2 jenis tipe data, yaitu primitif dan referensi (objek), 
Tipe Data Primitif adalah tipe data yang tidak memiliki method, hanya memiliki data saja. Tipe data 
ini bukanlah sebuah object, sedangkan Tipe Data Referensi adalah tipe data yang digunakan untuk memegang 
referensi dari sebuah object ( instance dari class).

Dan berikut ini merupakan table yang menjelaskan macam-macam tipe data primitif dan referensi pada Java:
Tipe Data Primitif	Tipe Data Referensi
    char	              Character
    byte	                Byte
    short	                Short
     int	               Integer
     long	                Long
    boolean	             Boolean
     float	              Float
    double	              Double

Sedikit penjelasan, pada tipe data Byte dan Short, kalian harus memasukan argumen berupa String, selain 
menggunakan constructor dengan kata kunci new, kalian juga dapat membuat objek serta argumennya seperti 
berikut ini:

Character objChar = 'W';
Integer objInt = 523;
Boolean objBoolean = true;
Float objFloat = 82.89f;
Double objDouble = 34.67;

Kecuali pada Byte, Short dan Long.

Selain menampilkan nilai dari argumen tersebut, kita juga dapat melihat batasan nilai maximal dan minimal 
dari tipe data Byte, Short, Integer, Long, Float, Double. Menggunakan fungsi MAX_VALUE dan MIN_VALUE

untuk mengubah tipe data Primitif ke Wrapper Class, kalian dapat menggunakan fungsi valueOf() dan untuk sebaliknya, 
kalian dapat menggunakan fungsi charValue, intValue, booleanValue, dsb. Tergantung dengan tipe data yang kalian gunakan

#Perbedaan final, finally dan finalize

Kata Kunci #final adalah keyword untuk mendeklarasikan bahwa sebuah variabel/atribut tidak dapat diubah lagi isinya, ]
artinya kata kunci ini mengartikan bahwa variabel tersebut sudah final. Kita juga dapat membuat konstanta dengan cara 
menyertakan kata kunci final di dalam variabel.

Apabila kata kunci #final disertakan ke dalam pembuatan method, hal tersebut mengartikan bahwa method tersebut tidak 
dapat di override oleh subclassnya (kelas turunannya).

Sedangkan jika kata kunci #final disebutkan di dalam pembuatan sebuah class, artinya class tersebut tidak dapat 
diturunkan lagi (sudah final).

#finally merupakan tag dalam try-catch-finally yang berfungsi untuk memastikan bahwa kode di dalam blok finally akan 
dieksekusi meskipun kondisi dalam blok try sukses / gagal dieksekusi.

Sedangkan #finalize merupakan method kelas Object yang akan dieksekusi saat garbace collection menghapus sebuah object 
yang sudah tidak digunakan/terpakai pada memori.
