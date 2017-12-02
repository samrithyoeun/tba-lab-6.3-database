package com.fluffy.samrith.tda_lab_63_database;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBAdapter db = new DBAdapter(this);


        /*
        //-- add contacts

        db.open();
        long id = db.insertContact("Samrith ", "samrith.yoeun@gmail.com");
        id = db.insertContact("sengly ","sengly.huot@gmail.com");
        db.close();
        /*
        check if insert success

        if(id>0)
            Toast.makeText(this, id+"", Toast.LENGTH_SHORT).show();
        */


        /*
        db.open();
        Cursor c = db.getAllContacts();
        if(c.moveToFirst()){
            do{
                DisplayContact(c);
            }while(c.moveToNext());
        }
        db.close();
        */


        /*
        db.open();
        Cursor c = db.getContact(4);
        if(c.moveToFirst()){
            DisplayContact(c);
        }else{
            Toast.makeText(this, "Contact not found", Toast.LENGTH_SHORT).show();
        }
        */

        /*
        update a contact

        db.open();
        if(db.updateContact(1,"samrith Yoeun","samrith.yoeun@gmail.com"))
            Toast.makeText(this, "Update Success", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Update Fail", Toast.LENGTH_SHORT).show();
        db.close();
        */

        db.open();
        if (db.deleteContact(1))
            Toast.makeText(this, "Delete successful.", Toast.LENGTH_LONG).show();
        else Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
        db.close();



}

    public void DisplayContact(Cursor c){
        Toast.makeText(this, "id: "+c.getString(0)+"\n"+"name :"+c.getString(1)+"\n"+"email :"+c.getString(2), Toast.LENGTH_SHORT).show();
    }
}
