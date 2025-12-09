package kr.co.dothome.projects.ui.bottom.train

import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kr.co.dothome.projects.databinding.ItemTrainBinding
import kr.co.dothome.projects.databinding.BottomSheetTrainBinding

const val ARG_ITEM_COUNT = "item_count"

class TrainBottomSheet : BottomSheetDialogFragment() {

    private var _binding: BottomSheetTrainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetTrainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val itemCount = arguments?.getInt(ARG_ITEM_COUNT) ?: 0

        binding.list.layoutManager = LinearLayoutManager(requireContext())
        binding.list.adapter = ItemAdapter(itemCount)
    }

    private class ViewHolder(binding: ItemTrainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val text: TextView = binding.text
    }

    private class ItemAdapter(private val itemCount: Int) :
        RecyclerView.Adapter<ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = ItemTrainBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.text.text = position.toString()
        }

        override fun getItemCount(): Int = itemCount
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}