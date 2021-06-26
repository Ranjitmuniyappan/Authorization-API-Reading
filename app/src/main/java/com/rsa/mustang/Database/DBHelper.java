package com.rsa.mustang.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.rsa.mustang.Pojo.Cobra;
import com.rsa.mustang.Pojo.Customer;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    private static int DATABASE_VERSION = 1;
    private static String DATABASE_NAME = "mustang";
    private static String TABLE_NAME = "cobra";
    private static String COLUMN_CONTACT_ID = "ContactId";
    private static String COLUMN_COMPANY_NAME = "CompanyName";
    private static String COLUMN_MAIN_EMAIL = "MainEmail";
    private static String COLUMN_STATE = "State";
    private static String COLUMN_ZIPCODE = "Zipcode";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String Query = "CREATE TABLE IF NOT EXISTS "+TABLE_NAME+"("
                +COLUMN_CONTACT_ID+" varchar,"
                +COLUMN_COMPANY_NAME+" varchar,"
                +COLUMN_MAIN_EMAIL+" varchar,"
                +COLUMN_STATE+" varchar,"
                +COLUMN_ZIPCODE+" varchar);";
        db.execSQL(Query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String Query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(Query);
        onCreate(db);
    }

    public void addInfo(List<Cobra.Customer> customers)
    {

        for (Cobra.Customer customer : customers)
        {
            ContentValues values = new ContentValues();
            values.put(COLUMN_CONTACT_ID,customer.getCi());
            values.put(COLUMN_COMPANY_NAME,customer.getCn());
            String mail = "@gmail";

            if (customer.getMe() != null)
            {
                mail = (String) customer.getMe();
            }
            /*if (customer.getMe().toString().equals(null) || customer.getMe().toString().equals(""))
                {
                    mail = customer.getMe().toString();
                }*/

            values.put(COLUMN_MAIN_EMAIL,mail);
            values.put(COLUMN_STATE,customer.getSt());
            values.put(COLUMN_ZIPCODE,customer.getZp());

            SQLiteDatabase db = getWritableDatabase();
            db.insert(TABLE_NAME,null,values);
            db.close();
        }

    }

    public List<Customer> getData()
    {

        List<Customer> list = new ArrayList<>();
        //String result="";
        String Query = "select * from "+TABLE_NAME;
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(Query,null);
        while (cursor.moveToNext())
        {
            String contactId = cursor.getString(0);
            String companyName = cursor.getString(1);
            String mainEmail = cursor.getString(2);
            String state = cursor.getString(3);
            String zip = cursor.getString(4);

            Customer obj = new Customer(contactId,companyName,mainEmail,state,zip);
            list.add(obj);

        }
        cursor.close();
        db.close();
        return list;
    }


}
