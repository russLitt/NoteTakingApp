package com.example.notetakingapp.database;

import android.content.Context;

import com.example.notetakingapp.utillities.SampleData;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppRepository {
    private static AppRepository ourInstance;

    public List<NoteEntity> mNotes;
    private AppDatabase mDb;
    private Executor executor = Executors.newSingleThreadExecutor();

    public static AppRepository getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new AppRepository(context);
        }
        return ourInstance;
    }

    private AppRepository(Context context) {
        mNotes = SampleData.getNotes();
        mDb = AppDatabase.getInstance(context);
    }

    public void addSampleData() {
        executor.execute(() -> mDb.noteDao().insertAll(SampleData.getNotes()));

    }
}
