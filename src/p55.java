class p55 {
    public static void main(String[] args)
    {
        Companyp55 cmp = new Companyp55();

        Driverp55 drv1 = new Driverp55(cmp);
        drv1.start();
        Driverp55 drv2 = new Driverp55(cmp);
        drv2.start();
    }
}

class Companyp55
{
    private int sum = 0;
    public synchronized void add(int a)
    {
        int tmp = sum;
        System.out.println("目前的合計金額是" + tmp + "元");
        System.out.println("賺到" + a + "元了。");
        tmp = tmp +a;
        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}

class Driverp55 extends Thread
{
    private Companyp55 comp;
    public Driverp55(Companyp55 c)
    {
        comp = c;
    }
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            comp.add(50);
        }
    }
}