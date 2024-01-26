public class PrintxtoPowern {
    
    public static double powerN(double n, int power){
        if(power == 0){
            return 1;
        }
        double halfPower = powerN(n, power/2);
        if(power%2 == 0){
            return halfPower * halfPower;
        }
        else{
            if(power>0){
                return n * halfPower * halfPower; 
            }
            else{
                return (halfPower * halfPower)/n;
            }
        }
    }
    public static void main(String[] args) {
        double n = 2.0000;
        int power = -2;
        System.out.println(powerN(n, power));
    }
}
