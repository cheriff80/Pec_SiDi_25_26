package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import comun_cliente_servidor.IServidor;
import comun_cliente_servidor.Utils;

public class MainServidor {

	public static void main(String[] args) throws RemoteException {
		
		Utils.setCodeBase(IServidor.class);
		
		Servidor servidor = new Servidor();
		IServidor remote = (IServidor) UnicastRemoteObject.exportObject(servidor, 7777);
		Registry registro = LocateRegistry.getRegistry();
		registro.rebind("Pepito", remote);
	}

}
