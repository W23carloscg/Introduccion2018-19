//Colores
/**
 * @author Carlos_cg 
 **/
public class Horario {
	public static void main(String[] args) {
		
	String w = "\033[37m";
	String Programacion = "\033[32mProgramacion";
	String EDesarrollo = "\033[31mEDesarrollo";
	String Recreo = "\033[34mRecreo";
	String SGEM = "\033[33mSGEM";
	String AccesoDatos = "\033[35mAccesoDatos";
	String stab = "\t";
	String dtab = "\t\t";
	String ttab = "\t\t\t";
	String ctab = "\t\t\t\t";
	
	System.out.println("Este es mi horario de 1ºDAM y 2ºDAM Creado por Carlos_cg :D");
	System.out.println("                                                        ");	
	System.out.println("\tLunes\t\tMartes\t\tMiercoles\t\tJueves\t\tViernes");
	System.out.println(w+ "8:15"  + ttab + Programacion + ctab + Programacion);
	System.out.println(w+ "9:15"  + ttab + Programacion + stab + EDesarrollo + dtab + Programacion + stab + SGEM);
	System.out.println(w+ "10:15" + stab + Programacion + ctab + dtab +  AccesoDatos + stab +  Programacion);
	System.out.println(w+ "11:15" + stab + Recreo + dtab + Recreo + dtab + Recreo + ttab + Recreo + dtab + Recreo);
	System.out.println(w+ "11:45" + stab + Programacion + ttab + ttab + AccesoDatos + stab + Programacion );
	System.out.println(w+ "12:45" + stab + AccesoDatos + stab + EDesarrollo + ttab + SGEM);
	System.out.println(w+ "13:45" + stab + AccesoDatos + stab + EDesarrollo + ttab + SGEM);
	System.out.println(w+"\n");
	}
}
