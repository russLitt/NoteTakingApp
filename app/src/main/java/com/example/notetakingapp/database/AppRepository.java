package com.example.notetakingapp.database;

import com.example.notetakingapp.utillities.SampleData;

import java.util.List;

public class AppRepository {
    private static final AppRepository ourInstance = new AppRepository();

    public List<NoteEntity> mNotes;

    public static AppRepository getInstance() {
        return ourInstance;
    }

    private AppRepository() {
        mNotes = SampleData.getNotes();
    }
}
