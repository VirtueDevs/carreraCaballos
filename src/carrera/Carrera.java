package carrera;

import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread{
	
	private JLabel etiqueta;
	private FRMcarrera caballo;

	
	public Carrera(JLabel etiqueta, FRMcarrera caballo) {
		this.etiqueta = etiqueta;
		this.caballo = caballo;
	}

	public void run() {
		
		int caballo1 = 0;
		int caballo2 = 0;
		int caballo3 = 0;
		int caballo4 = 0;
		
		
		while(true) {
			try {
				int randomNum = (int) (Math.random() * 30)+1;
				if (randomNum % 2 == 0) { 
					etiqueta.setLocation(etiqueta.getLocation().x+1,etiqueta.getLocation().y);
				} else if (randomNum % 3 == 0) { 
					etiqueta.setLocation(etiqueta.getLocation().x-1,etiqueta.getLocation().y);
				}else if(randomNum % 5 == 0) {
					etiqueta.setLocation(etiqueta.getLocation().x+2,etiqueta.getLocation().y);
				}else if(randomNum % 7 == 0) {
					etiqueta.setLocation(etiqueta.getLocation().x-2,etiqueta.getLocation().y);
				}
				caballo1 = caballo.getPrimerCaballo().getLocation().x;
				caballo2 = caballo.getSegundoCaballo().getLocation().x;
				caballo3 = caballo.getTercerCaballo().getLocation().x;
				caballo4 = caballo.getCuartoCaballo().getLocation().x;
				
			
				if (caballo1 < caballo.getBarreraMeta().getLocation().x-50 && caballo2 < caballo.getBarreraMeta().getLocation().x-50 && 
						caballo3 < caballo.getBarreraMeta().getLocation().x-50 && caballo4 < caballo.getBarreraMeta().getLocation().x-50) {
					caballo.repaint();
				}else {
					break;
				}
				Thread.sleep((int) (Math.random() * 10) + 1);
			}catch (Exception e){
				System.out.println(e);
			}
			

	} if(etiqueta.getLocation().x >= caballo.getBarreraMeta().getLocation().x-50) {
		if(caballo1 > caballo2 && caballo1 > caballo3 && caballo1 > caballo4) {
			JOptionPane.showMessageDialog(null, "Ganó el primer caballo");
		}
		else if(caballo2 > caballo3 && caballo2 > caballo3 && caballo2 > caballo4) {
			JOptionPane.showMessageDialog(null, "Ganó el segundo caballo");
		}
		else if(caballo3 > caballo4 && caballo3 > caballo1 && caballo3 > caballo2) {
			JOptionPane.showMessageDialog(null, "Ganó el Tercer caballo");
		}
		else if(caballo4 > caballo1 && caballo4 > caballo2 && caballo4 > caballo3) {
			JOptionPane.showMessageDialog(null, "Ganó el cuarto caballo");
		}else {
			JOptionPane.showMessageDialog(null, "Empate");
		}
		
	}
}
}
