using System;
using System.Collections.Generic;
using System.Text;

namespace com.bridge.design.pattern
{
    public class SonyRemoteControl : AbstractRemoteControl
    {
        public SonyRemoteControl(LEDTV ledTv) : base(ledTv)
        {
        }

        public override void SetChannel(int channelNumber)
        {
            ledTv.SetChannel(channelNumber);
        }

        public override void SwitchOff()
        {
            ledTv.SwitchOff();
        }

        public override void SwitchOn()
        {
            ledTv.SwitchOn();
        }
    }
}
