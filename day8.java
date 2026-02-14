import java.util.*;
public class day8{
    //task1:Maximum sum of subarray of size k
    static int maxsum(int [] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
//task2
    static int maxstring(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int L=0;
        int R=0;
        int longest=0;
        while(R<s.length()){
char c=s.charAt(R);
map.put(c,map.getOrDefault(c,0)+1);
R++;
while(map.get(c)>1){
    char leftchar=s.charAt(L);
    map.put(leftchar,map.getOrDefault(leftchar,0)-1);
    if(map.get(leftchar)==0){
        map.remove(leftchar);
    }
    L++;
}
longest=Math.max(longest,R-L);
        }
  return longest;
}


    }
