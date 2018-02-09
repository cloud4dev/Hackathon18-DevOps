package es.accenture.petclinic.vaadin.ui.layout;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

import es.accenture.petclinic.vaadin.ui.view.HomeView;
import es.accenture.petclinic.vaadin.ui.view.VeterinariansView;

@SuppressWarnings("serial")
public class Menu extends MenuBar {

	public Menu() {
		setWidth("100%");
		addItem("Home", VaadinIcons.HOME, new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				UI.getCurrent().getNavigator().navigateTo(HomeView.VIEW_NAME);
			}
		});
		MenuItem ownersItem = addItem("OWNERS", VaadinIcons.CHILD, null);
		
		ownersItem.addItem("ALL", VaadinIcons.SEARCH, new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO
			}
		});
		ownersItem.addItem("REGISTER", VaadinIcons.PLUS, new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO
			}
		});
		
		
		addItem("VETERINARIANS", VaadinIcons.AMBULANCE, new MenuBar.Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				UI.getCurrent().getNavigator().navigateTo(VeterinariansView.VIEW_NAME);
			}
		});
	}
}
