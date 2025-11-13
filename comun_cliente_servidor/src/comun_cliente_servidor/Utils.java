package comun_cliente_servidor;

public class Utils {

	//Obtiene la ruta de la clase que se pasa como parámetro	
	public static void setCodeBase(Class <?> c) {
			c.getProtectionDomain().getCodeSource().getCertificates().toString();
	}
}
