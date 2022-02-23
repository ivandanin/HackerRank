using System;
using System.Windows.Forms;

namespace SDA_46337z_01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void button1_Click(object sender, EventArgs e)
        {
            int[] YourArray = { 1, 2, 3, 4, 5, 6 };
            string s = "";
            for (int i = 0; i < YourArray.Length; i++)
            {
                s += YourArray[i].ToString() + " ";
            }
            richTextBox1.Text += "Първоначално състояние на масива:\n" + s + "\n";

            int[] temp = new int[YourArray.Length + 1];
            if (YourArray != null)
            {
                Array.Copy(YourArray, temp, Math.Min(YourArray.Length, temp.Length));
            }

            YourArray = temp;

            YourArray[YourArray.Length - 1] = 7;
            s = "";
            for (int i = 0; i < YourArray.Length; i++)
            {
                s += YourArray[i].ToString() + " ";
            }

            richTextBox1.Text += "Състоянието на масива след преоразмеряването му: \n" + s;
        }
    }
}
