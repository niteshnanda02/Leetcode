class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[0] == b[0])
                    return b[1]-a[1];
                return b[0]-a[0];
            }
        });
        
        for(int i=0;i<mat.length;i++){
            maxHeap.add(new int[]{binarySearch(mat[i]), i});
            if(maxHeap.size()>k)
                maxHeap.remove();
        }
        
        int[] ans = new int[k];
        while(k>0){
            ans[--k] = maxHeap.remove()[1];
        }
        
        return ans;
    }
    
    int binarySearch(int[] arr){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==1){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s;
    }
}