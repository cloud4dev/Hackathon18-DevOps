package es.accenture.petclinic.vaadin.ui.view;


import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;

@SpringView(name = HomeView.VIEW_NAME)
public class HomeView extends PetClinicBaseView {

	public static final String VIEW_NAME = "";
	
	@Override
	public void enter(ViewChangeEvent event) {
		setSizeFull();	
		
		
		Label lbTitulo = new Label("Welcome to PetClinic");
		Image imageLogo = new Image();
		imageLogo.setSource(new ThemeResource("images/pets.png"));
		imageLogo.setWidth(200, Unit.PIXELS);

		
		getRooLayout().addComponents(lbTitulo, imageLogo);
		

	}


}
