using System;
using System.Collections.Generic;
using System.Text;

namespace CommandDesignPattern
{
    class SaveCommand : ICommand
    {
        private Document document;

        public SaveCommand(Document document)
        {
            this.document = document;
        }
        public void Execute()
        {
            document.Save();
        }
    }
}
