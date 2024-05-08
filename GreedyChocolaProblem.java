import java.util.Arrays;
import java.util.Collections;

public class GreedyChocolaProblem {

    public static int calculateMinCost(Integer costVer[], Integer costHor[]) {

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int totalCost = 0;
        int verPointer = 0;
        int horPointer = 0;
        int verPicece = 1;
        int horPicece = 1;

        while (verPointer < costVer.length && horPointer < costHor.length) {
            if (costVer[verPointer] > costHor[horPointer]) {
                totalCost += (costVer[verPointer] * horPicece);
                verPicece++;
                verPointer++;
            } else {
                totalCost += (costHor[horPointer] * verPicece);
                horPicece++;
                horPointer++;
            }
        }

        while (horPointer < costHor.length) {
            totalCost += (costHor[horPointer] * verPicece);
            horPicece++;
            horPointer++;
        }

        while (verPointer < costVer.length) {
            totalCost += (costVer[verPointer] * horPicece);
            verPicece++;
            verPointer++;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        System.out.println("Minimum cost = "+calculateMinCost(costVer, costHor));
    }
}
