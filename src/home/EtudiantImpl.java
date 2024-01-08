package home;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class EtudiantImpl extends UnicastRemoteObject implements IEtudiant{
	private List<Etudiant> listeEtudiant = new ArrayList<Etudiant>();
	
	protected EtudiantImpl() throws RemoteException{
		listeEtudiant.add(new Etudiant("SENE","HEROS",10));
		listeEtudiant.add(new Etudiant("SECK","MATY",12));
	}
	private static final long serialVersionUID = 1L;
	
	public int nbEtudiant() throws RemoteException{
		return listeEtudiant.size();
	}
	
	public List<Etudiant> listeEtudiants() throws RemoteException{
		return listeEtudiant;
	}
	
	public Etudiant rechercheByNum(int numero) {
		for(Etudiant E:listeEtudiant) {
			if(E.getNumero()==numero) {
				return E;
			}
		}
		return null;
	}

	

}
