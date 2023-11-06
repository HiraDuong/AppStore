package store.store;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appstore.R;

import java.util.List;


public class StoreAdapter extends  RecyclerView.Adapter<StoreAdapter.StoreViewHolder> {
    private List<Store> mStore;
    public void setData(List<Store> list){
        this.mStore = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public StoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_app,parent,false);

        return new StoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreViewHolder holder, int position) {
        Store store = mStore.get(position);
        if(store == null){
            return;
        }
        holder.imgStore.setImageResource(store.getResourceId());
        holder.titleStore.setText(store.getTitle());
    }

    @Override
    public int getItemCount() {
        if(mStore != null){
            return mStore.size();
        }
        return 0;
    }

    public class StoreViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgStore;
        private TextView titleStore;

        public StoreViewHolder(@NonNull View itemView) {
            super(itemView);

            imgStore = itemView.findViewById(R.id.img_store);
            titleStore = itemView.findViewById(R.id.title_store);

        }
    }
}
