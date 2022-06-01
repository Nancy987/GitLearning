public class Q9ItemPrice {
    public static void main(String[] args) {
        // take price and quantity from command line
        int price = Integer.parseInt(args[0]);
        int quantity = Integer.parseInt(args[1]);
        float total = price * quantity;
        if(quantity>=10){
            float discount = 10 * total * 0.01f;
            total -= discount;
        }
        System.out.println("Total amount of item is "+total);
    }
}
