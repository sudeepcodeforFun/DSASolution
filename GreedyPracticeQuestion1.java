public class GreedyPracticeQuestion1 {

    public static int calculateMaxBalSubarray(String str){
        int pointer = 0;
        int LCount = 0;
        int RCount = 0;
        int totalBSub = 0;
        while (pointer<str.length()) {
            if(str.charAt(pointer) == 'L'){
                LCount++;
            }else{
                RCount++;
            }
            if(LCount == RCount){
                totalBSub++;
            }
            pointer++;
        }
        return totalBSub;
    }
    public static void main(String[]args){
        String str = "LRRRRLLRLLRL";
        System.out.println("Maximum number of balance Substring = "+calculateMaxBalSubarray(str));
    }
}
