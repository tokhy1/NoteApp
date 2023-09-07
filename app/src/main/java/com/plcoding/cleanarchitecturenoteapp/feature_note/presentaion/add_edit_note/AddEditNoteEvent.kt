package com.plcoding.cleanarchitecturenoteapp.feature_note.presentaion.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent{
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangedTitleFocused(val focusState: FocusState): AddEditNoteEvent()

    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangedContentFocused(val focusState: FocusState): AddEditNoteEvent()

    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}


