package com.example.simpleviewmodel.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.simpleviewmodel.model.Mahasiswa

fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier

){
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Gender", dataMhs.gender),
        Pair("Alamat", dataMhs.alamat),
        Pair("email", dataMhs.email),
        Pair("notelpon", dataMhs.email),


        )
}
@Composable
fun DetailMessage(
    judul:String, isinya: String
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
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }
    }
}