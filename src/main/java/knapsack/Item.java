package knapsack;

public class Item {
        public int weight, value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
    @Override
    public String toString() {
        return "Value: "+value + " Weight: "+weight;


    }

}
