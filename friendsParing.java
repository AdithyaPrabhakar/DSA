/*given n friends, each one can remain single or can be paired up
with some other friend. Each friend can be paired only once. 
find out the total number of ways in which friends can remain single or can be paired up.
*/

public class friendsParing {
    public static int f(int n){
        if(n==1||n==2){
            return n;
        }
        /* int fnm1=f(n-1);
        int fnm2=f(n-2);

        int pairways=(n-1)*fnm2; 

        int totalways = fnm1 + pairways; */
        return f(n-1)+(n-1)*f(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Total ways : "+f(10));
    } 
}
