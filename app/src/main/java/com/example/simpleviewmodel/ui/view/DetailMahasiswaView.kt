package com.example.simpleviewmodel.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.simpleviewmodel.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onBackButton: () -> Unit // Tambahkan parameter ini
) {
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Gender", dataMhs.gender),
        Pair("Alamat", dataMhs.alamat),
        Pair("Email", dataMhs.email),
        Pair("NoTelpon", dataMhs.notelpon),
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Tombol kembali
        ElevatedButton(
            onClick = { onBackButton() } // Memanggil callback tombol kembali
        ) {
            Text("Kembali")
        }

        // Menampilkan detail mahasiswa
        listDataMhs.forEach { data ->
            DetailMessage(judul = data.first, isi = data.second)
        }
    }
}
@Composable
fun DetailMessage(
    judul:String, isi: String
){
    Column (
        modifier = Modifier.fillMaxWidth()
            .padding(8.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth()
                .padding(top = 8.dp)

        ){
            Text(text = judul   ,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isi,
                modifier = Modifier.weight(2f))
        }
    }
}