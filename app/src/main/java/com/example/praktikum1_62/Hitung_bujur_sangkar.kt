package com.example.praktikum1_62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hiting_persegi_panjang.*
import kotlinx.android.synthetic.main.activity_hitung_bujur_sangkar.*

class Hitung_bujur_sangkar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bujur_sangkar)

        bs_btn_hitung.setOnClickListener{
            if (bs_sisi.text.toString() == "") {
                bs_sisi.error = "Inputkan sisi"
                return@setOnClickListener
            }

            val nilai_sisi = bs_sisi.text.toString().toInt()


            bs_hasil.text = do_hitung_hasil(nilai_sisi)
        }
    }

    private fun do_hitung_hasil(nilai1:Int):String{
        var hitung_hasil:Int = 0
        val pilih_operator = bs_operator.selectedItem.toString()

        when(pilih_operator){
            "Luas Bujur Sangkar" -> hitung_hasil = nilai1 * nilai1
            "Keliling Bujur Sangkar" -> hitung_hasil = 4 * nilai1
            else -> {
                Toast.makeText(this, "Pilih Hitungan Terlebih Dahulu", Toast.LENGTH_SHORT).show()
            }
        }

        val result_hasil = hitung_hasil
        return result_hasil.toString()
    }
}