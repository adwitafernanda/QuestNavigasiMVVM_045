package com.example.simpleviewmodel.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.GrammaticalInflectionManagerCompat.GrammaticalGender

@Composable
fun FormMahasiswaView(
    modifier: Modifier = Modifier,
listGender: List<String>,
    onSubmitClick: (MutableList<String>) -> Unit

                 ){
    var nama by remember { mutableStateOf(value = "") }
    var email by remember { mutableStateOf(value = "") }
    var noTelpon by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var memilihJK by remember { mutableStateOf(value = "") }

    val listData: MutableList<String> = mutableListOf(
        nama,memilihJK,alamat,email,noTelpon
    )

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Biodata",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)
        Spacer(Modifier.padding(5.dp))
        TextField(
            modifier = modifier .fillMaxWidth() .padding(5.dp),
            value = nama,
            onValueChange = {nama = it},
            label = { Text("Nama")},
            placeholder = { Text("Masukkan Nama Anda")}
        )

        Row {
            listJK.forEach { item ->
                Row (verticalAlignment = Alignment.CenterVertically) { RadioButton(
                    selected = memilihJK == item,
                    onClick = {
                        memilihJK = item
                    }
                )
                    Text(item)
                }
            }
        }

        TextField(
            modifier = modifier .fillMaxWidth() .padding(5.dp),
            value = email,
            onValueChange = {email = it},
            label = { Text("Email")},
            placeholder = { Text("Masukkan Email Anda")}
        )

        TextField(
            modifier = modifier .fillMaxWidth() .padding(5.dp),
            value = noTelpon,
            onValueChange = {noTelpon = it},
            label = { Text("NoTelpon")},
            placeholder = { Text("Masukkan No Telpon Anda")}
        )

        TextField(
            modifier = modifier .fillMaxWidth() .padding(5.dp),
            value = alamat,
            onValueChange = {alamat = it},
            label = { Text("Alamat")},
            placeholder = { Text("Masukkan Alamat Anda")}
        )
        Button(onClick = {
            namasv = nama
            emailsv  = email
            noTelponsv = noTelpon
            alamatsv = alamat
            memilihJKsv = memilihJK
        }) {
            Text("Submit")
        }
        ElevatedCard (modifier = Modifier
            .fillMaxWidth(),
        ){
            DetailMessage(judul = "Nama", isinya = namasv)
            DetailMessage(judul = "Email", isinya = emailsv)
            DetailMessage(judul = "NoTelpon", isinya = noTelponsv)
            DetailMessage(judul = "Alamat", isinya = alamatsv)
        }
    }
}
