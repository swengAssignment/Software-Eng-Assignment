package lineargraph;


import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class JFreeChartLineChartExample extends JFrame {

    private static final long serialVersionUID = 20L;

    public JFreeChartLineChartExample(String applicationTitle, String chartTitle) {
        super(applicationTitle);

        // based on the dataset we create the chart
        JFreeChart pieChart = ChartFactory.createXYLineChart(chartTitle, "X Axis 'Time Frame'", 
        		"Y Axis 'Usage of Iexplorer ", createDataset(),PlotOrientation.VERTICAL, true, true, false);

        // Adding chart into a chart panel
        ChartPanel chartPanel = new ChartPanel(pieChart);

        // settind default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        // add to contentPane
        setContentPane(chartPanel);
    }

    private XYDataset createDataset() {

        final XYSeries firefox = new XYSeries("X");
        firefox.add(0, 3.0);
      //  firefox.add(2.0, 3.0);
        firefox.add(6.0,3.0 );

        final XYSeries chrome = new XYSeries("Y");
        //chrome.add(1.0, 4.0);
        chrome.add(3.0, 0);
        chrome.add(3.0, 6.0);


        final XYSeries iexplorer = new XYSeries("InternetExplorer");
        iexplorer.add(5.5, 0.5);
      //  iexplorer.add(4.0, 5.0);
        iexplorer.add(0.5, 5.5);


        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(firefox);
        dataset.addSeries(chrome);
        dataset.addSeries(iexplorer);

        return dataset;

    }

    public static void main(String[] args) {
        JFreeChartLineChartExample chart = new JFreeChartLineChartExample("Browser "
        		+ "Usage Statistics", "Internet Explorer Usage");
        chart.pack();
        chart.setVisible(true);
    }
}
