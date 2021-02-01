package kata4.model;

/**
 *
 * @author Luzma
 * @version 11-11-2020
 * @since Práctica de Laboratorio
 */
public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        return mail.substring(mail.indexOf("@") + 1);
    }
    public static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
}
