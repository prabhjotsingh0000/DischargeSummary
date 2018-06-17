package com.example.prabhjot.dischargesummary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class DischargeSummaryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<DischargeSummaryModel> al;
    Context context;

    public DischargeSummaryAdapter(ArrayList<DischargeSummaryModel> al, Context context) {
        this.al = al;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ds_model_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder mvh = (MyViewHolder) holder;
        mvh.title.setText(al.get(position).getTitle());
        mvh.etext.setEnabled(true);
        String description = mvh.etext.getText().toString();
        al.get(position).setDescription(description);

    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private EditText etext;

        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title1);
            etext = (EditText) view.findViewById(R.id.description);
        }
    }
}
