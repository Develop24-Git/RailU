package kr.co.dothome.projects.ui.drawer.utilization

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kr.co.dothome.projects.databinding.FragmentUtilizationBinding

class UtilizationFragment : Fragment() {

    private var _binding: FragmentUtilizationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val utilizationViewModel =
            ViewModelProvider(this)[UtilizationViewModel::class.java]

        _binding = FragmentUtilizationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textUtilization
        utilizationViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}