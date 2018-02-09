package es.accenture.petclinic.vaadin.ui.view;

import com.jarektoro.responsivelayout.ResponsiveLayout;
import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

import lombok.Getter;
import lombok.Setter;

public abstract class PetClinicBaseView extends ResponsiveLayout implements View {
	
	@Getter@Setter
	private VerticalLayout rooLayout;
	
	public PetClinicBaseView() {
		setSizeFull();
		// Layout principal que contiene a todos los elementos
		rooLayout = new VerticalLayout();
		rooLayout.setMargin(true);
		rooLayout.setSpacing(true);
		rooLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		//rooLayout.addComponent(new Header());
		this.addComponent(rooLayout);				
	}

}
