package test;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;

import java.util.*;

public class WebEmailService {
	

	

		 String user="rosebarakat963@gmail.com";
		 String pass="";
		  String smtp="smtp.gmail.com";
		 String receiverEmailID=null;
		  String sub1="";
		  public void send(String to, List<HOME> message, String sub)  {
			  receiverEmailID=to;
			 sub1=sub;
			 String printhome="";
			 String all = null;
			 List<HOME> searchedhome=message;
			 for (int i =0 ;i <message.size();i++) {
							  printhome = searchedhome.get(i).gettype()+""+searchedhome.get(i).getmeterial()+""+searchedhome.get(i).getplacementr()+""+searchedhome.get(i).allowpets()+""+searchedhome.get(i).getamenities()+""+searchedhome.get(i).getfirstprice()+""+searchedhome.get(i).getfirstarea()+""+searchedhome.get(i).getbedroomnumber()+""+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength()+"\n" ;
					         all= all+printhome;
					} 
			 
		        Properties pro=new Properties();
		        pro.put("mail.smtp.user",user);
		       pro.put("mail.smtp.host",smtp);
		        pro.put("mail.smtp.port","587");
		        pro.put("mail.smtp.starttls.enable", "true");
		        pro.put("mail.smtp.auth","true");
		        pro.put("mail.smtp.socketFactory,port","587");
		        
		        try {
		           Authenticator auth = new Authenticator(){
		        		   @Override
		                   protected PasswordAuthentication getPasswordAuthentication() {
		                       return new PasswordAuthentication(user,pass);
		                   }
		           };
		        	Session session=Session.getInstance(pro,auth);
		        	MimeMessage msg=new MimeMessage(session);
		        	 msg.setFrom(new InternetAddress(user));
			         msg.setRecipients(RecipientType.TO,InternetAddress.parse( receiverEmailID));
			         msg.setSubject(sub);
			         msg.setText(all);
			        Transport.send(msg);
		        }
		        catch (javax.mail.MessagingException e){
		            throw new RuntimeException(e);
		        }
		    }
		
		
		
		
	}

