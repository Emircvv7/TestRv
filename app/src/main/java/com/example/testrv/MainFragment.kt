package com.example.testrv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testrv.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var carAdapter: CarAdapter
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.recycler


        val carList = listOf(
            Car( "Mercedes", "007"),
            Car( "Toyota Camry", "123"),

        )


        carAdapter = CarAdapter(carList)


        recyclerView.adapter = carAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }
}
