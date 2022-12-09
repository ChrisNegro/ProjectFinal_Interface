package Bot;

public class Bot {
	
	public static String Respuesta(String e){
		String respuesta = null;
		int op = 0;
		
		
		//Pregunta
		if(e.equalsIgnoreCase("Hola")){
			op = 1;
		}else if(e.equalsIgnoreCase("Como estas")){
			op = 2;
		}else if(e.equalsIgnoreCase("En que trabajas")){
			op = 3;
		}else if(e.equalsIgnoreCase("Que haces")){
			op = 4;
		}else if(e.equalsIgnoreCase("Adios")){
			op = 5;
		}else if(e.equalsIgnoreCase("Necesito que me mandes tu parte")){
			op = 6;
		}else if(e.equalsIgnoreCase("Cuanto te falta")){
			op = 7;
		}
		
		
		//Respuesta
		switch(op){
		case 1:
			respuesta = "YO:"+ e + "\nAMIGO: Hola";
			break;
		case 2:
			respuesta = "YO:"+ e + "\nAMIGO: Bien";
			break;
		case 3:
			respuesta = "YO:"+ e + "\nAMIGO: En el proyecto que me mandaste";
			break;
		case 4:
			respuesta = "YO:"+ e + "\nAMIGO: Estoy chateando contigo";
			break;
		case 5:
			respuesta = "YO:"+ e + "\nAMIGO: Adios";
			break;
		case 6:
			respuesta = "YO:"+ e + "\nAMIGO: En unos 5 minutos te lo envio";
			break;
		case 7:
			respuesta = "YO:"+ e + "\nAMIGO: Aun me quedan detalles para finalizar";
			break;
		}
		return respuesta;
	}

}
