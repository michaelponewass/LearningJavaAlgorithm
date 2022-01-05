package knapsack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcKnapSackTest {
    KnapSack r;

    @BeforeEach
    void setUp() {
        Item it1 = new Item(2,3);
        Item it2 = new Item(1,3);
        Item it3 = new Item(5,2);
        Item it4 = new Item(6,5);
        Item it5 = new Item(3,3);
        Item it6 = new Item(2,4);
        Item it7 = new Item(3,6);
        Item it8 = new Item(5,2);
        Item it9 = new Item(3,9);
        Item it10 = new Item(6,10);
        Item[] objects = {it1,it2,it3,it4,it5,it6,it7,it8,it9,it10};
        r = new KnapSack(objects);
    }

    @Test
    public void testCreateKnapSack(){
        Assertions.assertEquals(r.selected.length, r.getItems().length);
        Assertions.assertEquals(false, r.selected[0]);
    }
    @Test
    public void testGreedyCalculation(){
        r.calculateGreedyMostValuable();
        r.printSelected();
    }


}
