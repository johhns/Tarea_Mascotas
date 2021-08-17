package com.example.tareamascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderMascota> {

    ArrayList<Mascota> aMascotas ;

    public Adaptador(ArrayList<Mascota> p_arrayMascotas) {
        this.aMascotas = p_arrayMascotas ;
    }

    @NonNull
    @Override
    public ViewHolderMascota onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.mascota , null, false ) ;
        return new ViewHolderMascota(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMascota holder, int position) {
        holder.v_foto.setImageResource( aMascotas.get(position).getFoto() );
        holder.v_nombre.setText( aMascotas.get(position).getNombre() );
        holder.v_rating.setText( aMascotas.get(position).getRating() );
    }

    @Override
    public int getItemCount() {
        return  aMascotas.size() ;
    }

    public class ViewHolderMascota extends RecyclerView.ViewHolder {
        ImageView v_foto ;
        TextView v_nombre , v_rating ;

        public ViewHolderMascota(@NonNull View itemView) {
            super(itemView);
            v_foto   = (ImageView)itemView.findViewById(R.id.ivwFoto) ;
            v_nombre = (TextView) itemView.findViewById(R.id.txtNombre) ;
            v_rating = (TextView) itemView.findViewById(R.id.txtRating) ;
        }
    }




}
