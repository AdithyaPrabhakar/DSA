public class char_duplicate_rec {
    public static String dup(String str,int pos,String drs){
        if(str.charAt(pos)!=str.charAt(pos+1)){
            drs+=str.charAt(pos);
        }
        else{
            pos+=1;
           drs+=str.charAt(pos);  
        }
        
        
        if(pos==str.length()-1)return drs;
        return dup(str,pos+1,drs);
    }
    public static void main(String[] args) {
        System.out.println(dup("AADDIITTHHYYAA",0,""));
    }
}
