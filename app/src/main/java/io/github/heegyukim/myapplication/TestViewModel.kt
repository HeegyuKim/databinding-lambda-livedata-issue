package io.github.heegyukim.myapplication

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel


class TestViewModel : ViewModel() {

    val liveData1 = MutableLiveData<String>().also {
        it.value = "Origin Data"
    }

    val liveData2 = Transformations.map(liveData1) {
        "Transformed Data"
    }

    fun print(context: Context, text: String?) {
        Toast.makeText(
            context,
            "print: $text",
            Toast.LENGTH_SHORT
        ).show()
    }
}