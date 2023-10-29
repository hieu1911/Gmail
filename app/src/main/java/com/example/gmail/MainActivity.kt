package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>(
            ItemModel("David", "Lorem ipsum dolor sit amet", "Proin venenatis lectus sit amet egestas convallis. Maecenas accumsan sollicitudin gravida. Quisque ullamcorper purus at porta ultrices", "12:45 PM"),
            ItemModel("John", "Nulla facilisi", "Mauris commodo est eu diam mattis, et aliquet neque elementum. Pellentesque sed libero auctor, lacinia nulla sit amet, auctor mi.", "10:30 AM"),
            ItemModel("Emily", "Cras sed tellus", "In nec quam vitae velit venenatis pretium. Duis nec est laoreet, finibus massa non, euismod elit.", "3:15 PM"),
            ItemModel("Sarah", "Pellentesque habitant", "Nam eu arcu auctor, pellentesque est vitae, sagittis erat. Etiam consequat sapien a eros accumsan, in interdum nulla bibendum.", "9:20 AM"),
            ItemModel("Michael", "Suspendisse ullamcorper", "Donec condimentum felis et nulla ultrices, vitae pulvinar elit tristique. Mauris a mi varius, dapibus ante ac, tincidunt risus.", "5:55 PM"),
            ItemModel("Jessica", "Fusce id metus", "Curabitur nec arcu ac nunc vulputate interdum. Sed rutrum est in justo euismod, id lobortis sem lacinia.", "2:10 PM"),
            ItemModel("Daniel", "Vivamus euismod", "Proin fringilla tortor sed leo pellentesque, id dictum neque tincidunt. Fusce feugiat libero a nisl molestie, in ultricies est pulvinar.", "8:40 AM"),
            ItemModel("Olivia", "Quisque ac mauris", "Vestibulum sollicitudin nunc at massa bibendum, at aliquet mi finibus. Sed porta augue eu sem tincidunt, eu mattis lorem mattis.", "1:05 PM"),
            ItemModel("William", "Integer pretium", "Donec non sem vitae metus pulvinar commodo. Sed auctor urna ac ante molestie, id egestas mauris gravida.", "7:30 AM"),
            ItemModel("Sophia", "Sed efficitur", "Nam sed mi egestas, tincidunt leo id, iaculis urna. Sed tempus nibh sed ante consequat, ac rutrum erat semper.", "4:45 PM")
        )

        findViewById<ListView>(R.id.listView).adapter = ItemAdapter(items)
    }
}