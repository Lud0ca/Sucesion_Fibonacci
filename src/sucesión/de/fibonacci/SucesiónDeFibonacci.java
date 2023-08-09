package sucesión.de.fibonacci;

public class SucesiónDeFibonacci {

    public static void main(String[] args) {
        int cantidad =2;
        long resultado=0, a=0,b=1,c;
        long array[] =new long[50];
        array[0] =a;
        array[1] =b;
        while(cantidad<50){
            array[cantidad]=resultado=a+b;
            a=b;
            b=resultado;
            cantidad++;
        }
        for(int q=0;q<50;q++){
            System.out.println("Posicion: "+(q+1)+" valor "+array[q]);
            
        }
    }
    
}
