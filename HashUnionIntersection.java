import java.util.HashSet;

public class HashUnionIntersection {
    
    public static int toCountUnionValue(int arr1[], int arr2[]){
        
        HashSet<Integer> hs = new HashSet<>();
    
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }

        return hs.size();
    }

    public static int toCountIntersectionValue(int arr1[],int arr2[]){

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        int count = 0;
        for( int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                count++;
            }else{
                continue;
            }
        }

        return count;
    }
    public static void main(String[]args){
        int arr1[] = {7,3,9};
        int arr2[] = {7,3,9,6,2,4};

        System.out.println("Union of Given two array is = "+toCountUnionValue(arr1, arr2));
        System.out.print("Intersection of Given two array is = "+toCountIntersectionValue(arr1, arr2));

    }
}
