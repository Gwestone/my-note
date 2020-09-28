package com.example.mynote.tasks

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynote.R
import com.example.mynote.data.model.Task
import com.example.mynote.databinding.FragmentTasksItemBinding

class TasksViewHolder(view: View, _binding: FragmentTasksItemBinding) : RecyclerView.ViewHolder(view) {

    public var checked: Boolean = true
    public var title: String = "text"
    public var binding: FragmentTasksItemBinding = _binding
    public lateinit var data: Task
        get
        set

    public fun bind(){
        binding.viewHolder = this
        binding.executePendingBindings()
    }

}