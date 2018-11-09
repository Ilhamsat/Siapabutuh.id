package id.kodec.siapabutuh.siapabutuhid;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {


    private Context mCtx;
    private List<Info> infoList;

    public InfoAdapter(Context mCtx, List<Info> infoList){
        this.mCtx = mCtx;
        this.infoList = infoList;
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);

        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {

        Info info = infoList.get(position);
//binding the data with the viewholder views
        holder.textViewTitle.setText(info.getTitle());
        holder.textDate.setText(info.getDate());
        holder.selengkapnya.setText(info.getSelengkapnya());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(info.getImage()));
    }



    @Override
    public int getItemCount() {
        return infoList.size();
    }

    class InfoViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textDate, selengkapnya;
        ImageView imageView;

        public InfoViewHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textDate = itemView.findViewById(R.id.textDate);
            selengkapnya = itemView.findViewById(R.id.selengkapnya);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
