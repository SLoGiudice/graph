using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Syncfusion.SfChart.XForms;
using System.Collections.ObjectModel;
using System.Reflection;
using System.IO;

namespace GraphApp
{
    public class DataModel
    {
        public ObservableCollection<ChartDataPoint> EcgData;

        public DataModel()
        {
            EcgData = new ObservableCollection<ChartDataPoint>();

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

                        if (data.Length != 0)
                        {
                            EcgData.Add(new ChartDataPoint(data[0], Convert.ToDouble(data[1])));
                        };

                       
                    }


                }
            }
        }
    }
}
