package ru.netology.javaqa.stats;

public class StatsService {

    public long sumOfAllSales(long[] sales) {
        long sumOfSales = 0; //эта переменная - номер ячейки, где хранятся данные первого месяца

        for (int monthNumber = 0; monthNumber < sales.length; monthNumber++) {
            sumOfSales = sales[monthNumber] + sumOfSales;
        }
        return sumOfSales;
    }

    public long averageSumOfSalesPerMonth(long[] sales) {
        long sumOfSales = sumOfAllSales(sales); //наша сумма продаж
        long averageSales = sumOfSales / sales.length;

        return averageSales;
    }

    public long maxSalesMonth(long[] sales) {
        //метод для поиска месяца наибольших продаж
        long maxSales = sales[0];

        for (long showMonthSales : sales) {
            if (showMonthSales > maxSales) {
                maxSales = showMonthSales;
            }
        }
        return maxSales;
    }

    public long minSalesMonth(long[] sales) {
        //метод для поиска наименьших продаж
        long minSales = sales[0];

        for (long showMonthSales : sales) {
            if (showMonthSales < minSales) {
                minSales = showMonthSales;
            }
        }
        return minSales;
    }

    public long numberOfMonthsWhereSalesLessAverage(long[] sales) {
        //метод называет число месяцев, когда продажи были ниже среднего
        long averageSales = averageSumOfSalesPerMonth(sales); //вот средние продажи
        long numberOfMonths = 0; //пока таких месяцев нет

        for (long showMonthSales : sales) {
            if (showMonthSales < averageSales) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public long numberOfMonthsWhereSalesMoreAverage(long[] sales) {
        //метод называет число месяцев, когда продажи были выше среднего
        long averageSales = averageSumOfSalesPerMonth(sales); //вот средние продажи
        long numberOfMonths = 0; //пока таких месяцев нет

        for (long showMonthSales : sales) {
            if (showMonthSales > averageSales) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}

