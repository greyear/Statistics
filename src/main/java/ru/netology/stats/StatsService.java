package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSales(int[] sales) {
        int sum = sumSales(sales);
        if (sales.length == 0) {
            System.out.println("Введите данные о продажах по месяцам");
            return 0;
        }
        double average = (double)sum / sales.length;
        return average;
    }

    public int maxSalesMonth(int[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minSalesMonth(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int monthsWithLowerThanAverageSales(int[] sales) {
        int sum = sumSales(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale * sales.length < sum) {
                months++;
            }
        }
        return months;
    }

    public int monthsWithUpperThanAverageSales(int[] sales) {
        int sum = sumSales(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale * sales.length > sum) {
                months++;
            }
        }
        return months;
    }

}



