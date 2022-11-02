package buySellStocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStocksProblemTest {

    private BuySellStocksProblem buySellStocksProblem;

    @BeforeEach
    void setUp() {
        buySellStocksProblem = new BuySellStocksProblem();
    }

    @Test
    void shouldReturnMaxProfit(){
        //given
        int[] stockValues = {7,1,5,3,6,4};
        //when
        int maxProfit = buySellStocksProblem.getMaximumProfitOptimised(stockValues);
        //then
        assertEquals(5, maxProfit);
    }

    @Test
    void shouldReturnNoProfit(){
        //given
        int[] stockValues = {7,6,4,3,1};
        //when
        int maxProfit = buySellStocksProblem.getMaximumProfitOptimised(stockValues);
        //then
        assertEquals(0, maxProfit);
    }
}