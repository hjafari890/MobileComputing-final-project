package com.example.finalproject

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "journal_entries")
data class JournalEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val imageUri: String? = null,
    val audioUri: String? = null,
    val weather: String? = null,
    val timestamp: Long = System.currentTimeMillis()
)