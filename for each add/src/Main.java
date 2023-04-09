public class Main
{
    public static void main(String[] args) {
        int[] array = {8, 6, 4, 10, 3, 5};
        int total = 0;

        // add each element's value to total
        for (int number : array)
            total += number;

        System.out.printf("Total of array elements: %d%n", total);
    }
}