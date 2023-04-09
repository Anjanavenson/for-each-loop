// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array={3,4,5,6,7};
        int total=0;
        for (int number:array){
            total -= number;
        }
        System.out.println("sub of the array:" + total);
    }
}