package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
        val mBtnLogin = findViewById<Button>(R.id.btn_login)
        val mTvEditText = findViewById<TextView>(R.id.tv_testEditText)
        val mEtUsername = findViewById<EditText>(R.id.et_1)
        val mEtPassword = findViewById<EditText>(R.id.et_2)

        mBtnLogin.setOnClickListener {
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
        }

        mEtUsername.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                mTvEditText.text = "Login:  $s"
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })

        mEtPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                mTvEditText.text = "Password:  $s"
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
    }
}
