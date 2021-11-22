/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimales;


public class Decimales {

    public String conversorFraccion(Double numero){
        //Cadena que almacena la fraccion
        String fraccion = "";
        //Convierte el double en un cadena para analizarla
        String numeroString = numero.toString();
        //Contador para ver cuantos decimales tiene
        int contadorDecimales = 0;
        //Bandera que indica si encontro un punto en la cadena
        boolean punto = false;
        for(int a = 0;a < numeroString.length();a++){
                //Si punto es true aumenta el contador
                if(punto){
                    //Aumentamos el contador
                    contadorDecimales++;
                }else if(numeroString.charAt(a) == '.'){
                    //Ponemos true porque encontramos un punto
                    punto = true;
                }
        }
        //Variable que guarda el multiplicador.               
        int multiplicador = potencia(10,contadorDecimales);
        //Calculamos el numerador multiplicando por el decimal original.
        double numerador = multiplicador * numero;
        //Y el denominador seria el multiplicador calculado antes.
        int denominador = multiplicador;
        
        //Mostramos los resultados
        fraccion =  "Numerador:   " + numerador + "\n";
        fraccion +=  "             -------\n";
        fraccion += "Denominador: " + denominador + "\n";
        return fraccion;
    }
    
    public int potencia(int numeroElevar,int elevacion){
        //Numero que queremos elevar
        int numero = numeroElevar;
        //Contador para ver cuantas veces se multiplica el mismo.
        int contador = 1;
        while(contador < elevacion){
            //Se multiplica el mismo y aumenta el contador
            numero = numeroElevar * numero;
            contador++;
        }
        return numero;
    }
    
   
    
    
    public static void main(String[] args) {
        Decimales decimal = new Decimales();
        String numeroDecimal = decimal.conversorFraccion(0.5873);
        System.out.println(numeroDecimal);

    }
    
}
