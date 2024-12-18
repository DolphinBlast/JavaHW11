class p30 {
    public static void main(String[] args)
    {
        Carp30 car1 = new Carp30();
        try
        {
            car1.setCar(1234, -10.0);
        }
        catch(Carp30Exception e)
        {
            System.out.println("拋出" + e + "了");
        }
        car1.show();
    }
}
