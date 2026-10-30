import java.util.Scanner;
public class Ejercicio_Pilas {

    public static void main(String[] args) {
        //System.out.println("hello world"); 
        Scanner teclado = new Scanner(System.in); 
        int []pila = new int [5]; 
        int tope = -1; 
        int opcion; 
        do { 
            System.out.println("PIlA CON ARREGLOS");
            System.out.println("1. agregar numero a la pila ");
            System.out.println("2. retirar un numero a la pila");
            System.out.println("3. mostrar la pila");
            System.out.println("4. mostrar el tope "); 
            System.out.println("5. SALIR");
            System.out.println("6. OPCION");

            opcion = teclado.nextInt();

            switch(opcion){

                case 1:
                    if(tope == pila.length-1){
                          System.out.println("hey brow la pila esta llena");
                    }else{
                        System.out.println("Agrega un elemento a la pila");
                        int numero = teclado.nextInt(); 
                        tope++; 
                        pila[tope] = numero;
                    }
                    break; 
                
                case 2:
                    if (tope == -1){ 
                        System.out.println("hey bro la pila esta vacia loco se serio "); 
                    }else{
                        System.out.println("retirar"+ pila[tope]);
                        tope--;
                    }
                    break;

                case 3: 
                    if (tope == -1){ 
                        System.out.println("hey bro la pila esta vacia loco se serio "); 
                    }else{
                        System.out.println("los elementos de la pila son: ");
                        for(int i = tope; i>=0; i--){
                            System.out.println("PILA " + pila[i]);
                        }
                    }
                    break;

                case 4:
                    if (tope == -1){
                        System.out.println("hey bro la pila esta vacia loco se serio ");
                    }else{
                        System.out.println("el tope de la pila es: " + pila[tope]);
                    }
                    break;

                case 5:
                    System.out.println("salir");
                    break;
                    default:
                    System.out.println("opcion no valida");
            }
            
        }while(opcion != 5);
        teclado.close();
    }
}
