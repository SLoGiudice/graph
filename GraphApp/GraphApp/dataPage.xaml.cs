using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;

namespace GraphApp
{
    public partial class dataPage : ContentPage
    {
        public dataPage()
        {
            StackLayout mainStack = new StackLayout();
            StackLayout textStack = new StackLayout();
            Assembly assembly = GetType().GetTypeInfo().Assembly;
            string resource = "GraphApp.dataFolder.myECG.txt";
            List<string> lines = new List<string>();
            string[] data = null;
            string newString = "";
            char separator = ';';

            using (Stream stream = assembly.GetManifestResourceStream(resource))
            {
                using (StreamReader reader = new StreamReader(stream))
                {
                    string line;
                    while (null != (line = reader.ReadLine()))
                    {
                        lines.Add(line);
                    }
                    foreach (string s in lines)
                    {
                        data = s.Split(separator);
                        
                          if(data.Length != 0) { newString = data[0] + " " + data[1]; };

                        Label label = new Label
                        { Text = newString };
                        

                        textStack.Children.Add(label);
                    }

               
                }
            }

            ScrollView scrollView = new ScrollView
            {
                Content = textStack,
                Padding = new Thickness(5, 0)
            };

            mainStack.Children.Add(scrollView);

            Content = mainStack;
        }
    }
}
