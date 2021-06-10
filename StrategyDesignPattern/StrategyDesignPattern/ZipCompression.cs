using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyDesignPattern
{
    class ZipCompression : ICompression
    {
        public void CompressFolder(string compressedArchiveFileName)
        {
            Console.WriteLine("Folder is compressed using zip approach: '" + compressedArchiveFileName
                 + ".zip' file is created");
        }
    }
}
