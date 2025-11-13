package comun_cliente_servidor;

public class Utils {

	public static final String CODEBASE = "jave.rmi.server.codebase";
	//Obtiene la ruta de la clase que se pasa como parámetro	
	public static void setCodeBase(Class <?> c) {
			String ruta = c.getProtectionDomain().getCodeSource()
					.getCertificates().toString();
			
			String path = System.setProperty(CODEBASE, ruta);
			
			if (path != null && !path.isEmpty() ) {
				ruta = path + " " + ruta;
			}
			
			System.setProperty(CODEBASE, ruta);
	}
}
