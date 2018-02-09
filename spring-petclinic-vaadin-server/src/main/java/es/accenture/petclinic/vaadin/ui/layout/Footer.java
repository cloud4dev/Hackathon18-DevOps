package es.accenture.petclinic.vaadin.ui.layout;

import com.vaadin.server.ThemeResource;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;

public class Footer extends HorizontalLayout {

	public Footer() {
		// Imagen Logo
		Image imageLogo = new Image();
		imageLogo.setSource(new ThemeResource("images/Vaadin-logo-200.png"));
		imageLogo.setWidth(200, Unit.PIXELS);
		this.addComponent(imageLogo);
		this.setComponentAlignment(imageLogo, Alignment.MIDDLE_CENTER);
		
	}
}