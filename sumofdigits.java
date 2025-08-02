public class sumofdigits {
    public static int summ(int n,int sum){
        if(n==0)return sum;
        sum+=n%10;     
        return summ(n/10,sum);       
    }
    public static void main(String[] args) {
        int sum=0;
        System.out.println(" "+summ(123,sum));
    }
}
