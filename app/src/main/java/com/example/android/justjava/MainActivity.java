package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the buttons are clicked.
     */
    int quantity = 0;

    public void submitOrder(View view) {
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);
    }
    public void lowerValue(View view) {
        quantity = quantity - 1;
        display(quantity);
    }
    public void increaseValue(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.order_quantity);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /**
     * Calculate the price and return total
     */
    private int  calculatePrice() {
        int totalPrice = (quantity * 5);
        return totalPrice;
    }

    /**
     * Take in price, quantity, and name
     * Return Order Summary message
     */
    private String createOrderSummary(int price) {
        return "Name: " + "Kaptain Kunal" + "\nQuantiy: " + quantity + "\nTotal: $"
                + price + "\nThank you!";
    }


}
