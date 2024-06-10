/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 * @franciscoRodriguez 277804
 *
 * @author Administrator
 */
public class Obligatorio implements IObligatorio {

    ListaAerolinea la;
    ListaAvion Lav;
    ListaCliente Lcli;
    ListaPasaje LiP;
    ListaVuelo LiV;

    public Obligatorio() {
    }

    public ListaAerolinea getLa() {
        return la;
    }

    public void setLa(ListaAerolinea la) {
        this.la = la;
    }

    public ListaAvion getLav() {
        return Lav;
    }

    public void setLav(ListaAvion Lav) {
        this.Lav = Lav;
    }

    public ListaCliente getLcli() {
        return Lcli;
    }

    public void setLcli(ListaCliente Lcli) {
        this.Lcli = Lcli;
    }

    public ListaPasaje getLiP() {
        return LiP;
    }

    public void setLiP(ListaPasaje LiP) {
        this.LiP = LiP;
    }

    public ListaVuelo getLiV() {
        return LiV;
    }

    public void setLiV(ListaVuelo LiV) {
        this.LiV = LiV;
    }

    @Override //1.1
    public Retorno crearSistemaDeGestion() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        this.la = new ListaAerolinea();
        this.Lav = new ListaAvion();
        this.LiV = new ListaVuelo();
        this.Lcli = new ListaCliente();

        System.out.println("Resultado: " + ret.resultado + ", Mensaje: Se pudo iniciar el sistema correctamente");
        return ret;
    }

    @Override //1.2
    public Retorno crearAerolinea(String nombre, String pais, int cantMaxAviones) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        nodoAerolinea aerolinea = this.la.obtenerElemento(nombre);

        if (aerolinea != null) {

            ret = new Retorno(Retorno.Resultado.ERROR_1);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Ya existe una aerolinea con dicho nombre ");

        } else if (cantMaxAviones <= 0) {

            ret = new Retorno(Retorno.Resultado.ERROR_2);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: La cantidad maxima debe ser un numero mayor o igual a 0");

        } else {
            this.la.agregarFinal(nombre, pais, cantMaxAviones);

            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Se pudo registrar aerolinea correctamente");
        }

        return ret;

    }

    @Override //1.3
    public Retorno eliminarAerolinea(String nombre) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        nodoAerolinea aerolinea = la.obtenerElemento(nombre);
        boolean encontrado = false;

        if (aerolinea == null) {
            ret = new Retorno(Retorno.Resultado.ERROR_1);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe una aerolinea con ese nombre. ");

        } else {
            nodoAvion aux = la.LisAvionesDeAerolinea.primero;
            while (aux != null) {
                if (aux.nomAerolinea.equals(nombre)) {
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }

            if (encontrado) {
                ret = new Retorno(Retorno.Resultado.ERROR_2);
                System.out.println("Resultado: " + ret.resultado + ", Mensaje: No se puede eliminar, aviones registrados.");
            } else {

                System.out.println("Resultado: " + ret.resultado + ", Mensaje: Se puedo eliminar el aerolinea");
                this.la.eliminarElemento(nombre);

            }
        }

        return ret;
    }

 @Override //1.4
    public Retorno registrarAvion(String codigo, int capacidadMax, String nomAerolinea) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        nodoAvion avion = la.LisAvionesDeAerolinea.obtenerElemento(codigo);
        
        nodoAerolinea aerolinea = la.obtenerElemento(nomAerolinea);
        
     
        

        if (avion != null) {

            ret = new Retorno(Retorno.Resultado.ERROR_1);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Ya existe un avion con ese codigo ");

        } else if (capacidadMax < 9 || !(capacidadMax % 3 == 0)) {

            ret = new Retorno(Retorno.Resultado.ERROR_2);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: La capacidad maxima debe ser mayor a 9 y multiplo de 3");

        } else if (!la.existeElemento(nomAerolinea)) {

            ret = new Retorno(Retorno.Resultado.ERROR_3);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe una aerolinea con ese nombre");
            
//        } else if (aerolinea.cantMaxAviones == la.getContadornodos()) {
//            
//            ret = new Retorno(Retorno.Resultado.ERROR_4);
//            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Ya llego a la cantidad maxima de aviones");

        } else {

            this.la.LisAvionesDeAerolinea.agregarFinal(codigo, capacidadMax, nomAerolinea);

            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Se puedo agregar avion correctamente");
        }

        return ret;

    }

    @Override //1.5
    public Retorno eliminarAvion(String nomAerolinea, String codAvion) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        nodoAvion avionExiste = this.la.LisAvionesDeAerolinea.obtenerElemento(codAvion);
        boolean codigoAvionExiste = false;

        if (!la.existeElemento(nomAerolinea)) {

            ret = new Retorno(Retorno.Resultado.ERROR_1);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe una aerolinea con ese nombre");

        } else {

            nodoAvion aux = la.LisAvionesDeAerolinea.primero;
            while (aux != null) {
                if (aux.codigo.equals(codAvion)) {

                    codigoAvionExiste = true;
                }
                aux = aux.getSiguiente();
            }

            if (!codigoAvionExiste) {
                ret = new Retorno(Retorno.Resultado.ERROR_2);
                System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe codigo avion en la aerolinea");
            } else {

                System.out.println("Resultado: " + ret.resultado + ", Mensaje: Se puedo eliminar el avion");
                this.la.LisAvionesDeAerolinea.eliminarElemento(codAvion);

            }

        }

        return ret;

    }

    @Override //1.6
    public Retorno registrarCliente(String pasaporte, String nombre, int edad) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        
        if(edad < 0){
            ret = new Retorno(Retorno.Resultado.ERROR_1);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: La edad no puede ser menor a 0");
        
        } else if (pasaporte.length() != 7){
            ret = new Retorno(Retorno.Resultado.ERROR_2);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: El pasaporte debe tener 7 caracteres exactamente");
        
        } else if (Lcli.existeElemento(pasaporte)){
            ret = new Retorno(Retorno.Resultado.ERROR_3);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Ya existe un cliente con ese pasaporte");
        
        } else {
             Lcli.agregarFinal(pasaporte, nombre, edad);
             System.out.println("Resultado: " + ret.resultado + ", Mensaje: Se pudo registrar cliente correctamente");
        }
            
        return ret;
    }

     //1.7
    @Override
    public Retorno crearVuelo(String codigoVuelo, String aerolinea, String codAvion, String paisDestino, int dia, int mes, int año, int cantPasajesEcon, int cantPasajesPClase) {
        
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        
        boolean vueloEncontrado = la.LisAvionesDeAerolinea.LisVuelosDeAvion.existeElemento(codigoVuelo);
        
        boolean aerloinaEncontrada = la.existeElemento(aerolinea);
       
        boolean encontradoAvion = la.LisAvionesDeAerolinea.existeElemento(codAvion);
        
        nodoAvion nodoAvion = la.LisAvionesDeAerolinea.obtenerElemento(codAvion);
        
        boolean existeVueloFecha = la.LisAvionesDeAerolinea.LisVuelosDeAvion.fechaDeVuelo(dia,mes,año);

        int cantidadTotal = cantPasajesEcon + cantPasajesPClase;
        
        if(vueloEncontrado){
         
         ret = new Retorno(Retorno.Resultado.ERROR_1);
         System.out.println("Resultado: " + ret.resultado + ", Mensaje: Ya exite este vuelo en el sistema");
         
        } else if(!aerloinaEncontrada) {
        
         ret = new Retorno(Retorno.Resultado.ERROR_2);
         System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe aerolinea en el sistema ");
            
        } else if (!encontradoAvion) {
            
        ret = new Retorno(Retorno.Resultado.ERROR_3);
        System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe el codigo de avion en la aerolinea");
            
        }else if (cantPasajesEcon % 3 != 0 || cantPasajesPClase % 3 != 0){
            
        ret = new Retorno(Retorno.Resultado.ERROR_5);
        System.out.println("Resultado: " + ret.resultado + ", Mensaje: La cantidad de pasajeros debe ser multiplo de 3");
            
        } else if (cantidadTotal > nodoAvion.capacidadMax) {   
        ret = new Retorno(Retorno.Resultado.ERROR_6);
        
        System.out.println("Resultado: " + ret.resultado + ", Mensaje: Supero la cantidad maxima permitida");
      
        
        } else if (existeVueloFecha) {
            ret = new Retorno(Retorno.Resultado.ERROR_4);
            
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Ya existe un vuelo para esa fecha");
        
        } else {
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Se agrego el vuelo correctamente");
            la.LisAvionesDeAerolinea.LisVuelosDeAvion.agregarInicio(codigoVuelo,aerolinea,codAvion,paisDestino,dia,mes,año,cantPasajesEcon,cantPasajesPClase);
            
        }
        
        
        return ret;
    }
    ///1.8
    @Override
    public Retorno comprarPasaje(String pasaporteCliente, String codigoVuelo, int categoríaPasaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        
      nodoCliente nodoClienteEncontrado = Lcli.obtenerElemento(pasaporteCliente);
      nodoVuelo nodoVueloEncontrado = la.LisAvionesDeAerolinea.LisVuelosDeAvion.obtenerElemento(codigoVuelo);
      
        
        if(nodoClienteEncontrado == null){
            ret = new Retorno(Retorno.Resultado.ERROR_1);
            
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: El pasaporte del cliente no existe");
        
        } else if(nodoVueloEncontrado == null){
               ret = new Retorno(Retorno.Resultado.ERROR_2);
            
               System.out.println("Resultado: " + ret.resultado + ", Mensaje: El codigo de vuelo no existe");
        
        } else if(nodoVueloEncontrado.cantPasajesEco == 0 || nodoVueloEncontrado.cantPasajesPClase == 0){
                
                ret = new Retorno(Retorno.Resultado.ERROR_3);
        
                System.out.println("Resultado: " + ret.resultado + ", Mensaje: No hay disponibilidad para la categoria" + categoríaPasaje);
                
        }   else {

            if(categoríaPasaje == 1 ){
                nodoVueloEncontrado.cantPasajesEco--;
            } else if(categoríaPasaje == 2){
                nodoVueloEncontrado.cantPasajesPClase--;
            }
            
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: Pasaje comprado correctamente");
             
            la.LisAvionesDeAerolinea.LisVuelosDeAvion.ListaPasajesVuelo.agregarInicio(pasaporteCliente, codigoVuelo, categoríaPasaje);
            
            
        }
        
        return ret;
    }
    
     //1.9
    @Override
    public Retorno devolverPasaje(String pasaporteCliente, String codigoVuelo) {
      
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        
        nodoVuelo nodoAuxVuelo = la.LisAvionesDeAerolinea.LisVuelosDeAvion.obtenerElemento(codigoVuelo);
        boolean existePasaporte = Lcli.existeElemento(pasaporteCliente);
        nodoPasaje nodoAuxPasaje = la.LisAvionesDeAerolinea.LisVuelosDeAvion.ListaPasajesVuelo.obtenerElemento(pasaporteCliente);
        boolean existeCompra = la.LisAvionesDeAerolinea.LisVuelosDeAvion.ListaPasajesVuelo.existeElemento(pasaporteCliente, codigoVuelo);
        
        if(!existePasaporte){
            ret = new Retorno(Retorno.Resultado.ERROR_1);
            
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe el pasaporte del cliente ");
        
        } else if (nodoAuxVuelo == null){
            ret = new Retorno(Retorno.Resultado.ERROR_2);
            
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe el codigo de vuelo ");
        
        } else if (!existeCompra) {
            ret = new Retorno(Retorno.Resultado.ERROR_3);
            
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe una compra de dicho vuelo  ");
        
        } else {
            
              if(nodoAuxPasaje.categoriaPasaje == 1 ){
                nodoAuxVuelo.cantPasajesEco++;
            } else if(nodoAuxPasaje.categoriaPasaje == 2){
                nodoAuxVuelo.cantPasajesPClase++;
            }
            
                System.out.println("Resultado: " + ret.resultado + ", Mensaje: Pasaje Devuelto correctamente ");
                la.LisAvionesDeAerolinea.LisVuelosDeAvion.ListaPasajesVuelo.devolverPasaje(pasaporteCliente, codigoVuelo);
        
        }
        
        return ret ;
    }

    @Override //2.1
    public Retorno listarAerolineas() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        this.la.mostrar();
        return ret;
    }

    @Override //2.2
    public Retorno listarAvionesDeAerolinea(String nombre) {

        Retorno ret = new Retorno(Retorno.Resultado.OK);

        nodoAerolinea encontrado = la.obtenerElemento(nombre);

        ListaAvion listaAvionesAerolinea = la.LisAvionesDeAerolinea;

        nodoAvion unAvion = listaAvionesAerolinea.getPrimero();

        if (encontrado == null) {

            ret = new Retorno(Retorno.Resultado.ERROR_1);
            System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe codigo avion en la aerolinea" + " " + nombre);

        } else {

            while (unAvion != null) {

                if (unAvion.nomAerolinea.equals(nombre)) {

                    System.out.println(unAvion.toString() + "-" + nombre);
                }
                unAvion = unAvion.getSiguiente();
            }

        }

        return ret;
    }
    
    //2.3
    @Override
    public Retorno listarClientes() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        
        String listaClient = this.Lcli.mostrar(this.Lcli.getPrimero(), this.Lcli.getUltimo());
           
        System.out.print(listaClient);
        
        return ret;
        
        }

    ///2.4
    @Override
    public Retorno listarVuelos() {
        Retorno ret = new Retorno(Retorno.Resultado.OK); 
            

        nodoVuelo nodoVuelo = la.LisAvionesDeAerolinea.LisVuelosDeAvion.getPrimero();
        
        while(nodoVuelo != null){

                
            System.out.print(nodoVuelo.toString() + "\n");
            
            nodoVuelo = nodoVuelo.getSiguiente();
 
        }
        
        return ret;
    }

    @Override
    public Retorno vuelosDeCliente(String pasaporte) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    
    //2.6
    @Override
    public Retorno pasajesDevueltos(String nombreAerolinea) {
        
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        boolean existeAerolinea = la.existeElemento(nombreAerolinea);
        
        if(!existeAerolinea){
          ret = new Retorno(Retorno.Resultado.ERROR_1);
          System.out.println("Resultado: " + ret.resultado + ", Mensaje: No existe la aerolinea" + " " + nombreAerolinea);
        
        }else {
               System.out.println("Resultado: " + ret.resultado + ", Mensaje:" + "\n" + nombreAerolinea);
               la.LisAvionesDeAerolinea.LisVuelosDeAvion.mostrarPasajesDevueltos(nombreAerolinea);
        
        }
        
        
        return ret;
    }

    @Override
    public Retorno vistaDeVuelo(String codigoVuelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
