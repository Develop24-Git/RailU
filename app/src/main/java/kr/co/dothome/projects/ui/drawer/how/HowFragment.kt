package kr.co.dothome.projects.ui.drawer.how

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kr.co.dothome.projects.databinding.FragmentHowBinding

class HowFragment : Fragment() {

    private var _binding: FragmentHowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val howViewModel =
            ViewModelProvider(this)[HowViewModel::class.java]

        _binding = FragmentHowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHow
        howViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}