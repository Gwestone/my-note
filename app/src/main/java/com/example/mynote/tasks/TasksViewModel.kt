package com.example.mynote.tasks

import android.content.Context
import android.os.SystemClock
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.mynote.dummy.DummyContent
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TasksViewModel() : ViewModel(){
    public var isRefreshing = MutableLiveData<Boolean>(false)
    public val tasksAdapter = TasksAdapter(DummyContent.ITEMS)

    public fun refreshListener(){
        isRefreshing.value = true
        forseLoadData()
    }

    private fun forseLoadData(){
        viewModelScope.launch {
            delay(2000)
            isRefreshing.value = false
        }
    }

}