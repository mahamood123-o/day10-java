class Main{
    String name;
    Main()
    {
        name="Mahamood";
    }
    Main(String name){
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Main o=new Main();
        o.display();
        Main o1=new Main("Shaheena");
        o1.display();
    }
}