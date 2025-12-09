package kr.co.dothome.projects.ui.drawer.inspection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InspectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is inspection Fragment"
    }
    val text: LiveData<String> = _text
}