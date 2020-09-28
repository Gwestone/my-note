package com.example.mynote.tasks

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.mynote.R
import com.example.mynote.databinding.FragmentTasksItemBinding

import com.example.mynote.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class TasksAdapter(
    private val values: List<DummyItem>
) : RecyclerView.Adapter<TasksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: FragmentTasksItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_tasks_item, parent, false)
        return TasksViewHolder(binding.root, binding)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        val item = values[position]
        holder.bind()
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
//        holder.completeCheckbox.isChecked = true
//        holder.titleText.text = "text $position"
    }

    override fun getItemCount(): Int = values.size

}