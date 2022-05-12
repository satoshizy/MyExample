package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.gridview.GridViewActivity
import com.example.myapplication.listview.ListViewActivity
import com.example.myapplication.testmysql.MysqlTestActivity
import com.example.myapplication.recyclerview.RecyclerViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var intent = Intent()
        when (view.id) {
            R.id.btn_radiobutton -> {
                intent = Intent(this, RadioButtonActivity::class.java)
                Toast.makeText(this, "RadioButton Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_edittext -> {
                intent = Intent(this, EditTextActivity::class.java)
                Toast.makeText(this, "EditText Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_textview -> {
                intent = Intent(this, TestViewActivity::class.java)
                Toast.makeText(this, "TextView Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_button -> {
                intent = Intent(this, ButtonActivity::class.java)
                Toast.makeText(this, "Button Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_checkbox -> {
                intent = Intent(this, CheckBoxActivity::class.java)
                Toast.makeText(this, "CheckBox Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_imageview -> {
                intent = Intent(this, ImageViewActivity::class.java)
                Toast.makeText(this, "ImageView Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_listview -> {
                intent = Intent(this, ListViewActivity::class.java)
                Toast.makeText(this, "ListView Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_gridview -> {
                intent = Intent(this, GridViewActivity::class.java)
                Toast.makeText(this, "GridView Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_recyclerview -> {
                intent = Intent(this, RecyclerViewActivity::class.java)
                Toast.makeText(this, "RecuclerView Test", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_mysqltest -> {
                intent = Intent(this, MysqlTestActivity::class.java)
                Toast.makeText(this, "Mysql Test", Toast.LENGTH_SHORT).show()
            }
        }
        startActivity(intent)
    }
}
