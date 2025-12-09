package kr.co.dothome.projects.ui.drawer.how

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is how Fragment"
    }
    val text: LiveData<String> = _text
}