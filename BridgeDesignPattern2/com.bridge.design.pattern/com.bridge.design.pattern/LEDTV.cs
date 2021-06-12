using System;
using System.Collections.Generic;
using System.Text;

namespace com.bridge.design.pattern
{
    public interface LEDTV
    {
        void SwitchOn();
        void SwitchOff();
        void SetChannel(int channelNumber);
    }
}
