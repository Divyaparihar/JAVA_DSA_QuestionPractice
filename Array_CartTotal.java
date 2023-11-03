package Arrays;

public class Array_CartTotal {

    public static void main(String[] args) {

        int N = 3;

        System.out.println("Number of items: " + N);

        int price[] = {100, 20, 40};
        int quantity[] = {2, 1, 2};

        int carttotal = (price[0] * quantity[0]) + (price[1] * quantity[1]) + (price[2] * quantity[2]);

        System.out.println("Price of items:");
        for (int i = 0; i < N; i++) {
            System.out.println(price[i]);
        }

        System.out.println("Quantity of items:");
        for (int i = 0; i < N; i++) {
            System.out.println(quantity[i]);
        }

        System.out.println("Cart Total: " + carttotal);
    }
}


//int [] price_arr = {500, 600, 200, 2564, 854};
//int[] quantity_arr = {2,1,1,6,5};
//int total_sum = 0;
//
//for(int i =0; i<price_arr.length; i++) {
//	total_sum = total_sum + (price_arr[i] * quantity_arr[i]);
//}
//System.out.println(total_sum);
