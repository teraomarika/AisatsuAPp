package jp.techacademy.marika.aisatsuapp

import android.app.AlertDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.time.OffsetDateTime

class MainActivity : AppCompatActivity(),View.OnClickListener,TimePickerDialog.OnTimeSetListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView1.setOnClickListener(this)

        button1.setOnClickListener(this)



    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,this,

            15, 0, true
        )
        timePickerDialog.show()
    }
    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        when (hourOfDay) {
            in 2..9 -> {Log.d("aisatsu_PARTS", "おはよう")
                textView1.text="おはよう"
            }
            in 10..17 -> {Log.d("aisatsu_PARTS", "こんにちは")
                textView1.text="こんにちは"}
            else -> {Log.d("aisatsu_PARTS", "こんばんは")
                textView1.text="こんばんは"}
        }
    }
}



//TimePickerDialog.OnTimeSetListener { view, hour, minute ->
//                Log.d("aisatsu_PARTS", "$hour:$minute")
//            },




















