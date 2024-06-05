public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "camiseta";

        // numeric fields
        double price = 21.0;
        int quantity = 3;
        double tax = 1.4;
        double total;
        String message = custName + " quer comprar " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        // Test quantity and modify message if quantity > 1.
        if (quantity > 1) {
            message = custName + " quer comprar " + quantity + " " + itemDesc + "s";
        }

        // Test outOfStock and notify user in either case.
        if (outOfStock) {
            System.out.println("Desculpe, o item não está disponível no estoque.");
        } else {
            System.out.println(message);
            System.out.println("O custo total e: $" + total);
        }
    }
}

