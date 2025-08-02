public class reverse {
    static int rev(int x,int n){
        if(n==0){
            return x/10;
        }
        x=(x+n%10)*10;
        return rev(x,n/10);
    }
    public static void main(String[] args) {
        System.out.println(rev(0,123));
    }
}
