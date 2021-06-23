package kg.tutorialapp.foodrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val texts = arrayOf("Applesauce Rum Raisin Cake","Blueberry Cream Cheese Pound Cake",
    "Coconut Cream Pie","Cranberry Streusel Pie","Gloria's Rum Cake","Mini Lemon Tarts",
        "No-bake Baileys Cheesecake","Persimmon Cheesecake","Apricot Cheesecake")

    private val images = arrayOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,
        R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(images, texts)
//        recyclerView.adapter = CustomAdapter(images, texts)
    }
}