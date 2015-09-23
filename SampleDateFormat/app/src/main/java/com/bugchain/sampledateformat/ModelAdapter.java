package com.bugchain.sampledateformat;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by POSEIDON on 23/9/2558.
 */
public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder>{

    private List<Model> list;

    public ModelAdapter(List<Model> list){
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Model model = list.get(position);
        holder.letter.setText(model.getLetter());
        holder.component.setText(model.getComponent());
        holder.presentation.setText(model.getPresentation());
        holder.example.setText(model.getExample());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView letter;
        public TextView component;
        public TextView presentation;
        public TextView example;

        public ViewHolder(View itemView) {
            super(itemView);
            letter = (TextView)itemView.findViewById(R.id.textLetter);
            component = (TextView)itemView.findViewById(R.id.textComponent);
            presentation = (TextView)itemView.findViewById(R.id.textPresentation);
            example = (TextView)itemView.findViewById(R.id.textExample);
        }
    }

}
