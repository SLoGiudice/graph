using Syncfusion.SfChart.XForms;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace GraphApp
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();

            //instance of SfChart

            SfChart chart = new SfChart();
            chart.Title = new ChartTitle() { Text = "1 second of ECG" };

            //initializing Primary Axis
                            //x
            NumericalAxis primaryAxis = new NumericalAxis();
            
            primaryAxis.Title = new ChartAxisTitle() { Text = "time [sec]"};

            chart.PrimaryAxis = primaryAxis;

            //initializing Secondary Axis
                            //y
            NumericalAxis secondaryAxis = new NumericalAxis();

            secondaryAxis.Title = new ChartAxisTitle() { Text = "Voltage [V]" };

            chart.SecondaryAxis = secondaryAxis;

            //adding the SplineSerie to the chart for displaying ECG

            DataModel dataModel = new DataModel();

            chart.Series.Add(new SplineSeries()
            {
                ItemsSource = dataModel.EcgData
            });

            this.Content = chart;
        }
    }
}
