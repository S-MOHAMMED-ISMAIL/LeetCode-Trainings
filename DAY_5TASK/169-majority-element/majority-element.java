class Solution {
    public int majorityElement(int[] a) {
        //         int n=a.length,i,j,min,swap;
        // for(i = 0; i < n - 1; i++) 
        // { 
        // min=i; 
        // for(j = i + 1; j < n; j++) 
        // { 
        // if(a[min] > a[j]) 
        // min=j; 
        // }if(min != i) 
        // { 
        // swap=a[i]; 
        // a[i]=a[min]; 
        // a[min]=swap; 
        // } 
        // }
        //         return a[a.length / 2];
        
     //Moore algo:
        int ctr = 0, m = 0;
        for (int x : a) {
            if (ctr == 0) {
                m = x;
                ctr = 1;
            } else {
                ctr += (m == x) ? 1 : -1;
            }
        }
        return m;

        // Arrays.sort(a);
        // return a[a.length/2];
    }
}