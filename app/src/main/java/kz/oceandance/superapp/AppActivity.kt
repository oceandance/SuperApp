package kz.oceandance.superapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import org.koin.androidx.viewmodel.ext.android.viewModel

class AppActivity: AppCompatActivity() {

    //private val viewModel: AppViewModel by viewModel()

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

    }
}