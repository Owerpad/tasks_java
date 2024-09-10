public class WarehouseInventory {
    public static int calculateTotalItems(int boxes, int bags, int barrels) {
        int itemsInBoxes = boxes * 20;
        int itemsInBags = bags * 50;
        int itemsInBarrels = barrels * 100;
        return itemsInBoxes + itemsInBags + itemsInBarrels;
    }

    public static void main(String[] args) {
        int boxes = 10;
        int bags = 5;
        int barrels = 2;
        int totalItems = calculateTotalItems(boxes, bags, barrels);
        System.out.println("Общее количество товаров на складе: " + totalItems);
    }
}
