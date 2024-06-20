package com.example.forex2;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ForexViewHolder extends RecyclerView.ViewHolder {
    TextView kodeTextView, kursTextView;

    public ForexViewHolder(View itemView) {
        super(itemView);
        kodeTextView = itemView.findViewById(R.id.kodeTextView);
        kursTextView = itemView.findViewById(R.id.kursTextView);
    }
}
