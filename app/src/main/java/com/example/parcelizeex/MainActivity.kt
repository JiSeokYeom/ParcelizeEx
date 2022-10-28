package com.example.parcelizeex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parcelizeex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var userData: UserData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnSubmit.setOnClickListener {
                saveUserData() // userData에 데이터 저장
                val intent = Intent(this@MainActivity,SubActivity::class.java)
                intent.putExtra("USER_DATA",userData) // 기존과 동일하게 putExtra 로 전송
                startActivity(intent)
            }
        }
    }

    private fun saveUserData(){
        userData = UserData(
            name = "${binding.inputName.text}",
            age = "${binding.inputAge.text}".toInt()
        )
    }
}