package kata4.view;

import kata4.model.Histogram;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Luzma
 * @version 11-11-2020
 * @since Práctica de Laboratorio
 */
public class HistogramDisplay extends ApplicationFrame{
    Histogram<String> histogram;
    public HistogramDisplay(String title, Histogram<String> histogram) {
        super(title);
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart freeChart = ChartFactory.createBarChart("JFreeChart Histogram", "email domains", "Nº emails", dataset, PlotOrientation.VERTICAL,  false, false, rootPaneCheckingEnabled);
        return freeChart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }
        return dataSet;
    }
    
    public void execute(){
        this.setVisible(true);
    }
    
    
    
}
