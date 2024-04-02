package com.example.tugasrecyleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterbarang extends RecyclerView.Adapter<adapterbarang.ViewHolder> {

    private ArrayList<modelbarang> barangmodel;

    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }
    
    public adapterbarang(ArrayList<modelbarang> barangmodel) {
        this.barangmodel = barangmodel;
    }

    @NonNull
    @Override
    public adapterbarang.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull adapterbarang.ViewHolder holder, int position) {
        holder.namabarang.setText(barangmodel.get(position).getNamabarang());
        holder.deskripsi.setText(barangmodel.get(position).getDeskripsi());
        holder.harga.setText(barangmodel.get(position).getHarga());
        holder.gambarbarang.setImageResource(barangmodel.get(position).getGambar());

    }

    @Override
    public int getItemCount() {

        return barangmodel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namabarang, deskripsi,harga;
        ImageView gambarbarang;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namabarang = itemView.findViewById(R.id.tvnamabarang);
            deskripsi = itemView.findViewById(R.id.tvdeskripsi);
            harga = itemView.findViewById(R.id.tvharga);
            gambarbarang = itemView.findViewById(R.id.Image);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && mListener != null)
                        mListener.onItemClick(position);
                }
            });
        }
    }
}
