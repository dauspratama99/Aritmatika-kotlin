package com.example.praktikum1_62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kalkulator.*

class Activity_Kalkulator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        btn_hitung.setOnClickListener{
            if (et_angka1.text.toString() == ""){
                et_angka1.error = "Angka Pertama Harus Diisi !"
                return@setOnClickListener
            }
            if (et_angka2.text.toString() == ""){
                et_angka2.error = "Angka Kedua Harus Diisi !"
                return@setOnClickListener
            }

            val nilai_angka1 = et_angka1.text.toString().toInt()
            val nilai_angka2 = et_angka2.text.toString().toInt()

            txt_hasil.text = do_hitung_hasil(nilai_angka1,nilai_angka2)
        }
    }

    private fun do_hitung_hasil(nilai1:Int,nilai2:Int):String{
        var hitung_hasil:Int = 0
        val pilih_operator = sp_operator.selectedItem.toString()

        when(pilih_operator){
             "X" -> hitung_hasil = nilai1 * nilai2
             "/" -> hitung_hasil = nilai1 / nilai2
             "+" -> hitung_hasil = nilai1 + nilai2
             "-" -> hitung_hasil = nilai1 - nilai2
            else -> {
                Toast.makeText(this, "Pilih Operator Terlebih Dahulu", Toast.LENGTH_SHORT).show()
            }
        }

        val result_hasil = hitung_hasil
        return result_hasil.toString()
    }
}