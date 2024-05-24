package com.example.danactivity

import android.app.LocaleConfig
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danactivity.ui.theme.DanactivityTheme

class ContactActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
       contact()
        }
    }
}




@Preview(showBackground = true)
@Composable
fun contact() {
    val about= LocalContext.current
    val contact= LocalContext.current
    val home= LocalContext.current
    Column(
        modifier = Modifier
            .background(Color(0xffd12424))
//            .fillMaxWidth()
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "i am learning",
            fontSize = 25.sp,
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic
        )





        Spacer(
            modifier = Modifier
                .height(10.dp)
        )


        Text(
            text = "its fun!",
            fontWeight = FontWeight.ExtraBold
        )
        Button(
            onClick = {
                home.startActivity(Intent(home, MainActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = RoundedCornerShape(8.dp),


            ) {
            Text(text = "home")

        }
        Button(
            onClick = {
                about.startActivity(Intent(about, AboutActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = RoundedCornerShape(8.dp),


            ) {
            Text(text = "about")


        }
        Button(
            onClick = {
                contact.startActivity(Intent(contact, ContactActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = RoundedCornerShape(8.dp),


            ) {
            Text(text = "contact")

        }
        Image(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(3.dp, Color(0xffff5733)),
            painter = painterResource(id = R.drawable.index), contentDescription = null
        )
    }}
