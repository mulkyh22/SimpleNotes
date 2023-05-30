package com.app.simplenotes.ui.note;

import android.database.Cursor;

import com.app.simplenotes.model.Note;
public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

//Signature :
//10120146 - Irshal Mulky H - IF4