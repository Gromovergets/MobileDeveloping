package com.example.mobiledev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mobiledev.screens.MainScreen
import com.example.mobiledev.ui.theme.MobileDevTheme

const val API_KEY = "7f6eebb6101546f29f2122941242210"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileDevTheme {
               MainScreen()
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, context: Context) {
//    val state = remember {
//        mutableStateOf("Unknown")
//    }
//    Column(modifier = Modifier.fillMaxSize()) {
//        Box(
//            modifier = Modifier.fillMaxHeight(0.5f)
//                .fillMaxWidth(),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "Temp in $name = ${state.value} °C")
//        }
//        Box(
//            modifier = Modifier.fillMaxHeight()
//                .fillMaxWidth(),
//            contentAlignment = Alignment.BottomCenter
//        ) {
//            Button(
//                onClick = {
//                    getResult(name, state, context)
//                }, modifier = Modifier.padding(5.dp)
//                    .fillMaxWidth()
//            ) {
//                Text(text = "Refresh")
//            }
//        }
//    }
//}
//
//private fun getResult(city: String, state: MutableState<String>, context: Context){
//    val url = "https://api.weatherapi.com/v1/current.json" +
//            "?key=$API_KEY&" +
//            "q=$city" +
//            "&aqi=no"
//    val queue = Volley.newRequestQueue(context)
//    val stringRequest = StringRequest(
//        Request.Method.GET,
//        url,
//        {
//                response ->
//            val obj = JSONObject(response)
//            state.value = obj.getJSONObject("current").getString("temp_c")
//        },
//        {
//                error ->
//            Log.d("MyLog", "Error $error")
//        }
//    )
//    queue.add(stringRequest)
//}