package com.example.notetakingapp.utillities;

import com.example.notetakingapp.database.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SampleData {

    private static final String SAMPLE_TEXT_1 = "A Simple Note";
    private static final String SAMPLE_TEXT_2 = "A Note with a\n line feed";
    private static final String SAMPLE_TEXT_3 = "Lorem ipsum dolor sit amet, consector adilipscing elit, sed do eius un enim ad minim" +
            "Lorem ipsum dolor sit amet, consector adilipscing elit, sed do eius un enim ad minim." +
            "Lorem ipsum dolor sit amet, consector adilipscing elit, sed do eius un enim ad minim." +
            "Lorem ipsum dolor sit amet, consector adilipscing elit, sed do eius un enim ad minim. \n\n" +
            "Lorem ipsum dolor sit amet, consector adilipscing elit, sed do eius un enim ad minim." +
            ".  Lorem ipsum dolor sit amet, consector adilipscing elit, sed do eius un enim ad minim.";

    private static Date getDate(int diff) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.MILLISECOND, diff);
        return cal.getTime();
    }

    public static List<NoteEntity> getNotes() {
        List<NoteEntity> notes = new ArrayList<>();
        notes.add(new NoteEntity(getDate(0), SAMPLE_TEXT_1));
        notes.add(new NoteEntity(getDate(-1), SAMPLE_TEXT_2));
        notes.add(new NoteEntity(getDate(-2), SAMPLE_TEXT_3));
        return notes;
    }
}
