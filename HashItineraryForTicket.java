import java.util.HashMap;

public class HashItineraryForTicket {

    public static String getStartingPoint(String arr[][]) {

        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i][1], arr[i][0]);
        }

        for (String key : hm.keySet()) {
            if (key != hm.get(key)) {
                return hm.get(key);
            }
        }
        return null;
    }

    public static void toFindRoute(String arr[][]) {
        String startingPoint = getStartingPoint(arr);

        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i][0], arr[i][1]);
        }

        System.out.print(startingPoint);
        for (String key : hm.keySet()) {
            System.out.print("->" + hm.get(startingPoint));
            startingPoint = key;
        }
    }

    public static void main(String[] args) {
        String arr[][] = { { "Chennai", "Bengaluru" },
                { "Mumbai", "Delhi" },
                { "Goa", "Chennai" },
                { "Delhi", "Goa" } };

        toFindRoute(arr);
    }
}
