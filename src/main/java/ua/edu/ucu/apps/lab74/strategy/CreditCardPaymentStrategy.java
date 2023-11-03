package ua.edu.ucu.apps.lab74.strategy;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        if (price > 0) {
            return true;
        } else {
            return false;
        }
    }
}
