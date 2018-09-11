package curiosense.ngo_application;

import android.content.ContentValues;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import curiosense.ngo_application.adapters.FoodAdapter;
import curiosense.ngo_application.database.DatabaseHelper;
import curiosense.ngo_application.models.Food;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Food> foodList = new ArrayList<>();
    private DatabaseHelper db;
    private FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        db = new DatabaseHelper(this);


        if (db.getFoodCount() == 0) {
            String mCSVfile = "csv/food.csv";
            AssetManager assetManager = this.getAssets();
            InputStream inputStream = null;
            try {
                inputStream = assetManager.open(mCSVfile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            try {
                while ((line = buffer.readLine()) != null) {
                    String[] str = line.split(",");
                    db.insert(str[1], str[2], str[3], Integer.parseInt(str[4]), Float.parseFloat(str[5]), Float.parseFloat(str[6]),
                            Float.parseFloat(str[7]), Float.parseFloat(str[8]), Float.parseFloat(str[9]), Float.parseFloat(str[10]), Float.parseFloat(str[11]), Float.parseFloat(str[12]),
                            Float.parseFloat(str[13]), Float.parseFloat(str[14]), Float.parseFloat(str[15]), Float.parseFloat(str[16]), Float.parseFloat(str[17]), Float.parseFloat(str[18]),
                            Float.parseFloat(str[19]), Float.parseFloat(str[20]), Float.parseFloat(str[21]), Float.parseFloat(str[22]), Float.parseFloat(str[23]), Float.parseFloat(str[24]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        foodList = db.getAllFood();
        foodAdapter = new FoodAdapter(this, foodList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(foodAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}
