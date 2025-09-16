class Product {
    String productName;
    int[] stockHistory;

    Product(String productName, int[] stockHistory) {
        this.productName = productName;
        this.stockHistory = stockHistory;
    }

    int lastMonthIncrease() {
        int n = stockHistory.length;
        return stockHistory[n - 1] - stockHistory[n - 2];
    }
}

public class Q7 {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P1", new int[]{10, 20, 25}),
            new Product("P2", new int[]{30, 35, 50}),
            new Product("P3", new int[]{40, 42, 41})
        };

        Product best = products[0];
        for (int x = 1; x < products.length; x++) {
            if (products[x].lastMonthIncrease() > best.lastMonthIncrease()) {
                best = products[x];
            }
        }
        System.out.println("Product with max stock increase: " + best.productName + " Increase: " + best.lastMonthIncrease());
    }
}
