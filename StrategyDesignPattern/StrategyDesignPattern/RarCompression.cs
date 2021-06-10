using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyDesignPattern
{
    class RarCompression : ICompression
    {
        public void CompressFolder(string compressedArchiveFileName)
        {
            Console.WriteLine("Folder is compressed using Rar approach: '" + compressedArchiveFileName
                 + ".rar' file is created");
        }
    }
}
