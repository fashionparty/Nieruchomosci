package com.example.nieruchomosci.ui.settlements

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nieruchomosci.FakeSettlements
import com.example.nieruchomosci.SettlementListAdapter
import com.example.nieruchomosci.databinding.FragmentSettlementsBinding

class SettlementsFragment : Fragment() {

    private var _binding: FragmentSettlementsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(SettlementsViewModel::class.java)
        _binding = FragmentSettlementsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val fakeList = listOf(
            FakeSettlements.Styczen(),
            FakeSettlements.Grudzien(),
            FakeSettlements.Listopad()
        )

        binding.rvSettlement.layoutManager = LinearLayoutManager(requireContext())
        binding.rvSettlement.adapter = SettlementListAdapter(requireContext(), fakeList)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}