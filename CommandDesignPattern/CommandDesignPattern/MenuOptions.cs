using System;
using System.Collections.Generic;
using System.Text;

namespace CommandDesignPattern
{
    public class MenuOptions
    {
        private ICommand openCommand;
        private ICommand saveCommand;
        private ICommand closeCommand;

        public MenuOptions(ICommand openCommand, ICommand saveCommand, ICommand closeCommand)
        {
            this.openCommand = openCommand;
            this.saveCommand = saveCommand;
            this.closeCommand = closeCommand;
        }

        public void clickOpen()
        {
            openCommand.Execute();
        }

        public void clickSave()
        {
            saveCommand.Execute();
        }

        public void clickClose()
        {
            closeCommand.Execute();
        }
    }
}
