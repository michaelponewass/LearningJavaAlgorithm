package knapsack;

public class KnapSack {
    static Item[ ] items = null ;
    public static int CAPACITY_WEIGHT=14;
    public Boolean[] selected;

    public KnapSack(Item[] objects) {
        items=objects;
        selected = new Boolean[items.length];
        for (int k=0; k<items.length;k++) {
            selected[k]=false;
        }
    }
    public int getWeight () {
        int g = 0;
        for (int i=0; i < items.length; i++ )
            if (selected[i]) {
                g = g + items[i].weight;
            }
        return g;
    }
    public int getValue () {
        int g = 0;
        for (int i=0; i < items.length; i++ )
                if (selected[i]) {
                    g = g + items[i].value;
                }
        return g;
    }


    public KnapSack calculateGreedyMostValuable() {
        while (true) {
            //System.out.println("in calculateGreedeMostValuable:");
            int pos=-1; int bestUse = 0;
            for (int i=0; i<items.length; i++)
                if (selected[i] == false &&
                        items[i].value > bestUse &&
                        getWeight() + items[i].weight <=
                     CAPACITY_WEIGHT) {
                    bestUse = items[i].value;
                    pos = i;
                }
            if (pos == -1) break;
            else selected[pos] = true;
        }
        return this;
    }

    public void printSelected() {
        for (int k=0; k<selected.length;k++) {
            if (selected[k]) {
                System.out.println(items[k].toString());
            } else {
                System.out.println("----"+items[k].toString());
            }
        }
    }

    public Item[] getItems() {
        return items;
    }
}
