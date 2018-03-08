package control;

import java.awt.event.ActionEvent;

public class PuzzleController extends AbstractController{
	//Guarda el ultimo boton que has pulsado
	private String action;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		action=e.getActionCommand();
		switch (action) {
			case "clutter": 
				System.out.println("Desordenar");
				break;
			case "solve":
				System.out.println("Solucionar");
				break;
			case "load":
				System.out.println("load");
				break;
			case "exit":
				System.exit(0);
				break;
			case "info":
				System.out.println("bbbbb");
				break;
			default:
				System.out.println("tonto que no hase nah");
				break;
		}
	}

	@Override
	public void notifyObservers(int blankPos, int movedPos) {
		
		
	}
	
	public void getEvents() {
		
	}

}
