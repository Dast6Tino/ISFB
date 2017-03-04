package com.whoame.dich.Data;

import android.provider.BaseColumns;

public final class MainContract {

    private MainContract() {
    };

    public static final class CategoryList implements BaseColumns {
        public final static String TABLE_NAME = "category";

        public final static String _ID = BaseColumns._ID;
        public final static String URL_IMAGE_FIRST = "path";
        public final static String CATEGORY_NAME = "name";
    }
}
