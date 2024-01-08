package home;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
	
	public static void main(String[] args) {
		
		try {
			LocateRegistry.createRegistry(1099);
			EtudiantImpl Etu = new EtudiantImpl();
			System.out.println(Etu.toString());
			String chemin="rmi://127.0.0.1:1099/Etu";
			Naming.rebind(chemin, Etu);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
