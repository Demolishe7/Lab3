public class Main {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();

        // Добавление товаров
        inventory.addProduct("A123", new Product("Laptop", "High-performance laptop", 1200.0, 10));
        inventory.addProduct("B456", new Product("Smartphone", "Latest model smartphone", 800.0, 20));
        inventory.addProduct("C789", new Product("Tablet", "10-inch tablet", 500.0, 15));

        // Вывод всех товаров
        System.out.println("Initial Inventory:");
        inventory.printInventory();

        // Поиск товара по артикулу
        String articleToFind = "B456";
        Product foundProduct = inventory.findProduct(articleToFind);
        if (foundProduct != null) {
            System.out.println("Found Product: " + foundProduct);
        } else {
            System.out.println("Product with article " + articleToFind + " not found.");
        }

        // Удаление товара по артикулу
        String articleToRemove = "A123";
        inventory.removeProduct(articleToRemove);
        System.out.println("Inventory after removing product with article " + articleToRemove + ":");
        inventory.printInventory();
    }
}