package mx.edu.ittepic.dadm_u4_ejercicio1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fraaa on 26/10/2017.
 */

public class BaseDatos extends SQLiteOpenHelper {

    public BaseDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { //Evento
//la estructura de tablas que deseo crear
        db.execSQL("CREATE TABLE  PERSONA(ID INTEGER PRIMARY KEY, NOMBRE VARCHAR(100),DOMICILIO VARCHAR(300))");//ejecuta sqll
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {//Evento
//MODIFICAR la estructura de una base de datos anterior, en este mismo proyecto
        //por ejemplo agregarle a persona 3 columnas: trabajo, sueldo y credito
    }
}