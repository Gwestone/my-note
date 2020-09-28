package com.example.mynote.addNote

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mynote.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddTaskFragment : Fragment() {

    companion object {
        fun newInstance() = AddTaskFragment()
    }

    private lateinit var viewModel: AddTaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_task, container, false)
        setupFab(view)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddTaskViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun setupFab(view: View){
        val fab: FloatingActionButton = view.findViewById(R.id.addEditFab)
        fab.setOnClickListener{
            it.findNavController().navigate(R.id.action_addTaskFragment_to_nav_task_list)
        }
    }

}