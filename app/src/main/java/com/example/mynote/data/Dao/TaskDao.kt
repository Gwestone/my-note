package com.example.mynote.data.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
//import com.example.mynote.data.model.Task

//@Dao
//interface UserDao {
//    @Query("SELECT * FROM task")
//    fun getAll(): List<Task>
//
//    @Query("SELECT * FROM task WHERE id IN (:userIds)")
//    fun loadAllByIds(userIds: IntArray): List<Task>
//
//    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): Task
//
//    @Insert
//    fun insertAll(vararg users: Task)
//
//    @Delete
//    fun delete(user: Task)
//}