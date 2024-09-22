public class ProductWarehouseWithHistory extends ProductWarehouse {

    private final double initialBalance;
    private final ChangeHistory history = new ChangeHistory();

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.initialBalance = initialBalance;
        addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double returnedAmount = super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return returnedAmount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName() + "\nHistory: " + history + "\nLargest amount of product: " + history.maxValue() + "\nSmallest amount of product: " + history.minValue() + "\nAverage: " + history.average());
    }
}
