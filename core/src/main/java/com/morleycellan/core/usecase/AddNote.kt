package com.morleycellan.core.usecase

import com.morleycellan.core.data.Note
import com.morleycellan.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}