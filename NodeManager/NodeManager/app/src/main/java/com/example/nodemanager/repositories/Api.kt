package com.example.nodemanager.repositories

import com.example.nodemanager.model.NoteItem

interface Api {
    suspend fun login(username: String, password: String): Boolean
    suspend fun loadNotes(): List<NoteItem>
    suspend fun addNote(title: String, content: String)
    suspend fun editNote(id: Long, title: String, content: String)
    suspend fun deleteNote(dt: Long)
}