package com.example.mynote.data.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

open class Task(){
    public var Id: Int = 0
        get
        set
    public var Title: String = ""
        get
        set
    public var Desc: String = ""
        get
        set
    public var Completed: Boolean = true
        get
        set

}