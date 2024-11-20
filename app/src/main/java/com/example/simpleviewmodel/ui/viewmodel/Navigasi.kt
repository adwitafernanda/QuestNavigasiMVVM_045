package com.example.simpleviewmodel.ui.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Halaman{
    Form,
    Data
}
@Composable
fun Navigasi(
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController(),
    modifier: Any
){
    val uiState by viewModel.dataModel.collectAsState()

}