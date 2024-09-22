public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes

        ProductWarehouse juice = new ProductWarehouse("Juice", 1000);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.30);
        System.out.println(juice.getName());
        System.out.println(juice);

        ProductWarehouse juice2 = new ProductWarehouse("Juice", 1000);
        ChangeHistory changeHistory = new ChangeHistory();
        System.out.println(changeHistory.average());
        changeHistory.add(3.0);
        changeHistory.add(2.0);
        System.out.println(changeHistory.minValue());
        System.out.println(changeHistory.maxValue());
        System.out.println(changeHistory);

        ProductWarehouseWithHistory juice3 = new ProductWarehouseWithHistory("Juice", 1000.0, 30);
        juice3.takeFromWarehouse(11.3);
        juice3.addToWarehouse(309);
        System.out.println(juice3);
        System.out.println(juice3.history());

        System.out.println("--------");
        juice3.printAnalysis();


//        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee", 10, 2);
//        pwh.addToWarehouse(4);
//        pwh.takeFromWarehouse(2);
//        pwh.printAnalysis();
//        //"History: [2.0, 4.0, 2.0, 8.0, 6.0]"


        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee", 10, 5);
        pwh.takeFromWarehouse(7);
        System.out.println();
    }

}
