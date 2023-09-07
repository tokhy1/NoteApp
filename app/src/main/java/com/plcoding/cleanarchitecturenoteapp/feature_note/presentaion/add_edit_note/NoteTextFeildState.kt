package com.plcoding.cleanarchitecturenoteapp.feature_note.presentaion.add_edit_note

data class NoteTextFeildState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)