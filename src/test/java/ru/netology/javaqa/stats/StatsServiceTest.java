package ru.netology.javaqa.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test

    public void shouldCountSumOfSales() {
        StatsService service = new StatsService();

        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumOfAllSales(allSales);
        assertEquals(expected, actual);
    }

    @Test

    public void shouldCountAverageSumOfSalesPerMonth() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSumOfSalesPerMonth(allSales);
        assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        long actual = service.maxSalesMonth(allSales);
        assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.minSalesMonth(allSales);
        assertEquals(expected, actual);
    }

    @Test

    public void shouldShowNumberOfMonthsWhereSalesLessAverage() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberOfMonthsWhereSalesLessAverage(allSales);
        assertEquals(expected, actual);
    }

    @Test

    public void shouldShowNumberOfMonthsWhereSalesMoreAverage() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberOfMonthsWhereSalesMoreAverage(allSales);
        assertEquals(expected, actual);
    }
}

