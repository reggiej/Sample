package com.red.mm.service;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class Login {
	
	/*@Controller
	public class HelloController {
	 
		@RequestMapping(value = { "/" }, method = RequestMethod.GET)
		public ModelAndView welcomePage() {
	 
			ModelAndView model = new ModelAndView();
			model.addObject("title", "Spring Security Hello World");
			model.addObject("message", "This is welcome page!");
			model.setViewName("login");
			return model;
	 
		}
	}
	
}*/
	
	private String username;
	
	private String password;
	
	
	public Login(){
		
		/*Exception ex = (Exception) FacesContext
		        .getCurrentInstance()
		        .getExternalContext()
		        .getSessionMap();
		        
		        if (ex != null)
		        	FacesContext.getCurrentInstance().addMessage(null,
		            new FacesMessage(FacesMessage.SEVERITY_ERROR, ex
		                    .getMessage(), ex.getMessage()));*/
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	 	    
	public void login(ActionEvent e)throws java.io.IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("Sample/j_spring_security_check?j_username=" + username + "&j_password=" + password);
	System.out.println("The user name is:" + username);
}
	/*public void login( ActionEvent e ) throws java.io.IOException {
		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalConte xt().getRequest();
		FacesContext.getCurrentInstance().getExternalConte xt().redirect(req.getContextPath().toString()+"/j_spring_security_check?j_username=" + username + "&j_password=" + password);
		} */
	
}
	

	

