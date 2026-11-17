class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        boolean[] used = new boolean[n];
        HashSet<Integer> set = new HashSet<>();
        solve(digits,used,0,0,set);
        return set.size();
    }
    public void solve(int[] digits,boolean[] used,int count,int num,HashSet<Integer> set){
        if(count==3){
            if(num%2==0){
                set.add(num);
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(used[i]==true) continue;
            if(count==0 && digits[i]==0) continue;
            used[i]=true;
            solve(digits,used,count+1,num*10+digits[i],set);
            used[i]=false;
        }
    }
}