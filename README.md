# Guided11
IncorrectFileNameException

Pada bagian ini Anda diminta membuat sebuah class custom Exception untuk menghandle input nama file yang salah pada sebuah aplikasi dengan ketentuan nama file sebagai berikut:
1. Input nama tidak boleh kosong, jika kosong ada exception: "Nama file tidak boleh kosong".
2. Input nama file huruf pertama harus huruf besar, jika tidak sesuai ada exception "Huruf pertama harus huruf besar".
3. Input nama file harus tidak boleh mengandung spasi, jika tidak sesuai ada exception "Tidak boleh mengandung spasi".
4. Input nama file harus mengandung ekstensi file misalnya .txt, .exe dsb. Jika tidak mengandung ekstensi yang benar ditampilkan exception "Harus memiliki ekstensi file".
5. Input ekstensi file harus memiliki ekstensi berjumlah minimal 3 karakter yang dipisahkan dengan titik, misalnya .txt, .text, .program dsb. Jika tidak mengandung ekstensi yang benar ditampilkan exception "Ekstensi file harus minimal 3 karakter".

Silahkan anda membuat class sebagai berikut:
1. IncorrectFileNameException.java yang digunakan untuk membuat custom exception seperti pada keterangan sebelumnya.
2. IncorrectFileNameTest.java yang berisi main program untuk testing aplikasi. 
3. Program ini berisi langkah sebagai berikut:
      1. Program utama meminta pengguna memasukkan nama file dalam bentuk String, kemudian program utama akan melemparkan exception ke IncorrectFileNameException jika memang ada kesalahan.
      2. Jika tidak ada kesalahan maka pengguna diminta memasukkan ukuran file dalam byte.
      3. Setelah itu program akan menampilkan nama file dan ukuran yang telah diinputkan sebelumnya tersebut.
