package com.morleycellan.memorynotes.framework.di

import com.morleycellan.core.repository.NoteRepository
import com.morleycellan.core.usecase.*
import com.morleycellan.memorynotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {

    @Provides
    fun getUseCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
        GetWordCount()
    )
}