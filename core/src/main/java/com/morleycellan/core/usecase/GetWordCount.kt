package com.morleycellan.core.usecase

import com.morleycellan.core.data.Note

class GetWordCount {

//    operator fun invoke(note: Note): Int {
//        var wordCount = 0
//        wordCount += getCount(note.title)
//        wordCount += getCount(note.content)
//
//        return wordCount
//    }

    operator fun invoke(note: Note) = getCount(note.title) + getCount(note.content)

    private fun getCount(str: String) =
        str.split(" ", "\n")
            .filter {
                it.contains(Regex(".*[a-zA-z].*"))
            }
            .count()
}