package com.morleycellan.memorynotes.framework

import android.content.Context
import com.morleycellan.core.data.Note
import com.morleycellan.core.repository.NoteDataSource
import com.morleycellan.memorynotes.framework.db.DatabaseService
import com.morleycellan.memorynotes.framework.db.NoteEntity

class RoomNoteDataSource(context: Context): NoteDataSource {
    val noteDao = DatabaseService.getInstance(context).noteDao()

    override suspend fun add(note: Note) = noteDao.addNoteEntity(NoteEntity.fromNote(note))

    override suspend fun get(id: Long) = noteDao.getNoteEntity(id)?.toNote()

    override suspend fun getAll() = noteDao.getAllNoteEntities().map { it.toNote() }

    override suspend fun remove(note: Note) = noteDao.deleteNoteEntity(NoteEntity.fromNote(note))
}