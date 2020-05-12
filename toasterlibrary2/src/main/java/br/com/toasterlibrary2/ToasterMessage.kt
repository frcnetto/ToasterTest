package br.com.toasterlibrary2

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun getToasty(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}