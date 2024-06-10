/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class Sistema {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Obligatorio O = new Obligatorio();
        juegodeprueba(O);
     
        
    }
    
    public static void juegodeprueba(Obligatorio o){
        System.out.print("\n" + "SE CREA SISTEMA DE GESTION" + "\n"); 
        o.crearSistemaDeGestion();
        
        //CREAR AEROLINEAS
        System.out.print("\n" + "CREAR AEROLINEAS" + "\n"); 
        o.crearAerolinea("Pluna", "Uruguay", 10);
        o.crearAerolinea("United","USA", 10);
        o.crearAerolinea("INCA","Peru", 2);
        o.crearAerolinea("IBERIA","España", 5);
        o.crearAerolinea("Jet japan", "Japon", 10);
        o.crearAerolinea("Pluna", "Uruguay", 2); // ERROR 1
        o.crearAerolinea("Aerolineas Argentinas", "Argentina", -3); // ERROR 2
        
        //REGISTRAR AVION
        System.out.print("\n" + "REGISTRAR AVION" + "\n");
        o.registrarAvion("URU01", 12, "Pluna");
        o.registrarAvion("URU02", 12, "Pluna");
        o.registrarAvion("INC39", 15, "INCA");
        o.registrarAvion("URU03", 12, "Pluna");//ERROR 3 
        o.registrarAvion("URU01", 12, "Pluna"); //ERROR 1
        o.registrarAvion("JPN01", 5, "Jet japan"); //ERROR 2
        o.registrarAvion("JPN01", 14, "Jet japan"); //ERROR 2
        o.registrarAvion("PWR" ,12 , "Pet Airways"); // ERROR 3
        
        
        //ELIMINAR AEROLINEAS
        System.out.print("\n" + "ELIMINAR AEROLINEAS" + "\n");
        o.eliminarAerolinea("United"); 
        o.eliminarAerolinea("Copsa"); // ERROR 1  
        o.eliminarAerolinea("Pluna"); // ERROR 2
      
        
        //ELIMINAR AVION
        System.out.print("\n" + "ELIMINAR AVION" + "\n");
        o.eliminarAvion("Pluna", "URU01");
        o.eliminarAvion("Copsa", "809"); //ERROR1
        o.eliminarAvion("Pluna" , "URU20"); //ERROR2
        
        
        //LISTAR AEROLINEAS
        System.out.print("\n" + "LISTAR AEROLINEAS" + "\n");
        o.listarAerolineas();
        
        //LISTAR AVIONES
        System.out.print("\n" + "LISTAR AVIONES" + "\n");
        o.listarAvionesDeAerolinea("Pluna");
        o.listarAvionesDeAerolinea("Casino Express"); //ERROR 1
        
      
        //REGISTRAR CLIENTE 
        System.out.print("\n" + "REGISTRAR CLIENTES" + "\n");
        o.registrarCliente("AA34567", "Rodrigo Lopez", 30);
        o.registrarCliente("AB12345", "Andreina Martinez", 30);
        o.registrarCliente("LV12398", "Lucas Viera", 30);
        o.registrarCliente("NJ09823", "Daniel Bameyi", -1);//ERROR 1 
        o.registrarCliente("AA34567C", "Richard Morales", 30);//ERROR 2
        o.registrarCliente("AA34567", "Federico Motta", 30);//ERROR 3
        
        
        //LISTAR CLIENTE
        System.out.print("\n" + "LISTAR CLIENTE" + "\n");
        o.listarClientes();
        
        //CREAR VUELO
        System.out.print("\n" + "CREAR VUELO" + "\n");
        o.crearVuelo("MVDTOBS", "Pluna", "URU02", "Argentina", 04, 06, 2024, 6, 6);
        o.crearVuelo("LIMTOMVD", "INCA", "INC39", "Uruguay", 03, 06, 2024, 3, 6);
        o.crearVuelo("MVDTOBS", "Pluna", "URU01", "Brasil", 05, 06, 2024, 6, 6);//ERROR 1
        o.crearVuelo("MVDTOAS", "Casino Express", "CAS1", "Paraguay", 05, 06, 2024, 6, 6);//ERROR 2
        o.crearVuelo("MVDTOAS", "Pluna", "URU97", "Paraguay", 06, 06, 2024, 6, 6);//ERROR 3
        o.crearVuelo("MVDTOMAD", "Pluna", "URU01", "España", 16, 06, 2024, 4, 3); //ERROR 5
        o.crearVuelo("MVDTOMAD", "Pluna", "URU01", "España", 16, 06, 2024, 3, 4); //ERROR 5
        o.crearVuelo("MVDTOMAD", "Pluna", "URU01", "España", 12, 06, 2024, 12, 6);//ERROR 6
        
        
        //COMPRAR PASAJE 
        System.out.print("\n" + "COMPRAR PASAJE" + "\n");
        o.comprarPasaje("LV12398","LIMTOMVD", 1);
        o.comprarPasaje("AB12345","LIMTOMVD", 1);
        o.comprarPasaje("AA34567","MVDTOBS", 2);
        o.comprarPasaje("AAAAAA", "URU02", 1); //ERROR 1
        o.comprarPasaje("LV12398", "IND09", 1); //ERROR 2
        
        
        //DEVOLVER PASAJE 
        System.out.print("\n" + "DEVOLVER PASAJE" + "\n");
        o.devolverPasaje("LV12398", "LIMTOMVD");
        o.devolverPasaje("AAAAAA", "LIMTOMVD");//ERROR 1
        o.devolverPasaje("AB12345", "JPTORUS");//ERROR 2
        o.devolverPasaje("AB12345", "MVDTOBS");//ERROR 3
        
        //LISTA VUELOS 
        System.out.print("\n" + "LISTAR VUELOS" + "\n");
        o.listarVuelos();
        

        //REPORTE PASAJEROS DEUVELTOS
        System.out.print("\n" + "REPORTE PASAJEROS DEUVELTOS" + "\n");
        o.pasajesDevueltos("INCA");
        o.pasajesDevueltos("Casino Express");//ERROR 1
      
    
    }
}
