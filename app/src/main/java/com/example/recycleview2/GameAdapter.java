package com.example.recycleview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {

    private Context context;
    private List<Game> gameList;

    public GameAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Game> list) {
        this.gameList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Game list =gameList.get(position);
        if(gameList == null) {
            return;
        }
        holder.imageView.setImageResource(list.getImgSource());
        holder.textView.setText(list.getNameGame());
    }

    @Override
    public int getItemCount() {
        if(gameList != null) {
            return gameList.size();
        }
        return 0;
    }

    public class GameViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public GameViewHolder(@NonNull View itemView) {

            super(itemView);

            imageView = itemView.findViewById(R.id.gameImage);
            textView = itemView.findViewById(R.id.gameName);

        }
    }
}
