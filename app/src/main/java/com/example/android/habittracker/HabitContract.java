package com.example.android.habittracker;

import android.provider.BaseColumns;

/**
 * Created by mramirez on 10/6/2017.
 */

public class HabitContract {

    public HabitContract() {
    }

    public class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME = "daily_tracking";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_DATE = "date";
        public final static String COLUMN_HABIT = "habit";
        public final static String COLUMN_COMMENT = "comment";

        public final static int HABIT_READ = 0;
        public final static int HABIT_WALK = 1;
        public final static int HABIT_PROGRAM = 2;
    }

}