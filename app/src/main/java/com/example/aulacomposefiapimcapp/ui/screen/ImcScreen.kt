package com.example.aulacomposefiapimcapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImcScreen() {

    var pesoUsuario = remember {
        mutableStateOf("")
    }
    var alturaUsuario = remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.padding(32.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        ) {
            Text(
                text = "Calcular IMC ",
                fontSize = 32.sp,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.padding(15.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    OutlinedTextField(
                        value = pesoUsuario.value,
                        onValueChange = {
                            pesoUsuario.value = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Digite seu peso")
                        }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = alturaUsuario.value,
                        onValueChange = {
                            alturaUsuario.value = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Digite sua altura")
                        }
                    )
                    Button(
                        onClick = {
                        },
                        modifier = Modifier.padding(top = 32.dp)
                    ) {
                        Text(text = "Calcular")
                    }
                    }
                }
            }
        }
    }



