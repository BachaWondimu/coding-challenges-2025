import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s = "abac";
        System.out.println( findSubstrings(s)); 
    }
    
    private static int findSubstrings(String s){
        int result =0;
        int n =s.length();
        int count =0;
       
        for(int i=0; i<n; i++){
             HashSet<Character> set = new HashSet(s.charAt(i));
            for(int j=i; j<n; j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    count++;
                    set.add(s.charAt(j));
                }
            }
            
        }
        
        return count;
    }
}