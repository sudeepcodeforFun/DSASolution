public static int combineTwoRope(int n, int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size()>1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first+second);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,3,6};
        System.out.println(combineTwoRope(4, arr));
    }
