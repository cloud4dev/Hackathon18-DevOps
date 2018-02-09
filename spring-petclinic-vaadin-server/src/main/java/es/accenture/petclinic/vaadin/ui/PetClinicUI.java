package es.accenture.petclinic.vaadin.ui;

import javax.swing.text.StyledEditorKit.AlignmentAction;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Viewport;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.DefaultErrorHandler;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import es.accenture.petclinic.vaadin.ui.layout.Footer;
import es.accenture.petclinic.vaadin.ui.layout.Header;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringUI()
@Theme("petclinic")
@Viewport("width=device-width,initial-scale=1.0,user-scalable=no")
public class PetClinicUI extends UI {
	
	@Autowired
	private SpringViewProvider viewProvider;
	
	@Override
	protected void init(VaadinRequest request) {
		
		setSizeFull();		
		
		VerticalLayout viewContainer = new VerticalLayout();
		Footer footer = new Footer();
		VerticalLayout mainLayout = new VerticalLayout(new Header(), viewContainer,  footer);
		mainLayout.setComponentAlignment(footer, Alignment.MIDDLE_CENTER);
		
		//mainLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		
		//mainLayout.setSizeFull();
        setContent(mainLayout);
		Navigator navigator = new Navigator(this, viewContainer);
		navigator.addProvider(viewProvider);

		setErrorHandler(new DefaultErrorHandler() {
			@Override
			public void error(com.vaadin.server.ErrorEvent event) {
				Throwable ex = findRelevantThrowable(event.getThrowable());
				Notification.show("ErrorHandler", ex.getMessage(), Notification.Type.ERROR_MESSAGE);
			}
		});
	}
}