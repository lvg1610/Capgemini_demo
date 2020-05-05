class Utility implements IUtility
{
    public  int sum(int x,int y)
    {
       return x+y;
    }
    public  int square(int x)
    {
        return x*x;
    }
    public  int power(int x,int n)
    {
        int res = 1;
        for(;n>0;n--)
          res = res * x;
        return res;
    }
}