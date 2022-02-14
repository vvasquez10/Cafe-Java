public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = " tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCapuchino = 4.2;
        double precioCafeFiltro = 3.2;
        double precioCafeConLeche = 4.9;

    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = false;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = false;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        System.out.println(cliente1 + mensajePendiente);
        estaListoOrden1 = true;
        System.out.println(cliente1 + mensajeListo);
        System.out.println(cliente1 + mensajeMostrarTotal + precioMocha);
        

        System.out.println(saludoGeneral + cliente2); // Muestra "Bienvenido a Café Java, Sam"
        if (estaListoOrden1){
            System.out.println(cliente2 + mensajeListo);
            System.out.println(cliente2 + mensajeMostrarTotal + precioCafeConLeche*2);
        } else {
            System.out.println(cliente2 + mensajePendiente);

        }        

        System.out.println(saludoGeneral + cliente4); // Muestra "Bienvenido a Café Java, Noah"
        System.out.println(cliente4 + mensajePendiente);
        estaListoOrden1 = true;
        System.out.println(cliente4 + mensajeListo);
        System.out.println(cliente4 + mensajeMostrarTotal + precioCapuchino);

        System.out.println(cliente3 + mensajeMostrarTotal + Math.round((precioCafeConLeche-precioMocha)*100.0)/100.0);
    }
}