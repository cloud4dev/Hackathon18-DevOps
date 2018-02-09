package es.accenture.petclinic.vaadin.ui.layout;

import javax.annotation.PostConstruct;

import com.jarektoro.responsivelayout.ResponsiveLayout;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;

//public class Header extends ResponsiveLayout {
public class Header extends HorizontalLayout {
	
	private Menu menu;
	private Image imageLogo;
	
	public Header() {
		//this.setWidth("100%");
		this.setWidth(100, Unit.PERCENTAGE);
		this.setHeight(60, Unit.PIXELS);
		
		build();
	}
	
	
	//@PostConstruct
	public void build() {
		// Imagen Logo
		imageLogo = new Image();
		
		imageLogo.setSource(new ThemeResource("images/spring-pivotal-logo.png"));
		imageLogo.setWidth(200, Unit.PIXELS);
		
		
		
		
		menu = new Menu();
		menu.setWidth(400, Unit.PIXELS);
		menu.setHeight(100, Unit.PERCENTAGE);
		
		HorizontalLayout hlCabecera = new HorizontalLayout(imageLogo, menu);
		hlCabecera.setWidth("100%");
		hlCabecera.setExpandRatio(imageLogo, 1);
		hlCabecera.setComponentAlignment(imageLogo, Alignment.TOP_LEFT);
		hlCabecera.setComponentAlignment(menu, Alignment.TOP_RIGHT);
		
		// menu
		this.addComponent(hlCabecera);
		
		
		
		
	}
}
