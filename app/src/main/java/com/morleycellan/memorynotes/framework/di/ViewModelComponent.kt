package com.morleycellan.memorynotes.framework.di

import com.morleycellan.memorynotes.framework.ListViewModel
import com.morleycellan.memorynotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}