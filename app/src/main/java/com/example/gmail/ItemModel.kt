package com.example.gmail

data class ItemModel (val name: String, val title: String, val content: String, val time: String) {
    var ticked = false;
}