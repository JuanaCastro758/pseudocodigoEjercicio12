import java.util.*;
public class Ejercicio12{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int part=1;
        float h=1,e, sAltura1=0,cAltura1=0,sAltura2=0,cAltura2=0;
        float sEdad=0, cEdad=0; 
        String s;

        while (h>0 ){
            System.out.println("Ingresar altura "+part);
            h=scanner.nextInt();
            System.out.println("Ingresr edad"+part);
            e=scanner.nextInt();
            System.out.println("Ingresar sexo (F 0 M) "+part);
            s=scanner.nextLine();
            if (s=="F" && h>0){
                sAltura1+=h;
                cAltura1++;
            }
            if (s=="M" && h>0){
                sAltura2+=h;
                cAltura2++;
            }
            if (h>0){
                sEdad+=e;
                cEdad++;
            }
        }
        float p1=sAltura1/cAltura1;
        float p2=sAltura2/cAltura2;
        float p3=sEdad/cEdad;
        System.out.println("a. promedio de altura de las mujeres: "+p1);
        System.out.println("b. promedio de altura de los varones: "+p2);
        System.out.println("c. promedio de edad de los participantes: "+p3);
        part++;
    } 

}