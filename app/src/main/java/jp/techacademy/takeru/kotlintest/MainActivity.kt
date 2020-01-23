package jp.techacademy.takeru.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log     //ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("中村", 29, "サッカー")   //　名前を中村、年齢29歳で、Humanのインスタンスを作る

        val human2 = Human("永吉", 33, "野球")
        human.say()

        human.think()

        human2.say()

        human2.think()



    }
}
