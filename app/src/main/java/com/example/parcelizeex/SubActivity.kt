package com.example.parcelizeex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parcelizeex.databinding.ActivityMainBinding
import com.example.parcelizeex.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySubBinding

    // getParcelableExtra 사용해 값 받아오기
    private val userData: UserData? by lazy {
        intent.getParcelableExtra("USER_DATA")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            userData?.let { userData ->
                textName.text = "${userData.name}님"
                textAge.text = "${userData.age}살"
            }
        }
    }
}