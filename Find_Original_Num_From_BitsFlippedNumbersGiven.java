public class Main {
    public static void main(String[] args) {
        System.out.println(findNumber(9,17,29,1));
    }
    static int findNumber(int x,int y,int z,int k){
        HashSet<Integer> a=helper(x,y);
        HashSet<Integer> b=helper(x,z);
        a.retainAll(b);
        
        for(int p:a){
            int t=1<<p;
            x=x^t;
        }
        return x;
        
    }
    static HashSet<Integer> helper(int x,int y){
        HashSet<Integer> h=new HashSet<>();
        int ans=x^y;
        for(int i=0;i<32;i++){
            if((ans&1)==1) h.add(i);
            ans/=2;
        }
        return h;
    }
}
