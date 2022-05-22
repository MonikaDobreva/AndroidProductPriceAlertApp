package com.ProductPriceAlert;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import com.vogella.retrofitgerrit.UserData;

public class ProductManagerActivity extends AppCompatActivity {
    //Constants
    private final String UserDataKey = "userDataKey";
    //
    private TextView welcomeNamePM;
    private TextView showRolePM;
    private Button browseProductsPM;
    private Button addNewPRBtn;
    private Button logoutPM;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_manager);
        //Get current PM Data
        Gson gson = new Gson();
        UserData userData = gson.fromJson(getIntent().getStringExtra(UserDataKey), UserData.class);
        findFieldsById();
        DisplayUserData(userData);
        this.browseProductsPM.setOnClickListener(this::browseProductsActivity);
        this.addNewPRBtn.setOnClickListener(this::addNewProductActivity);
        this.logoutPM.setOnClickListener(this::logout);
    }

    private void logout(View view) {
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        startActivity(intent);
    }

    /**
     * start new activity
     *
     * @param view
     */
    private void addNewProductActivity(View view) {
        //TODO: won't load the activity for some reason
        Intent intent = new Intent(view.getContext(), AddProductActivity.class);
        startActivity(intent);
    }

    /**
     * start new activity
     *
     * @param view
     */
    private void browseProductsActivity(View view) {
        Intent intent = new Intent(view.getContext(), BrowseProducts.class);
        startActivity(intent);
    }

    /**
     * set fields initial values
     */
    private void DisplayUserData(UserData userData) {
        String welcomeMessage = "Welcome " + userData.getName();
        this.welcomeNamePM.setText(welcomeMessage);
        this.welcomeNamePM.setTextColor(Color.parseColor("#2596be"));
        String roleDisplay = "Your Role is: " + userData.getRole();
        this.showRolePM.setText(roleDisplay);
        this.showRolePM.setTextColor(Color.parseColor("#2596be"));
    }

    /**
     * Find fields
     */
    private void findFieldsById() {
        this.welcomeNamePM = findViewById(R.id.welcomeNamePM);
        this.showRolePM = findViewById(R.id.showRolePM);
        this.browseProductsPM = findViewById(R.id.browseProductsPM);
        this.addNewPRBtn = findViewById(R.id.addNewPRBtn);
        this.logoutPM = findViewById(R.id.logoutPM);
    }
}