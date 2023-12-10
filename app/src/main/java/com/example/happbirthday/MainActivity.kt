package com.example.happbirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happbirthday.ui.theme.HappBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //GreetingText(message = "Happy Birthday Rimah!", from = "From Sista")
                    GreetingImage(stringResource(R.string.happy_birthday_text), "Sista")

                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String,modifier: Modifier=Modifier){
    Column(verticalArrangement = Arrangement.Center,   modifier=modifier) {

    Text(text = message,
    fontSize=80.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center
    )
    Text(text = from,
        fontSize=36.sp,
        modifier= Modifier
            .padding(16.dp)
            .align(alignment = Alignment.CenterHorizontally)

    )


    }
}

@Composable
fun GreetingImage(message: String, from: String,modifier: Modifier=Modifier){
    val image= painterResource(R.drawable.androidparty)
    //boxtooverlapimage and text
    Box() {
Image(
    painter = image,
    contentDescription =null,
    alpha = 0.5F,
    contentScale = ContentScale.Crop
)
        GreetingText(
            message = message,
            from =from ,
            modifier= Modifier
                .fillMaxSize()
                .padding(8.dp)


            )
}
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    HappBirthdayTheme {
GreetingImage(stringResource(R.string.happy_birthday_text),stringResource(R.string.signature_text))
    }
}