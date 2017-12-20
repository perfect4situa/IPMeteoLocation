package main;

import model.Previsione;
import controller.ControllerIPWindow;
import controller.ControllerMeteoWindow;
import view.IPWindow;
import view.MeteoWindow;

public class Main {

	public static void main(String[] args) {
		
		//IPWindow f=new IPWindow();
		new ControllerMeteoWindow(new Previsione("treviso"), new MeteoWindow());
		//ControllerIPWindow c=new ControllerIPWindow(f);
	}

}
