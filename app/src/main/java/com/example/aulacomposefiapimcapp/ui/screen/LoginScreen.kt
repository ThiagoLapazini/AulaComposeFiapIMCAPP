package com.example.aulacomposefiapimcapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
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
fun LoginScreen() {

    var emailState = remember {
        mutableStateOf("")
    }
    var lembrarState = remember {
        mutableStateOf(false)
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    val senhaUsuario = 123
    val emailUsuario = "thiago@eyemobile.com.br"


    Box(modifier = Modifier.padding(32.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        ) {
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontFamily = FontFamily.Cursive
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
                        value = emailState.value,
                        onValueChange = {
                            emailState.value = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "E-mail")
                        }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = senhaState.value,
                        onValueChange = {
                            senhaState.value = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Senha")
                        }
                    )
                    Button(
                        onClick = {
                        },
                        modifier = Modifier.padding(top = 32.dp)
                    ) {
                        Text(text = "Entrar")
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = lembrarState.value,
                            onCheckedChange = { lembrarState.value = it }
                        )
                        Text(text = "Lembrar-me")
                    }
                }
            }
        }
    }
}

