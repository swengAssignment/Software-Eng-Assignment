package lineargraph;
import net.miginfocom.swing.MigLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.PlotOrientation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class LinearGraph extends JPanel{
    JTextField txt1 = new JTextField();
    public LinearGraph() {

        JButton update = new JButton("Update");
        JButton reset = new JButton("Reset");
        MigLayout mg = new MigLayout("debug,wrap","[][]","[][]");
        setLayout(mg);

        add(txt1,"growx,pushx");
        add(update,"left,wrap");
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
                //createChartPanel().setVisible(false);
                add(createChartPanel(), "span 2");
                createChartPanel().setSize(150,150);
                repaint();
                JLabel tag = new JLabel(txt1.getText());
                add(tag,"growx,pushx, span 2,center,wrap");
            }
        });


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
