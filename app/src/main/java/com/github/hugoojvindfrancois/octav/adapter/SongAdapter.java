package com.github.hugoojvindfrancois.octav.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.hugoojvindfrancois.octav.R;
import com.github.hugoojvindfrancois.octav.model.Song;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private List<Song> songs;

    public SongAdapter(List<Song> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_layout, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Song song = songs.get(position);

        holder.artist.setText(song.artistName);
        holder.title.setText(song.title);
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public Song getSongAt(int index) {
        return this.songs.get(index);
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public TextView artist;
        public LinearLayout layout;

        public SongViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.song_title);
            this.artist = (TextView) itemView.findViewById(R.id.song_artist);
            this.layout = (LinearLayout) itemView.findViewById(R.id.song_layout);
        }
    }

}
