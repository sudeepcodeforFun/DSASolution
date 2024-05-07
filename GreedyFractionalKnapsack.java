import java.util.Arrays;
import java.util.Comparator;

public class GreedyFractionalKnapsack {

    public static int fractionalKnapsack(int value[], int weight[], int W){
        //if weight is not sorted then ratio is also not sorted 
        double ratio[][] = new double[value.length][2];

        for(int i=0; i<value.length; i++){
            ratio[i][0] = (double)i;
            ratio[i][1] = (double)(value[i]/weight[i]);
        }

        int capacity = W;
        int totalValue = 0;
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        for(int i= ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];

            if(capacity>=weight[idx]){
                totalValue += value[idx];
                capacity -= weight[idx];
            }else{
                totalValue += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[]args){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        System.out.println("Maximum value = "+fractionalKnapsack(value,weight,W));
    }
}
