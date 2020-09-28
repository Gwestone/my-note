package com.example.mynote.tasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mynote.R
import com.example.mynote.databinding.FragmentTasksListBinding
import com.example.mynote.dummy.DummyContent
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_tasks_list.view.*

/**
 * A fragment representing a list of Items.
 */
class TasksFragment : Fragment() {

    private val tasksViewModel: TasksViewModel by viewModels{ TasksViewModelFactory() }
    private lateinit var taskList: RecyclerView
    private lateinit var binding: FragmentTasksListBinding

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.lifecycleOwner = this.viewLifecycleOwner
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tasks_list, container, false)
        val view = binding.root

        setupFab(view)
        setupUi(view)

        binding.viewModel = tasksViewModel
        return view
    }

    private fun setupFab(view: View){
        val fab: FloatingActionButton = view.findViewById(R.id.main_fab)
        fab.setOnClickListener {
            it.findNavController().navigate(R.id.nav_add_task)
        }
    }

    private fun setupUi(view: View){
        // Set the adapter
        val RecyclerTasksList = view.tasks_list

        with(RecyclerTasksList) {
            layoutManager = LinearLayoutManager(context)
        }
    }

    private fun observeRedrawDataBinding(){
        binding.notifyChange()
    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            TasksFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}