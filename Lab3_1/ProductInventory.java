import java.util.HashMap;

public class ProductInventory {
    private HashMap<String, Product> inventory;

    public ProductInventory() {
        inventory = new HashMap<>();
    }

    // Метод для добавления товара
    public void addProduct(String article, Product product) {
        inventory.put(article, product);
    }

    // Метод для поиска товара по артикулу
    public Product findProduct(String article) {
        return inventory.get(article);
    }

    // Метод для удаления товара по артикулу
    public void removeProduct(String article) {
        inventory.remove(article);
    }

    // Метод для вывода всех товаров
    public void printInventory() {
        for (String article : inventory.keySet()) {
            System.out.println("Article: " + article + ", Product: " + inventory.get(article));
        }
    }
}