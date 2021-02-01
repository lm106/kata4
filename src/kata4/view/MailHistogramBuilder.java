package kata4.view;

import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;

/**
 *
 * @author Luzma
 * @version 11-11-2020
 * @since Práctica de Laboratorio
 */
public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
    
    
    
}
