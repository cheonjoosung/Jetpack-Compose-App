package com.js.sample.ai

import android.os.Build.VERSION
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.js.sample.ai.ui.theme.SampleAITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SampleAITheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.padding(5.dp)
                ) {
                    Column {
                        Greeting("Android")
                        SendButton(onButtonClicked = {
                            Toast.makeText(applicationContext, "Send Clicked", Toast.LENGTH_SHORT)
                                .show()
                        })
                        ModifierEx()
                    }
                }
            }

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val text = "Hello $name"
    // 1. 색상 지정을 위해 color parameter 전달
    // Text(color = Color(0xffff9944), text = text)

    // 2. 색상 지정을 위해 color 해쉬값 전달 (ARGB 순)
    // Text(color = Color(0xffff9944), text = text)

    // 3. fontSize sp 로 설정
    // Text(color = Color(0xffff9944), text = text, fontSize = 30.sp)

    // 4. fontWeight 지정 (Bold, Light, ExtraLight)
    // Text(color = Color(0xffff9944), text = text, fontSize = 30.sp, fontWeight = FontWeight.ExtraLight)

    // 5. fontFamily 적용 (Cursive, Serif, Mono, Monospace etc)
    //    Text(
    //        color = Color(0xffff9944),
    //        text = text,
    //        fontSize = 30.sp,
    //        fontWeight = FontWeight.ExtraLight,
    //        fontFamily = FontFamily.Cursive
    //    )

    // 6. letter Spacing sp 단위
    //    Text(
    //        color = Color(0xffff9944),
    //        text = text,
    //        fontSize = 30.sp,
    //        fontWeight = FontWeight.ExtraLight,
    //        fontFamily = FontFamily.Cursive,
    //        letterSpacing = 5.sp
    //    )

    // 7. MaxLines 설정
    //    Text(
    //        color = Color(0xffff9944),
    //        text = "$text $text $text $text $text $text",
    //        fontSize = 30.sp,
    //        fontWeight = FontWeight.ExtraLight,
    //        fontFamily = FontFamily.Cursive,
    //        letterSpacing = 5.sp,
    //        maxLines = 2
    //    )

    // 8. TextDecoration 설정
    //    Text(
    //        color = Color(0xffff9944),
    //        text = "$text $text $text $text $text $text",
    //        fontSize = 30.sp,
    //        fontWeight = FontWeight.ExtraLight,
    //        fontFamily = FontFamily.Cursive,
    //        letterSpacing = 5.sp,
    //        maxLines = 2,
    //        textDecoration = TextDecoration.Underline
    //    )

    // 9. TextAlign 설정
    // modifier dp로 설정, 가로/세로 모두 설정할 때 size 사용, 각각은 width/height 사용
    Text(
        modifier = Modifier.size(width = 300.dp, height = 50.dp),
        color = Color(0xffff9944),
        text = "$text $text $text $text $text $text",
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraLight,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 5.sp,
        maxLines = 2,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center
    )
}

@Composable
fun SendButton(onButtonClicked: () -> Unit) {
    //    Button(onClick = { }) {
    //        Text(text = "Send")
    //    }

    // 1. 클릭 이벤트 처리 -> ToastMessage , onCLick 에 전달받은 클릭 이벤트 위임
    //    Button(onClick = onButtonClicked) {
    //        Text(text = "Send")
    //    }

    // 2. Icon 사용
    //    Button(onClick = onButtonClicked) {
    //        Icon(
    //            imageVector = Icons.Filled.Send,
    //            contentDescription = null
    //        )
    //        Text(text = "Send")
    //    }

    // 3. 아이콘과 텍스트 사이에 spacer 추가
    //    Button(onClick = onButtonClicked) {
    //        Icon(
    //            imageVector = Icons.Filled.Send,
    //            contentDescription = null
    //        )
    //        Spacer(
    //            modifier = Modifier.size(ButtonDefaults.IconSpacing)
    //        )
    //        Text(text = "Send")
    //    }

    // 4. enabled 활성화 여부
    //    Button(
    //        onClick = onButtonClicked,
    //        enabled = true
    //    ) {
    //        Icon(
    //            imageVector = Icons.Filled.Send,
    //            contentDescription = null
    //        )
    //        Spacer(
    //            modifier = Modifier.size(ButtonDefaults.IconSpacing)
    //        )
    //        Text(text = "Send")
    //    }

    // 5. border 에 borderStroke 설정
    //    Button(
    //        onClick = onButtonClicked,
    //        enabled = true,
    //        border = BorderStroke(2.dp, Color.Magenta)
    //    ) {
    //        Icon(
    //            imageVector = Icons.Filled.Send,
    //            contentDescription = null
    //        )
    //        Spacer(
    //            modifier = Modifier.size(ButtonDefaults.IconSpacing)
    //        )
    //        Text(text = "Send")
    //    }

    // 6. Shape 설정
    //    Button(
    //        onClick = onButtonClicked,
    //        enabled = true,
    //        border = BorderStroke(2.dp, Color.Magenta),
    //        shape = RoundedCornerShape(5.dp)
    //    ) {
    //        Icon(
    //            imageVector = Icons.Filled.Send,
    //            contentDescription = null
    //        )
    //        Spacer(
    //            modifier = Modifier.size(ButtonDefaults.IconSpacing)
    //        )
    //        Text(text = "Send")
    //    }

    // 7. contentPadding 설정
    Button(
        onClick = onButtonClicked,
        enabled = true,
        border = BorderStroke(2.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(16.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text(text = "Send")
    }
}

@Composable
fun ModifierEx() {
    // 1.높이/너비 따로 설정
    //    Button(
    //        onClick = {},
    //        modifier = Modifier.height(100.dp).width(200.dp)
    //    ) {
    //        Icon(
    //            imageVector = Icons.Filled.Search,
    //            contentDescription = null
    //        )
    //        Text(text = "Search")
    //    }

    // 2. size 로 한번에 설정
    //    Button(
    //        onClick = {},
    //        modifier = Modifier.size(width = 200.dp, height = 200.dp)
    //    ) {
    //        Icon(
    //            imageVector = Icons.Filled.Search,
    //            contentDescription = null
    //        )
    //        Text(text = "Search")
    //    }

    // 3. background 설정 -> colors로 설정 (containColor 가 backgorund)
    //    Button(
    //        onClick = {},
    //        modifier = Modifier.size(width = 200.dp, height = 200.dp),
    //        colors = ButtonDefaults.buttonColors(contentColor = Color.Cyan, containerColor = Color.Magenta)
    //    ) {
    //        Icon(
    //            imageVector = Icons.Filled.Search,
    //            contentDescription = null
    //        )
    //        Text(text = "Search")
    //    }

    // 4. padding
    //    Button(
    //        onClick = {},
    //        modifier = Modifier.size(width = 200.dp, height = 200.dp).padding(24.dp),
    //        colors = ButtonDefaults.buttonColors(contentColor = Color.Cyan, containerColor = Color.Magenta),
    //        enabled = false
    //    ) {
    //        Icon(
    //            imageVector = Icons.Filled.Search,
    //            contentDescription = null
    //        )
    //        Text(
    //            text = "Search",
    //            modifier = Modifier.clickable {
    //
    //            }
    //        )
    //    }

    // 5. offset
    Button(
        onClick = {},
        modifier = Modifier
            .size(width = 200.dp, height = 200.dp)
            .padding(24.dp),
        colors = ButtonDefaults.buttonColors(contentColor = Color.Cyan, containerColor = Color.Magenta),
        enabled = false
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Text(
            text = "Search",
            modifier = Modifier
                .offset(x = 3.dp, y = 3.dp)
                .background(Color.Blue)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SampleAITheme {
        Surface(
            modifier = Modifier.padding(50.dp),
            border = BorderStroke(
                width = 2.dp,
                color = Color.Magenta
            ),
            shape = CircleShape,
            shadowElevation = 10.dp,
            color = MaterialTheme.colorScheme.error
        ) {
            
            Column() {
                Greeting("Android")
                SendButton {

                }
                ModifierEx()
            }
        }
    }
}