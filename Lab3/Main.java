public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("apple", 5);
        hashTable.put("banana", 3);
        hashTable.put("orange", 7);

        System.out.println("Size: " + hashTable.size()); // Вывод: Size: 3
        System.out.println("Is empty: " + hashTable.isEmpty()); // Вывод: Is empty: false

        System.out.println("Value for 'apple': " + hashTable.get("apple")); // Вывод: Value for 'apple': 5
        System.out.println("Value for 'banana': " + hashTable.get("banana")); // Вывод: Value for 'banana': 3
        System.out.println("Value for 'orange': " + hashTable.get("orange")); // Вывод: Value for 'orange': 7

        hashTable.remove("banana");
        System.out.println("Size after removal: " + hashTable.size()); // Вывод: Size after removal: 2
        System.out.println("Value for 'banana' after removal: " + hashTable.get("banana")); // Вывод: Value for 'banana' after removal: null
    }
}