class Main
{
    static int pow(int b,int exp)
    {
        if(exp==0) return 1;
        return b*pow(b,exp-1);
    }
    public static void main(String args[])
    {
        int res=pow(7,8);
        System.out.println(res);
    }
}