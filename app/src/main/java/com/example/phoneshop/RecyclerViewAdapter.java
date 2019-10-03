package com.example.phoneshop;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    public String[] BrandPhones;
    public void setBrandPhones(String[] brandPhones){this.BrandPhones = brandPhones ;}
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View brandPhone  = layoutInflater.inflate(R.layout.recyclerview_view_holder, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(brandPhone);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String brandPhone = BrandPhones[i];
        viewHolder.brandName.setText(brandPhone);
        viewHolder.price.setText(brandPhone);

    }

    @Override
    public int getItemCount() {
        if(BrandPhones == null){
            return 0;
        }else {
            return BrandPhones.length;
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView brandImage;
        TextView brandName;
        TextView price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            brandImage = itemView.findViewById(R.id.brand_image);
            brandName  = itemView.findViewById(R.id.brand_name);
            price      = itemView.findViewById(R.id.price);
        }
    }
}
