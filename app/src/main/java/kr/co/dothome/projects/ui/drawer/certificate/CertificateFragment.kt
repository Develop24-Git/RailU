package kr.co.dothome.projects.ui.drawer.certificate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kr.co.dothome.projects.databinding.FragmentCertificateBinding

class CertificateFragment : Fragment() {

    private var _binding: FragmentCertificateBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val certificateViewModel =
            ViewModelProvider(this)[CertificateViewModel::class.java]

        _binding = FragmentCertificateBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCertificate
        certificateViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}