/**
 * FriendPairing
 * Given n friends each one can rmain single aor can be paired up with some other
 * friend. each friend can be paired only once, Find out the total number of ways
 * in which friends can remain single or be paired up.
 */
public class FriendPairingRecusion {

    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        // single
        int single = friendPairing(n-1);

        // pair
        int pair  =  + (friendPairing(n-2)*(n-1));

        int totalway = single + pair;
        return totalway;
    }

    public static void main(String[] args) {
        System.out.println(friendPairing(4));
    }
}