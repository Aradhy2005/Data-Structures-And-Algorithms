class ProductOfNumbers {

    ArrayList<Integer> res;

    public ProductOfNumbers() {

        res=new ArrayList<>();
        
    }
    
    public void add(int num) {

        res.add(num);
        
    }
    
    public int getProduct(int k) {

        int mul=1;

        for(int i=0;i<k;i++)
        {
            mul*=res.get(res.size()-1-i);
        }

        return mul;
        
    }
}