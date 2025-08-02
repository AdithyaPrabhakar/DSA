public class tiles_problem {
    public static int tiles(int n){
        if(n==0 || n==1)return 1;
        int fnm1=tiles(n-1);
        int fnm2=tiles(n-2);
        int twoways=fnm1+fnm2;
        return twoways;
    }
    public static void main(String[] args) {
        System.out.println(tiles(4));
    }
}
