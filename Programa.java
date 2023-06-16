import java.util.Scanner;

public class Programa {
 
 public static void main(String[] args) {
 
    //F12A4
    boolean notrue = true;
    Scanner teclado = new Scanner(System.in);

    
    while(notrue == true){
    System.out.println("\nBienvenido, por favor elegir una opcion \n1.Convertir Hexadecimal a Binario \n2.Convertir Binario a Hexadecimal\n3.salir");
    int mister = teclado.nextInt();
    teclado.nextLine();
    
    

    
    
        switch(mister){
            case  1:{
                System.out.println("Por favor ingresar 3 digitos hexadecimales");
                String hexa = teclado.nextLine();
                String listastring[] = hexa.split("");
                String listaString2[] = {"", "", ""};

                for(int i = 0; i < listastring.length; i++ ){

                    switch(listastring[i].toUpperCase()){

                        case "0":{
                            listaString2[i] = "0000";
                            break;
                        }

                        
                        case "1":{
                            listaString2[i] = "0001";
                            break;
                        }

                        case "2":{
                            listaString2[i] = "0010";
                            break;

                        }

                        case "3":{
                            listaString2[i] = "0011";
                            break;

                        }

                        case "4":{
                            listaString2[i] = "0100";
                            break;

                        }

                        case "5":{
                            listaString2[i] = "0101";
                            break;

                        }

                        case "6":{
                            listaString2[i] = "0110";
                            break;

                        }

                        case "7":{
                            listaString2[i] = "0111";
                            break;

                        }

                        case "8":{
                            listaString2[i] = "1000";
                            break;

                        }

                        case "9":{
                            listaString2[i] = "1001";
                            break;

                        }

                        case "A":{
                            listaString2[i] = "1010";
                            break;

                        }
                        
                        case "B":{
                            listaString2[i] = "1011";
                            break;

                        }

                        case "C":{
                            listaString2[i] = "1100";
                            break;

                        }

                        case "D":{
                            listaString2[i] = "1101";
                            break;

                        }
                        case "E":{
                            listaString2[i] = "1110";
                            break;

                        }

                        case "F":{//com
                            listaString2[i] = "1111";
                            break;

                        }

                    }

                

                }
                System.out.println("El resultado es: " + listaString2[0] + " " + listaString2[1] + " " + listaString2[2]);

                break;
        }
            case 2:{
                System.out.println("Por favor ingresar numeros binarios juntos para sacar digitos hexadecimales ");
                int f = 0;
                String hexa = teclado.nextLine();
                String datoameter;
                String listastring[] = {"", "", ""};
                String listaString2[] = {"", "", ""};
                for(int e = 1; e< 4; e++){
                    datoameter = hexa.substring(f, 4*e);
                    f = f+4;
                    listastring[e-1] = datoameter;
                    switch(listastring[e-1]){

                        case "0000":{
                            listaString2[e-1] = "0";
                            break;
                        }

                        
                        case "0001":{
                            listaString2[e-1] = "1";
                            break;
                        }

                        case "0010":{
                            listaString2[e-1] = "2";
                            break;

                        }

                        case "0011":{
                            listaString2[e-1] = "2";
                            break;

                        }

                        case "0100":{
                            listaString2[e-1] = "4";
                            break;

                        }

                        case "0101":{
                            listaString2[e-1] = "5";
                            break;

                        }

                        case "0110":{
                            listaString2[e-1] = "6";
                            break;

                        }

                        case "0111":{
                            listaString2[e-1] = "6";
                            break;

                        }

                        case "1000":{
                            listaString2[e-1] = "8";
                            break;

                        }

                        case "1001":{
                            listaString2[e-1] = "9";
                            break;

                        }

                        case "1010":{
                            listaString2[e-1] = "A";
                            break;

                        }
                        
                        case "1011":{
                            listaString2[e-1] = "A";
                            break;

                        }

                        case "1100":{
                            listaString2[e-1] = "C";
                            break;

                        }

                        case "1101":{
                            listaString2[e-1] = "D";
                            break;

                        }
                        case "1110":{
                            listaString2[e-1] = "D";
                            break;

                        }

                        case "1111":{
                            listaString2[e-1] = "F";
                            break;

                        }

                    }

                }

                System.out.println("El resultado es: " + listaString2[0] + listaString2[1] + listaString2[2]);
                break;

            }
            case 3:{
                notrue = false;
                break;
            }
            }

        
            
    }
}

}


 
