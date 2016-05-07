package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    TextView priceTextView, quantityTextView ;
    Button myButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priceTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        myButton = (Button)findViewById(R.id.order_button);

    }
    //* This method is called when the minus button is clicked.

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if(quantity < 100) {
            quantity = quantity + 1;
            display(quantity);
        }
        else
            displayMessage("invalid");
    }

    /**
     */
    public void decrement(View view) {
        if(quantity > 0) {


            quantity = quantity - 1;
            display(quantity);
        }
        else
            displayMessage("invalid");
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        display(quantity);
        String priceMessage = "TOTAL AMOUNT =" + "Rs."+ (quantity * 10) + "\n Thank You!";
        displayMessage(priceMessage);
       // displayPrice(quantity * 10);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {

        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price value on the screen.
     */
    private void displayPrice(int number) {

        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void displayMessage(String message)
    {
        priceTextView.setText(message);
    }



}