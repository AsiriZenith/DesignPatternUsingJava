using System;
using System.Collections.Generic;
using System.Text;

namespace TemplateMethodDesignPattern2
{
    class BruCoffee : CoffeeTemplate
    {
        protected override void AddCoffeePowder()
        {
            Console.WriteLine("Water Boild");
        }

        protected override void AddMilk()
        {
            Console.WriteLine("Milk Added");
        }

        protected override void AddSugar()
        {
            Console.WriteLine("Sugar Added");
        }

        protected override void BoilWater()
        {
            Console.WriteLine("Bru Coffee Powder Added");
        }
    }
}
