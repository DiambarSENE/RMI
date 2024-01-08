package home;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IEtudiant extends Remote{
	public int nbEtudiant() throws RemoteException;
	public List<Etudiant> listeEtudiants() throws RemoteException;
	public Etudiant rechercheByNum(int numero) throws RemoteException;

}
