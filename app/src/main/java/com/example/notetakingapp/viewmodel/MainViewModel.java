package com.example.notetakingapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.notetakingapp.database.NoteEntity;
import com.example.notetakingapp.utillities.SampleData;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    public List<NoteEntity> mNotes = SampleData.getNotes();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }
}
