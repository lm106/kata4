package kata4;

import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.persistence.MailListReader;
import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;

/**
 *
 * @author Luzma
 * @version 11-11-2020
 * @since Práctica de Laboratorio
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram <String> mailHistogram = MailHistogramBuilder.build(mailList);
                
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", mailHistogram);
        histogramDisplay.execute();
        
    }
    
}
