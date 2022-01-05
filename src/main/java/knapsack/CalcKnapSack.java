package knapsack;

public class CalcKnapSack {

    public static void main(String[] args) {
            Item it1 = new Item(2,3);
            Item it2 = new Item(1,3);
            Item it3 = new Item(5,2);
            Item it4 = new Item(6,5);
            Item it5 = new Item(3,3);
            Item[] objects = {it1,it2,it3,it4,it5};
            KnapSack r = new KnapSack(objects);
            r= r.calculateGreedyMostValuable();
            r.printSelected();

    }




}
