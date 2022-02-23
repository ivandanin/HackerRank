using System;
using System.Windows.Forms;

namespace SDA_46337z_02
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int[] nums;
            nums = new int[] { 0, 1, 2, 3, 4 };
            Type arrayType = nums.GetType();

            if (arrayType.IsArray)
            {
                richTextBox1.Text = String.Format("Типът на масива е: {0}", arrayType);
            } else
            {
                richTextBox1.Text = String.Format("Не е масив");
            }
        }
    }
}
