package comun_cliente_servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServidor extends Remote {

	//Métodos de la interface desde el servidor al usuario
	//Utilizo la devolución de un int en caso de afirmativo
	//Dentro del servicio de autenticación
	public int autenticar (String nombre, String pass) throws RemoteException;
	public int registrar (String nombre, String nick , String pass) throws RemoteException;
	
	//Dentro del servicio gestor
	public int enviarTrino ( Trino t, String nick) throws RemoteException;
	public int bloquearUsuario (String nickBloqueado, String nickBloqueador) throws RemoteException;
	public int seguirUsuario ( String nickSolicita, String nickSeguido) throws RemoteException;
	
	//última visualización vídeo 17:00
}
