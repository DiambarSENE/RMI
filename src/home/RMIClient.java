package home;

import java.rmi.Naming;
import java.util.List;

public class RMIClient {
	public static void main(String[] args) {
		
		try {
			IEtudiant stub = (IEtudiant)Naming.lookup("rmi://127.0.0.1:1099/Etu");
			System.out.println("le nombre etudiant est "+stub.nbEtudiant());
			System.out.println("Ils sont");
			List<Etudiant> listeEtudiant=stub.listeEtudiants();
			
			for(Etudiant E:listeEtudiant) {
				System.out.println(E.getPrenom() + " " + E.getNom() + " " + E.getNumero());
			}
			System.out.println(stub.rechercheByNum(10).getPrenom() + " " + stub.rechercheByNum(10).getNom() + " "+stub.rechercheByNum(10).getNumero()); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
