using System;
using System.Collections.Generic;
using System.Text;

namespace com.bridge.design.pattern
{
    public class SamsungLedTv : LEDTV
    {
        public void SetChannel(int channelNumber)
        {
            Console.WriteLine("Setting channel Number " + channelNumber + " on Samsung TV");
        }

        public void SwitchOff()
        {
            Console.WriteLine("Turning OFF : Samsung TV");
        }

        public void SwitchOn()
        {
            Console.WriteLine("Turning ON : Samsung TV");
        }
    }
}
