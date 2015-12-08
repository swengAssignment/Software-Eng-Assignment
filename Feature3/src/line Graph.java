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
	
	
    private JPanel createChartPanel() {
        String chartTitle = "equation chart";
        String xAxisLabel = "X";
        String yAxisLabel = "Y";

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset,PlotOrientation.VERTICAL,false,false,false);


        customizeChart(chart);

        // saves the chart as an image files
        File imageFile = new File("XYLineChart.png");
        int width = 640;
        int height = 480;

        try {
            ChartUtilities.saveChartAsPNG(imageFile, chart, width, height);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        return new ChartPanel(chart);
    }

    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Object 1");
        String input= txt1.getText();

        String words[] = input.split("x|X|Y|y|=|\\+");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        float X =Integer.parseInt(words[0]);
        float Y = Integer.parseInt(words[2]);
        float ans = Integer.parseInt(words[4]);

        float xat0 = ans/Y;
        float yat0 = ans/X;
        float xat20 = ans/Y*20;
        float yat20 = ans/X*20;
        series1.add(xat0, yat0);
        series1.add(xat20, yat20);



        dataset.addSeries(series1);


        return dataset;
    }

    private void customizeChart(JFreeChart chart) {
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        // sets paint color for each series
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.GREEN);
        renderer.setSeriesPaint(2, Color.YELLOW);

        // sets thickness for series (using strokes)
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));


        // sets paint color for plot outlines
        plot.setOutlinePaint(Color.BLUE);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        // sets renderer for lines
        plot.setRenderer(renderer);

        // sets plot background
        plot.setBackgroundPaint(Color.DARK_GRAY);

        // sets paint color for the grid lines
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LinearGraph().setVisible(true);
            }
        });
    }
}