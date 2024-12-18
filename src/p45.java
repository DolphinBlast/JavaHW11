class p45 {
    public static void main(String[] args)
    {
        Carp45 car1 = new Carp45("1號車");

        Carp45 car2 = new Carp45("2號車");

        car1.start();

        car2.start();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class Carp45 extends Thread
{
    private String name;

    public Carp45(String nm)
    {
        name = nm;
    }

    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}