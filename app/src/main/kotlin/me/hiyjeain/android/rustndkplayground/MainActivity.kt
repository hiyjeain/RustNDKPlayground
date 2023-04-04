package me.hiyjeain.android.rustndkplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.hiyjeain.android.rustndkplayground.databinding.ActivityMainBinding
import me.hiyjeain.rust.demo.RustGreetings

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.textView.text = RustGreetings().greeting("Garrett")
    }
}