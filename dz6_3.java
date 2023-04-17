import java.util.HashMap;

public class dz6_3 {
    public static void main(String[] args) {
        int[] listInt = new int[]{8,2,3,4,5,6,7};
        sumAllEvenElements(listInt);

    }

    private static void sumAllEvenElements(int[] listInt) {
        int sum=0;
        for (int i = 0; i < listInt.length; i++) {
            if (listInt[i] % 2 == 0) {
                sum+=listInt[i];
            }
        }
        System.out.println(sum);
    }
}
