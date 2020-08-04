package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import layout.NamesRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rowname.layoutManager=LinearLayoutManager(baseContext)
        data class recycle(val name: String, val age: Int, val DOB: String, val hobby: String)
    }
    val names=NamesRecyclerViewAdapter(listOf(
        name(="James", 23, "11/2/1997", "Football") ,
        name(="Teresa", 23, "11/2/1997", "Acting") ,
        name(="Mere", 20, "11/2/2000", "Singing") ,
        name(="Peter", 19, "10/2/2001", "Sleeping") ,
        name(="Esther", 18, "11/3/2002", "Volunteering") ,
        name(="Rose", 17, "9/2/2003", "Gaming") ,
        name(="Mark", 16, "3/2/2004", "Bowling") ,
        name(="Evelyn", 15, "11/9/2005", "Polo") ,
        name(="Julliet", 14, "3/7/2006", "Reading") ,
        name(="Joseph", 13, "4/2/2007", "Coding") ,


    )


    }
