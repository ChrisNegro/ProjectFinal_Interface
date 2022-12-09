package Bot;

import javax.swing.JComboBox;

public class Seleccionables {
	
	//Profesiones
	private static String [] Profesiones = {
		"Programador", 
		"Telecomunicaciones", 
		"Disenador", 
	};

	//Carga de Trabajo
	private static String [] Carga_Trabajo = {
		"Programador", 
		"Telecomunicaciones", 
		"Disenador", 
	};
	//Pais
	private static String [] Pais = {
		"Mexico", 
		"Canada", 
		"Cuba", 
		"Jamaica", 
		"Inglaterra", 
		"Argentina", 
	};
	//AdminOptions
	private static String [] Options = {
		"Listado de Proyectos", 
		"Personas sin Proyecto asignado", 
		"Peronas con mayor cantidad de conexiones de trabajo", 

	};

	
	public static String[] getProfesiones() {
		return Profesiones;
	}
	
	public static String[] getPais() {
		return Pais;
	}
	
	public static String[] getCarga_Trabajo() {
		return Carga_Trabajo;
	}
	
	public static String [] getOptions() {
		return Options;
	}
	
	
	
	public static void llenarJComboBox(JComboBox<String> comboBox, String [] lista){
		
		comboBox.addItem("<Seleccione>");
		
		for(int i=0; i<lista.length;i++)	
			comboBox.addItem(lista[i]);
	}
	
	public static int posicion_enComboBox(String [] lista, String atributo){	
		int pos =-1;
		
		for(int i=0; i<lista.length && pos==-1; i++){		
			if( lista[i].equalsIgnoreCase(atributo) )
				pos = i;
		}
		return pos+1;
	}


}
