package kr.co.dothome.projects.ui.drawer.individual

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IndividualViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is individual Fragment"
    }
    val text: LiveData<String> = _text
}