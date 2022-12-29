package ru.netology.stats;

public class StatsService {

    public int calculateSumm(int[] sales) { //1
        int summ = 0;
        for (int sale : sales) {
            summ += sale; // summ = summ + sale
        }
        return summ;
    }

    public int calculateAvg(int[] sales) { //2
        int totalSumm = 0;
        for (int sale : sales) {
            totalSumm += sale;
        }
        int avg = totalSumm / sales.length;

        return avg;
    }

    public int calculateMax(int[] sales) { //3
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int calculateMin(int[] sales) {//4
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateCountMinAvg(int[] sales) {//5
        int monthCount = 0;
        int avg = calculateAvg(sales); //вызывается метод из второго задания

        for (int sale : sales) {
            if (sale < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int calculateCountMaxAvg(int[] sales) {//6
        int monthCount = 0;
        int avg = calculateAvg(sales);

        for (int sale : sales) {
            if (sale > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

}