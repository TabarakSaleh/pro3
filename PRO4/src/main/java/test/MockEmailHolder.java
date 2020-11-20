package test;
import static org.mockito.Mockito.*;
public class MockEmailHolder {

	
	
		
	 WebEmailService emailService= mock(WebEmailService.class)	;
	 public MockEmailHolder(SearchSteps finder) {
		finder.setEmailService(emailService);
	 }
		public WebEmailService getEmailService() {
			return emailService;
			
		}
		
		public void setEmailService(WebEmailService a) {
			this.emailService=a;
		}
		
		
		
		
	}

