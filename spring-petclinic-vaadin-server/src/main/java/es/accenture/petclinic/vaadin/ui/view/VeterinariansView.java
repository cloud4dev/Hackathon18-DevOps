package es.accenture.petclinic.vaadin.ui.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.samples.petclinic.vets.dto.VetDto;
import org.springframework.samples.petclinic.vets.dto.VetsDto;
import org.springframework.web.client.RestTemplate;

import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Grid;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringView(name = VeterinariansView.VIEW_NAME)
public class VeterinariansView extends PetClinicBaseView {

	public static final String VIEW_NAME = "Veterinarians";
	
	private ListDataProvider<VetDto> listDataProvider;
	Grid<VetDto> grid;
	
	@Value("${url.vets-service}")
	String urlVerts;
	
	@Override
	public void enter(ViewChangeEvent event) {
		log.debug("urlVerts:" + urlVerts);
		//setSizeFull();		
		grid = new Grid<>(VetDto.class);
		getRooLayout().addComponent(grid);
		getRooLayout().setComponentAlignment(grid, Alignment.MIDDLE_CENTER);
		
		cargarDatos();
	}

	private void cargarDatos() {
		grid.setItems(getVets());		
	}
	
	List<VetDto> getVets() {
		return new RestTemplate().getForObject(urlVerts, VetsDto.class);
		
	}
	
	

}
