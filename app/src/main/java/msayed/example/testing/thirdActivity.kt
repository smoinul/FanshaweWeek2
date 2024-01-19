package msayed.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.TextView

class thirdActivity : AppCompatActivity() {
    lateinit var nameTextView:TextView
    lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        spinner = findViewById(R.id.spinner)
        nameTextView = findViewById(R.id.textView2)
        nameTextView.setText(intent.extras!!.getString("name", "Not Supplied"))
        var i:Int = intent.extras!!.getInt("radio", 1)
        spinner.setSelection(i-1)
    }
}