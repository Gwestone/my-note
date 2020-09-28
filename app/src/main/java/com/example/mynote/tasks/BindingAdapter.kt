package com.example.mynote.tasks

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.mynote.data.model.Task

@BindingAdapter("android:adapter")
fun setRecycleAdapter(view: RecyclerView,_adapter: RecyclerView.Adapter<TasksViewHolder>){
    view.adapter = _adapter
}

@BindingAdapter("android:onRefreshListener")
fun setRefreshAdapter(view: SwipeRefreshLayout,_listener: SwipeRefreshLayout.OnRefreshListener){
    view.setOnRefreshListener {
        _listener.onRefresh()
    }
}