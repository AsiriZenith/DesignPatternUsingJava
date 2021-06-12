using System;
using System.Collections.Generic;
using System.Text;

namespace CommandDesignPattern
{
    public class OpenCommand : ICommand
    {
        private Document document;

        public OpenCommand(Document document)
        {
            this.document = document;
        }

        public void Execute()
        {
            document.Open();
        }
    }
}
