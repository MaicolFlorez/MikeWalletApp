package com.maicolflorez.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView myRecycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myRecycleAccount = findViewById(R.id.rv_list_accounts);
        AccountAdapter myAdaptador = new AccountAdapter(listAccountRV);
        myRecycleAccount.setAdapter(myAdaptador);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia", "Cuenta de Ahorros", 10003402.0);
        Account myAccount2 = new Account("Davivienda", "Cuenta Debito", 9992391.0);
        Account myAccount3 = new Account("Efectivo", "Efectivo", 10528402.0);

        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}