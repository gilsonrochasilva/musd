package br.com.musd.mb.common;


import br.com.musd.exception.MBException;
import br.com.musd.exception.ServiceException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.faces.context.FacesContext.getCurrentInstance;

public class MusdActionListener implements ActionListener {

	private static Logger logger = Logger.getLogger(MusdActionListener.class.getName());

	private final ActionListener delegate;

	public MusdActionListener(ActionListener delegate) {
		this.delegate = delegate;
	}

	public void processAction(ActionEvent event) throws AbortProcessingException {
		try {
			delegate.processAction(event);
		} catch (Exception e) {
			e.printStackTrace();
			messageExceptions(e);
		}
	}

	/**
	 * Registra as exceções no FacesMessage
	 * 
	 * @param exception
	 */
	private void messageExceptions(Exception e) {
		FacesContext context = getCurrentInstance();
		
		Throwable causa = e;
		causa = causa.getCause();
		if ((causa instanceof ServiceException) || (causa instanceof MBException) ) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, causa.getMessage(), null));
			logger.log(Level.WARNING, causa.getMessage(), causa);
		} else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, causa.getMessage(), null));
			logger.log(Level.SEVERE, causa.getMessage(), causa);
		}
	}
}
