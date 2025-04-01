package za.ac.iie.mealsuggestionapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

private var <T> Comparable<T>.text: String
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtTime = findViewById<EditText>(R.id.edtTime)
        val btnsuggest = findViewById<Button>(R.id.btnsuggest)
        val btnreset = findViewById<Button>(R.id.btnreset)
        val txtsuggestion = findViewById<TextView>(R.id.txtsuggestion)
        btnreset.setOnClickListener {}


        btnsuggest.setOnClickListener {

            val timeDay = edtTime.text.toString()

            var suggestion = "Empty"

            if (timeDay == "Morning") {
                suggestion = "Breakfast-Pancakes or Fruitsalad"
            } else if (timeDay == "Mid Morning") {
                suggestion = "Morning-Snack-Water and packet of ricecakes"
            } else if (timeDay == "Lunch") {
                suggestion = "Lunch-Saled or wrap"
            } else if (timeDay == "Afternoon -Snack") {
                suggestion = "Afternoon Snack-coke and slice of cake"
            } else if (timeDay == "dinner") {
                suggestion = "Main meal-Home cooked meal with vegtables and a coffee"
            } else if (timeDay == "dinner-Snack") {
                suggestion = "after dinner Snack-Ice cream"
            } else {
                suggestion= "Enter correct time of day (Morning,Mid Morning,Lunch,Afternoon Snack,dinner,dinner Dnack)"
            }
            txtsuggestion.text=suggestion
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}