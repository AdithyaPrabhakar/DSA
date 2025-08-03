/*print all binary string of size N without consecutive ones.*/
public class BinaryString {
    public static void bsp(int n,int lastplace, StringBuilder str){
        if(n==0){
            System.out.println(str);
            return;
        }
        
        bsp(n-1,0,str.append("0"));
        if(lastplace==0){
            bsp(n-1,1,str.append("1"));
        }
    }
    public static void main(String[] args) {
        bsp(3,0,new StringBuilder(""));
    }
}
