
public class GetPermutations {
    public static void main(String[] args) {
        String s = "ABC";
        int len = s.length()-1;
        permute(s,0,len);
    }
    
    public static void permute(String s, int start,int end){
        if(start == end){
            System.out.println("Outer: "+s.substring(1));
        }else{
            for(int i=start;i<=end;i++){
                String swap = swap(s,start,i);
                // System.out.println("Inner: "+swap);
                permute(swap,start+1,end);
            }
        }
        
    }
    public static String swap(String s, int j, int i){
        char[] chars = s.toCharArray();
        char temp = chars[j];
        chars[j]=chars[i];
        chars[i]=temp;
        return String.valueOf(chars);
    }
}
