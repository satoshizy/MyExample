package com.example.myapplication.testmysql

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class MysqlTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysql_test)
        val mTvHello = findViewById<Button>(R.id.tv_hello)
        mTvHello.setOnClickListener {
            Thread {
                mysqlConnection()
            }.start()
        }
    }

    private fun mysqlConnection() {
        val sqlInsert =
            "INSERT INTO `test_case`.`Account` (`user_id`, `user_name`, `isroot`, `password`, `user_email`, `user_phone`) VALUES ('10000002', 'test_mysql', '0', '123456', NULL, NULL);"
        val sqlSelect = "SELECT * FROM Account"
        val sqlDelete = "DELETE FROM `test_case`.`Account` WHERE `Account`.`user_id` = 10000002"
        val cn: Connection
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver")
            //建立连接
            cn = DriverManager.getConnection(
                "*",
                "root", "root"
            )
            val ps = cn.createStatement()
            try {
                ps.execute(sqlDelete)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: SQLException) {
                e.printStackTrace()
            }
            ps.execute(sqlInsert)
            val resultSet = ps!!.executeQuery(sqlSelect)
            while (resultSet.next()) {
                Log.d(
                    "mysqlConnection: ", resultSet.getString("user_id") +
                            resultSet.getString("user_name") +
                            resultSet.getString("isroot") +
                            resultSet.getString("password") +
                            resultSet.getString("user_email") +
                            resultSet.getString("user_phone")
                )
            }
            ps.close()
            cn?.close()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }
}