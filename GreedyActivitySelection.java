public class GreedyActivitySelection {

    public static int activitySelection(int start[], int end[]){
        int maxActivity = 1; 
        int lastActivityEndTime = end[0]; //first activity selected

        for(int i=1; i<start.length; i++){
            if(start[i]>= lastActivityEndTime){
                maxActivity++;
                lastActivityEndTime = end[i]; //ith activity selected
            }
        }
        return maxActivity;
    }
    public static void main(String[]args){
        int start[] = {10,12,20};
        int end[] = {20,25,30};
        System.out.println("Max activity is = "+activitySelection(start, end));
    }
}
