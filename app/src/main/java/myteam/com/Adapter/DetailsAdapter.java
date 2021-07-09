package myteam.com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import myteam.com.R;
import myteam.com.model.Detail;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder> {
    private Context mContext;
    private List<Detail> mListdetail;
    private RecycleViewClickListener listener;

    public DetailsAdapter(Context mContext,RecycleViewClickListener listener) {
        this.mContext = mContext;
        this.listener = listener;
    }
    public void setData(List<Detail> list){
        this.mListdetail = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemchitiet,parent,false);

        return new DetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsViewHolder holder, int position) {
        Detail detail = mListdetail.get(position);
        if(detail == null){
            return;
        }
        holder.imgDetails.setImageResource(detail.getIdDetails_Image());
        holder.DetailsName.setText(detail.getNameDetails());
        holder.backgroundDetails.setImageResource(detail.getBackgroundDetails());
        holder.Time_Details.setText(detail.getTime_Details());
    }

    @Override
    public int getItemCount() {
        if(mListdetail != null){
            return mListdetail.size();
        }
        return 0;
    }


    public interface RecycleViewClickListener{
        void onClick(View v,int position);
    }

    public class DetailsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imgDetails;
        private TextView DetailsName;
        private TextView Time_Details;
        private ImageView backgroundDetails;
        public DetailsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDetails = itemView.findViewById(R.id.DetailsImage);
            DetailsName =   itemView.findViewById(R.id.nameDetails);
            Time_Details =  itemView.findViewById(R.id.TimeDetails);
            backgroundDetails =  itemView.findViewById(R.id.backgroundetails);
            itemView.setOnClickListener(this::onClick);
        }
        @Override
        public void onClick(View v) {
            listener.onClick(v,getAdapterPosition());
        }
    }
}
