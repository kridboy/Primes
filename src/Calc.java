import java.util.*;
public class Calc {
    static private int scope = 100001;
    private boolean[] primes = new boolean[scope];

    public Calc(){
        Arrays.fill(primes,Boolean.TRUE);
        primes[0]=primes[1]=false;
        //Scanner kb = new Scanner(System.in);

    }

    public void findPrime(){
        for(int i=2;i<scope;i++){
            if(primes[i]){
                System.out.println(i);
                for(int a=2;a*i<scope;a++){
                    primes[a*i]=false;
                }
            }
        }
    }

}
