package msayed.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var contentTextView: TextView
    var counter: Int = 0

    val myTag: String = "lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onNextClicked(view: View) {

        contentTextView = findViewById(R.id.tv1)
        when(counter){
            0 -> contentTextView.setText(R.string.item0)
            1 -> contentTextView.setText(R.string.item1)
            2 -> contentTextView.setText(R.string.item2)
            else -> contentTextView.setText(counter.toString())
        }
        counter++
    }

    override fun onStart() {
        super.onStart()
        Log.d(myTag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(myTag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(myTag, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(myTag, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(myTag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(myTag, "onDestroy")
    }

    fun onNextIntentClicked(view: View) {
        val intent:Intent = Intent(this, secondActivity::class.java)
        startActivity(intent)
        finish()
    }
}