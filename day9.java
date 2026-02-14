import java.util.*;


// public class day9 {
//     //task1:Longest subarray with sum k
//     static int sum(int [] arr ,int k){
//         int L=0;
       
//         int max=0;
//         int sum=0;
//      for(int R=0;R<arr.length;R++){
//         sum+=arr[R];
//         while(sum>k){
//             sum-=arr[L];
//             L++;
//         }
//         if(sum==k){
//         max=Math.max(max,R-L+1);
//     }
//      }
//      return max;
// }
// }


public class day9{
    //task2:Longest substring without repeating
    static int longest(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int L=0;
        int R=0;
        int longest=0;
        while(R<s.length()){
            char r=s.charAt(R);
            map.put(r,map.getOrDefault(r,0)+1);
            R++;
            while (map.get(r)>1){
                char l=s.charAt(L);
                map.put(l,map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                L++;
            }
            longest=Math.max(longest,R-L);
            
    }
    return longest;
}

//TASK3static int longestAtMostK(String s, int k)
static int longestAtMostK(String s,int k){
   int L=0;
   int R=0;
    int longest=0;
    HashMap<Character,Integer>map=new HashMap<>();
    while(R<s.length()){
        char r=s.charAt(R);
        map.put(r,map.getOrDefault(r,0)+1);
        R++;
        while(map.size()>k){
            char l=s.charAt(L);
               map.put(l,map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                L++;
            }
            longest=Math.max(longest,R-L);
            
    } 
    return longest;
}

//task4:Count Substrings With At Most K Distinct Characters
static int countAtMostk(String s,int k){
    HashMap<Character, Integer>map=new HashMap<>();
    int L=0;
    int R=0;
    int count=0;
    while(R<s.length()){
        char r=s.charAt(R);
        map.put(r,map.getOrDefault(r,0)+1);
        R++;
        while(map.size()>k){
            char l=s.charAt(L);
               map.put(l,map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                L++;
            }
            count+=R-L;
            
    }
    return count;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string:");
    String s = sc.nextLine();
    int result=longest(s);
    System.out.println("length of longest substring without repeating characters: " + result);
    System.out.println("enter the value of k:");
    int k = sc.nextInt();
    int result2=longestAtMostK(s,k);
    System.out.println("length of longest substring with at most k distinct characters: " + result2);
    int result3=countAtMostk(s,k);
    System.out.println("number of substrings with at most k distinct characters: " + result3);
    sc.close();
}
}

