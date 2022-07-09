package ru.netology.sqr.services;

public class SQRService {

    public int calculate(int low, int high) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i*i;
            if (sqr >= low) {
                if (sqr <= high) {
                    amount++;
                }
            }
        }
        return amount;
    }
}
