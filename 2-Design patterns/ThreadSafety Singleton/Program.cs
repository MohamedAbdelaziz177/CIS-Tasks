namespace ThreadSafety_Singleton
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            SingleTon singleTon1 = SingleTon.GetInstance();

            SingleTon singleTon2 = SingleTon.GetInstance();

            if(singleTon1 == singleTon2) Console.WriteLine("ST verified");

            SingleTon singleTon3 = SingleTon.GetInstance();

            if (singleTon3 == singleTon2) Console.WriteLine("ST verified");

            SingleTon singleTon4, singleTon5;


            Thread t1 = new Thread(() =>
            {
                SingleTon singleTon = SingleTon.GetInstance();

                singleTon4 = singleTon;


                if (singleTon4 == singleTon2) Console.WriteLine("ST verified");
            });

            Thread t2 = new Thread(() =>
            {
                SingleTon singleTon = SingleTon.GetInstance();

                singleTon5 = singleTon;

                if (singleTon3 == singleTon5) Console.WriteLine("ST verified");
            });

            t1.Start();
            t2.Start();

            t1.Join();
            t2.Join();

            Console.WriteLine(SingleTon.noOfInstances);


        }
    }
}
