package com.z.vytautas.taskai.db;

import android.provider.BaseColumns;

public class Task {
    static final String DB_NAME = "com.z.vytautas.taskai.db";
    static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "taskai";
        public static final String COL_TASK_TITLE = "pavadinimas";
    }
}
