using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyDesignPattern2
{
    class BusTravelStrategy : ITravelStrategy
    {
        public void GotoAirport()
        {
            Console.WriteLine("Traveler is going to Airport by bus and will be charged Rs 300");
        }
    }
}
