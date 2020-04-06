package jp.techacademy.marika.aisatsuapp

import android.app.Dialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.time.OffsetDateTime

class MainActivity : AppCompatActivity(),View.OnClickListener,TimePickerDialog.OnTimeSetListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val messageView: TextView = findViewById(R.id.textView1)
//        messageView.setText()

        button1.setOnClickListener(this)

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
//                onTimeSet(view: TimePicker?, hour; minute)
            },
            15, 0, true
        )
        timePickerDialog.show()

    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {

        var greeting:String ="初期"
        when (hourOfDay) {
            in 2..9 -> {Log.d("aisatsu_PARTS", "おはよう")
                greeting=="おはよう"
            }
            in 10..17 -> {Log.d("aisatsu_PARTS", "こんにちは")
                greeting=="こんにちは"}


            else -> {Log.d("aisatsu_PARTS", "こんばんは")
                greeting=="こんばんは"}


        }
//        textView1.text=greeting.
//        listener?.onSelected(greeting)

        val messageView: TextView = findViewById(R.id.textView1)
        messageView.setText(greeting)






    }
}









