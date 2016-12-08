package fi.agileo.carproject;

import fi.agileo.carproject.domain.Ajaja;
import fi.agileo.carproject.domain.Ajaja.Ajotapa;
import fi.agileo.carproject.domain.Auto;
import fi.agileo.carproject.domain.Moottori;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Ajaja ajaja1 = new Ajaja(null, "Juhani", Ajotapa.AGGRESSIIVINEN);
		Ajaja ajaja2 = new Ajaja(null, "Tuomas", Ajotapa.TAVALLINEN);
		Ajaja ajaja3 = new Ajaja(null, "Aapo", Ajotapa.RAUHALLINEN);
		
		Moottori moottori1 = new Moottori(123, 4, 0);
		Moottori moottori2 = new Moottori(213, 6, 0);
		Moottori moottori3 = new Moottori(312, 8, 0);

		Auto auto1 = new Auto("Toyota", "Corolla", 160, ajaja1, moottori1);
		Auto auto2 = new Auto("Audi", "A6", 180, ajaja2, moottori2);
		Auto auto3 = new Auto("BMW", "750", 200, ajaja3, moottori3);
		
		ajaja1.setAjettava(auto1);
		ajaja2.setAjettava(auto2);
		ajaja3.setAjettava(auto3);
    }
}
