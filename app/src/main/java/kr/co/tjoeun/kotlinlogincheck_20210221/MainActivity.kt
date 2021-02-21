package kr.co.tjoeun.kotlinlogincheck_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginBtn.setOnClickListener {

            if (loginId.text.toString() == "admin@test.com") {
                if(loginPwd.text.toString() == "qwer") {
                    Toast.makeText(this,"관리자입니다.", Toast.LENGTH_SHORT).show()
                }
            }
            else {
                Toast.makeText(this,"로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}