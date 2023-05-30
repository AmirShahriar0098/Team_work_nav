package com.example.teamwork_shrk

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController)
{
    var UserName:String by remember { mutableStateOf("") }
    var Password:String by remember { mutableStateOf("") }

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize())
    {
        Text(text = "HomeScreen")

        TextField(value = UserName, onValueChange = { UserName = it }, label = { Text(text = "Username") })
        TextField(value = Password, onValueChange = { Password = it }, label = { Text(text = "Password") })

        val context= LocalContext.current

        Button(onClick =
        {
            if (UserName == "AmirHossein" && Password == "1234")
            {
                Toast.makeText(context,"Right", Toast.LENGTH_SHORT).show()
                navController.navigate(Second.route)
            }else{
                Toast.makeText(context,"error", Toast.LENGTH_SHORT).show()
            }
        })
        {
            Text(text = "submit", color = Color.Yellow)
        }
    }
}