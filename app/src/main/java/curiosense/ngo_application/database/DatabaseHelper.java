package curiosense.ngo_application.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import curiosense.ngo_application.models.Food;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "food_dataset";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create notes table
        db.execSQL(Food.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + Food.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public long insert(String foodGroup, String foodItem, String foodUnit, int calories, float pro, float fat, float car, float cal, float sod,
                       float pot, float vit, float rib, float bet, float fol, float zin, float iro, float pho, float mag, float man, float thi, float cop, float nia,
                       float phy, float fib) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Food.COLUMN_FOODGROUP, foodGroup);
        values.put(Food.COLUMN_FOODITEM, foodItem);
        values.put(Food.COLUMN_FOODUNIT, foodUnit);
        values.put(Food.COLUMN_CALORIES, calories);
        values.put(Food.COLUMN_PROTEINS, pro);
        values.put(Food.COLUMN_FAT, fat);
        values.put(Food.COLUMN_CARBOHYDRATES, car);
        values.put(Food.COLUMN_CAlCIUM, cal);
        values.put(Food.COLUMN_SODIUM, sod);
        values.put(Food.COLUMN_POTASSIUM, pot);
        values.put(Food.COLUMN_VITAMIN_C, vit);
        values.put(Food.COLUMN_RIBOFALVIN, rib);
        values.put(Food.COLUMN_BETACAROTINE, bet);
        values.put(Food.COLUMN_FOLICACID, fol);
        values.put(Food.COLUMN_ZINC, zin);
        values.put(Food.COLUMN_IRON, iro);
        values.put(Food.COLUMN_MANGENESE,man);
        values.put(Food.COLUMN_PHOSPHOROUS, pho);
        values.put(Food.COLUMN_MAGNESIUM, mag);
        values.put(Food.COLUMN_THIAMIN, thi);
        values.put(Food.COLUMN_COPPER, cop);
        values.put(Food.COLUMN_NIACIN, nia);
        values.put(Food.COLUMN_PHYTATES, phy);
        values.put(Food.COLUMN_FIBER, fib);

        // insert row
        long id = db.insert(Food.TABLE_NAME, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return id;
    }

    public List<Food> getAllFood() {
        List<Food> foods = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + Food.TABLE_NAME + " ORDER BY " +
                Food.COLUMN_FOODGROUP + " ASC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Food food = new Food();
                food.setSrno(cursor.getInt(cursor.getColumnIndex(Food.COLUMN_SRNO)));
                food.setFoodItem(cursor.getString(cursor.getColumnIndex(Food.COLUMN_FOODITEM)));
                food.setFoodGroup(cursor.getString(cursor.getColumnIndex(Food.COLUMN_FOODGROUP)));
                food.setFoodUnit(cursor.getString(cursor.getColumnIndex(Food.COLUMN_FOODUNIT)));
                food.setCalories(cursor.getInt(cursor.getColumnIndex(Food.COLUMN_CALORIES)));
                food.setPro(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_PROTEINS)));
                food.setFat(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_FAT)));
                food.setCar(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_CARBOHYDRATES)));
                food.setCal(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_CAlCIUM)));
                food.setSod(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_SODIUM)));
                food.setPot(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_POTASSIUM)));
                food.setVit(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_VITAMIN_C)));
                food.setRib(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_RIBOFALVIN)));
                food.setBet(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_BETACAROTINE)));
                food.setFol(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_FOLICACID)));
                food.setZin(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_ZINC)));
                food.setIro(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_IRON)));
                food.setPho(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_PHOSPHOROUS)));
                food.setMag(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_MAGNESIUM)));
                food.setMan(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_MANGENESE)));
                food.setThi(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_THIAMIN)));
                food.setCop(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_COPPER)));
                food.setNia(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_NIACIN)));
                food.setPhy(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_PHYTATES)));
                food.setFib(cursor.getFloat(cursor.getColumnIndex(Food.COLUMN_FIBER)));

                foods.add(food);
            } while (cursor.moveToNext());
        }

        // close db connection
        db.close();

        // return notes list
        return foods;
    }

    public int getFoodCount() {
        String countQuery = "SELECT  * FROM " + Food.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        int count = cursor.getCount();
        cursor.close();


        // return count
        return count;
    }
}
