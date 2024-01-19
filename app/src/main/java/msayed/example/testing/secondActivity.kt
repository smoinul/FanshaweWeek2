package msayed.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import kotlin.reflect.typeOf

class secondActivity : AppCompatActivity() {
    lateinit var myName:EditText
    lateinit var radioGroup: RadioGroup
    var lastChecked: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        myName = findViewById(R.id.editTextName)
        radioGroup = findViewById(R.id.radioGroup)
    }

    fun onPreviousIntentClicked(view: View) {
        val prevIntent: Intent = Intent(this, MainActivity::class.java)
        startActivity(prevIntent)
        finish()
    }

    fun onNextIntentClicked(view: View) {
        var checkedRad:Int = radioGroup.checkedRadioButtonId
        when(checkedRad){
            R.id.radioButton5 -> lastChecked =1
            R.id.radioButton6 -> lastChecked =2
            R.id.radioButton7 -> lastChecked =3
            R.id.radioButton8 -> lastChecked =4
        }
        val nextIntent: Intent = Intent(this, thirdActivity::class.java).apply {
            putExtra("name", myName.text.toString())
            putExtra("radio", lastChecked)
        }
        startActivity(nextIntent)

    }
}