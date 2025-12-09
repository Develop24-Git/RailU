package kr.co.dothome.projects.ui.drawer.certificate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CertificateViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is certificate Fragment"
    }
    val text: LiveData<String> = _text
}