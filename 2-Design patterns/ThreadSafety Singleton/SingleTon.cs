using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace ThreadSafety_Singleton
{
    internal class SingleTon
    {

        public static int noOfInstances = 0;
        private static  SingleTon instance = null;

        private static readonly object Lock = new object();
        private SingleTon() { }


        
        public static SingleTon GetInstance()
        {
            if (instance != null) return instance;

            lock (Lock)
            {
                if (instance == null)
                {
                    Console.WriteLine("Creating Instance for 1st time");

                    instance = new SingleTon();
                    noOfInstances++;

                    return instance;
                }

                return instance;
            }
            
        }


    }
}
