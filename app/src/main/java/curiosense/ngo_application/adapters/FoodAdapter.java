package curiosense.ngo_application.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

import curiosense.ngo_application.R;
import curiosense.ngo_application.models.Food;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {

    private Context context;
    private List<Food> foodList;

    public FoodAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Food food = foodList.get(position);

        holder.foodItem.setText(food.getFoodItem());
        holder.foodGroup.setText(food.getFoodGroup());
        holder.calories.setText(food.getCalories()+"");
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView foodItem;
        public TextView foodGroup;
        public TextView calories;

        public MyViewHolder(View view) {
            super(view);
            foodItem = view.findViewById(R.id.foodItem);
            foodGroup = view.findViewById(R.id.foodGroup);
            calories = view.findViewById(R.id.cal);
        }
    }

}
