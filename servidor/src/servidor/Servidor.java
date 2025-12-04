package servidor;

import java.rmi.RemoteException;

import comun_cliente_servidor.IServidor;
import comun_cliente_servidor.Trino;

public class Servidor implements IServidor {

	@Override
	public int autenticar(String nombre, String pass) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int registrar(String nombre, String nick, String pass) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int enviarTrino(Trino t, String nick) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bloquearUsuario(String nickBloqueado, String nickBloqueador) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int seguirUsuario(String nickSolicita, String nickSeguido) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
