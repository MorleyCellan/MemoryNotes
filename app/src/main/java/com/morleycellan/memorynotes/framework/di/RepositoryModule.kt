package com.morleycellan.memorynotes.framework.di

import android.app.Application
import com.morleycellan.core.repository.NoteRepository
import com.morleycellan.memorynotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}