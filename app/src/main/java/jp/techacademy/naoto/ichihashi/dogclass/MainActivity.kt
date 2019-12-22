package jp.techacademy.naoto.ichihashi.dogclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val dog1 = Dog("ポチ",3) //Dogのインスタンスを作る
//        dog1.move()

        val hum1 = Human("太郎",10,"ゲーム")
        hum1.say()
        hum1.think()

        val hum2 = Human("花子",11,"ショッピング")
        hum2.say()
        hum2.think()

//        dog1.say()
//        Log.d("kotlintest","犬の名前は" + dog1.name + "です。") //dog1のnameプロパティ呼び出し
//        Log.d("kotlintest","犬の年齢は" + dog1.age + "歳です。") //dog1のageプロパティ呼び出し
//
//        val bigdog = BigDog("ヨーゼフ",15)
//        bigdog.say()
//        Log.d("kotlintest","犬の名前は" + bigdog.name + "です。") //dog2のnameプロパティ呼び出し
//        Log.d("kotlintest","犬の年齢は" + bigdog.age + "歳です。") //dog2のageプロパティ呼び出し

    }
}
