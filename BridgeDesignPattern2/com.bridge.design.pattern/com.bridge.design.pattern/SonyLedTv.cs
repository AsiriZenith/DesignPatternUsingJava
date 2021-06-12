using System;
using System.Collections.Generic;
using System.Text;

namespace com.bridge.design.pattern
{
    public class SonyLedTv : LEDTV
    {
        public void SetChannel(int channelNumber)
        {
            Console.WriteLine("Setting channel Number " + channelNumber + " on Sony TV");
        }

        public void SwitchOff()
        {
            Console.WriteLine("Turning OFF : Sony TV");
        }

        public void SwitchOn()
        {
            Console.WriteLine("Turning ON : Sony TV");
        }
    }
}
