 package com.furkan.adimigoster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.furkan.adimigoster.databinding.ActivityMainBinding


 class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        //jknj.
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.gstbtn.setOnClickListener{
            binding.gosterText.text=binding.adSoyad.text
            binding.adSoyad.text.clear()

        }








    }


}