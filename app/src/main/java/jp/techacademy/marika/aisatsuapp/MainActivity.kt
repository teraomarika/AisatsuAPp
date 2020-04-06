package jp.techacademy.marika.aisatsuapp

import android.app.Dialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.time.OffsetDateTime

abstract class MainActivity : AppCompatActivity() ,View.OnClickListener,TimePickerDialog.OnTimeSetListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        // EditTextの文字列をTextViewに設定
//        textView.text = editText.text.toString()

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("aisatsu_PARTS", "$hour:$minute")
            },
            15, 0, true
        )

        fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
            when(hourOfDay){
                in 2..9 ->Log.d("aisatsu_PARTS", "おはよう")
                in 10..17->Log.d("aisatsu_PARTS", "こんにちは")
                else ->Log.d("aisatsu_PARTS", "こんばんは")}

        }
        timePickerDialog.show()
    }

    }









