/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.email;
import com.sun.mail.smtp.SMTPTransport;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author a
 */
public class sendEmail {
    email eml = new email();
    public sendEmail(email eml1){
        this.eml =  eml1;
       
    }
    
    public void send(String to) throws MessagingException{
        
        
        
   Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

      
        Properties props = System.getProperties();
        props.setProperty("mail.smtps.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtps.auth", "true");

      
        props.put("mail.smtps.quitwait", "false");

        Session session = Session.getInstance(props, null);

        
        final MimeMessage msg = new MimeMessage(session);

        
        msg.setFrom(new InternetAddress(eml.sender()+"@gmail.com"));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));



        msg.setSubject(eml.getSubject());
        msg.setText(eml.getMessage(), "utf-8");
        msg.setSentDate(new Date());

        SMTPTransport t = (SMTPTransport)session.getTransport("smtps");

        t.connect("smtp.gmail.com", eml.sender(), eml.psswrd());
        t.sendMessage(msg, msg.getAllRecipients());      
        t.close();
    
        
    
    }
    
        public void setmodelssubject(String subj){
            eml.setSubject(subj);
        }
        public void setmodelsmessage(String msg){
            eml.setMessage(msg);
        }
    
}
