public class Wildcard_Matching{
    public static void main(String[] args) {
        String p = "aa";
        String s= "aab";
        int c=0;
        if(p=="*"){
            System.out.println(true);
            return;
        }
        if(p.length()!=s.length()&&p!="*"){
            System.out.println(false);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(p.charAt(i)=='?'){
                c++;
                continue;
            }
            if(p.charAt(i)=='*'){
                c=s.length();
                break;
            }
            if(s.charAt(i)==p.charAt(i)){
                c++;
            }
        }
        if(c==s.length()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}
