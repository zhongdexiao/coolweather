package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by xiaozhang on 2016/10/5.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    public static final String CREATE_PROVINCE = "create table Province("
            + "id integer primary key autoincrement,"
            + "Province_name text, "
            + "Province_code text)";
    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement,"
            + "City_name text, "
            + "City_code text,"
            +"Province_id integer)";
    public static final String CREATE_COUNTY = "create table County("
            + "id integer primary key autoincrement,"
            + "County_name text, "
            + "County_code text,"
            +"City_id integer)";


    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
