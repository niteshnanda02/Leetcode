class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int c=0;
        int n = arr.length;
        Arrays.sort(arr);
        int mod = (int)Math.pow(10,9)+7;
        for(int i=0;i<n-1;i++){
            int l = i+1, h=n-1;
            while(l<h){
                int sum=arr[l]+arr[h]+arr[i];
                if(sum==target){
                    if(arr[l]!=arr[h]){
                        int a1=1, a2=1;
                        while(l+1<h&&arr[l]==arr[l+1]){ l++; a1++;}
                        while(h-1>=l&&arr[h-1]==arr[h]){ h--; a2++;};
                        c=(c%mod+(a1*a2)%mod)%mod;
                        l++;
                        h--;
                    }else{
                        int nn = h-l+1;
                        c=(c%mod+(nn*(nn-1)/2)%mod)%mod;
                        break;
                    }
                }
                else if(sum>target)
                    h--;
                else
                    l++;
            }
        }
        return c;
    }
}