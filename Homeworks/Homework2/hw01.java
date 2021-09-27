public class Client
{
    public static void main (String args[])
    {
        try
        {
            TVFactory factory = new TVFactory();
            TV haiertv=factory.produceTV("Haier");
            haiertv.play();
            TV hisensetv=factory.produceTV("Hisense");
            hisensetv.play();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

interface TV {
    public void play();
}

class HaierTV implements TV {
    public void play()
    {   
        System.out.println("Produce a HaierTV");
    }
}

class HisenseTV implements TV {
    public void play()
    {
        System.out.println("Produce a HisenseTV");
    }
}

class TVFactory {
    public TV produceTV (String brand)
    {
        TV tv = null;
        if (brand.equals("Haier")) {
            tv = new HaierTV();
        } else if (brand.equals("Hisense")) {
            tv = new HisenseTV();
        }
    return tv;
    }
}