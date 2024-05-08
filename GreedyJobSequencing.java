import java.util.ArrayList;
import java.util.Collections;

public class GreedyJobSequencing {

    static class Job{
        int id;
        int deadLine;
        int profit;

        public Job(int id, int deadLine, int profit){
            this.id = id;
            this.deadLine = deadLine;
            this.profit = profit;
        }
    }

    public static void calculateMaxJob(int jobInfo[][]){
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0; i<jobInfo.length; i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        //descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maximum number of job = "+seq.size());

        System.out.print("Index : ");
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int jobInfo[][] = {{4,20}, {1,10}, {1,40},{1,30}};
        calculateMaxJob(jobInfo);
    }
}
