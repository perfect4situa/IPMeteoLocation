package main;

import controller.ControllerIPWindow;
import view.IPWindow;
import view.MeteoWindow;

public class Main {

	public static void main(String[] args) {
		
		IPWindow f=new IPWindow();
		ControllerIPWindow c=new ControllerIPWindow(f);
		
	}

}
