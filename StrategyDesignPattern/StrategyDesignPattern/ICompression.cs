using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyDesignPattern
{
    interface ICompression
    {
        void CompressFolder(string compressedArchiveFileName);
    }
}
