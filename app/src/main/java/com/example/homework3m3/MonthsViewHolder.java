package com.example.homework3m3;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MonthsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMonths;

    public MonthsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMonths = itemView.findViewById(R.id.tv_months);
    }

    public void onBind(String monthsName){
        tvMonths.setText(monthsName);
    }
}