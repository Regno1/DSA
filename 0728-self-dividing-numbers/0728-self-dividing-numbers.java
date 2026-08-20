class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            Boolean value=true;
            while(n>0){
               int digit=n%10;
                if(digit==0 || i%digit!=0){
                    value=false;
                    break;
                }
                n=n/10;
                
            }
            if(value){
                    a.add(i);
                }
        }
        return a;
    }
}