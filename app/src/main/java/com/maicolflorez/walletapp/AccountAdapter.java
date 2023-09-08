package com.maicolflorez.walletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {

    private ArrayList<Account> dataSet;

    public AccountAdapter(ArrayList<Account> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv_account_list, parent, false);

        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myAccount = dataSet.get(position);
        holder.loadInfo(myAccount);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName, txtTypeAccount, txtCurrentValue;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txt_name_account);
            txtTypeAccount = itemView.findViewById(R.id.txt_item_type_account);
            txtCurrentValue = itemView.findViewById(R.id.txt_item_balance);
        }

        public void loadInfo(Account myAccount) {
            txtName.setText(myAccount.getName());
            txtTypeAccount.setText(myAccount.getType());
            txtCurrentValue.setText(String.valueOf(myAccount.getCurrentValue()));
        }
    }
}
