package com.example.praktikum1_62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hiting_persegi_panjang.*
import kotlinx.android.synthetic.main.activity_kalkulator.*

class Hiting_persegi_panjang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hiting_persegi_panjang)

        pp_btn_hitung.setOnClickListener{
            if (pp_angka1.text.toString() == ""){
                pp_angka1.error = "Angka Panjang Harus Diisi !"
                return@setOnClickListener
            }
            if (pp_angka2.text.toString() == ""){
                pp_angka2.error = "Angka Lebar Harus Diisi !"
                return@setOnClickListener
            }

            val nilai_angka1 = pp_angka1.text.toString().toInt()
            val nilai_angka2 = pp_angka2.text.toString().toInt()

            pp_hasil.text = do_hitung_hasil(nilai_angka1,nilai_angka2)
        }
    }

    private fun do_hitung_hasil(nilai1:Int,nilai2:Int):String{
        var hitung_hasil:Int = 0
        val pilih_operator = pp_operator.selectedItem.toString()

        when(pilih_operator){
            "Luas" -> hitung_hasil = nilai1 * nilai2
            "Keliling" -> hitung_hasil = (2*nilai1) + (2*nilai2)
            else -> {
                Toast.makeText(this, "Pilih Hitungan Terlebih Dahulu", Toast.LENGTH_SHORT).show()
            }
        }

        val result_hasil = hitung_hasil
        return result_hasil.toString()
    }
}