package com.example.savingsquadsfrontend.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.savingsquadsfrontend.ui.theme.SavingsquadsfrontendTheme

@Composable
fun CartScreen (navController: NavController) {
    Text(
        text = "CartScreen",
        modifier = Modifier
    )

    Button(
        modifier = Modifier.wrapContentSize(),
        onClick = { navController.navigate("VoucherRedemptionScreen") }
    ) {
        Text(text = "Next Screen")
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {

    val fakeContext = LocalContext.current
    val fakeNavController = NavController(fakeContext)

    SavingsquadsfrontendTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            CartScreen(fakeNavController)
        }
    }
}
