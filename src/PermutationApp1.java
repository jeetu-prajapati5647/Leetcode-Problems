import java.util.*;
public class PermutationApp1 {
  static   void helper(int arr[],boolean fre[],List<List<Integer>> ans,List<Integer> ds){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!fre[i]){
                fre[i]=true;
                ds.add(arr[i]);
                helper(arr,fre,ans,ds);
                ds.remove(ds.size()-1);
                fre[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={3,1,2};
        List<List<Integer>> ans=new ArrayList<>();
        boolean fre[]=new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums,fre,ans,new ArrayList<>());
        System.out.println(ans);

    }
}
