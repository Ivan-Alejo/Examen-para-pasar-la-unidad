public class Arreglo {

    public static void main(String[] args) {


        int[] b={86,-96,30,0,-4,};
        Arreglo y=new Arreglo();
        y.complicado(b);

        System.out.println();

       int[] a={2,5,6,-78,9,0,66,-5,63,1000,-88888,1};
       Arreglo x=new Arreglo();
       x.cualquiera(a);

       System.out.println();


       /* int[] c={89,56,-5,6,0,};
        Arreglo z =new Arreglo();
        z.recurisividad(c, c.length);*/


    }

    public void complicado(int[] n){

        //este bloque compara los 5 elemementos del array y si se cumple la condicion le asigna el valor, en este caso en el lugar n[0] se le asigna el valor ma chico
        // y en el lugar n[4] si se cumple la condicion se  le pone el valor mas alto
        if (n[0] < n[1]) { n[0] += n[1];  n[1] = n[0] - n[1];  n[0] -= n[1]; }
        else{}
        if (n[0] < n[2]) { n[0] += n[2];  n[2] = n[0] -n[2];  n[0] -= n[2]; }
        else{}
        if (n[0] < n[3]) { n[0] += n[3];  n[3] = n[0] - n[3];  n[0] -= n[3]; }
        else{}
        if (n[0] < n[4]) { n[0] += n[4];  n[4] = n[0] - n[4];  n[0] -= n[4]; }
        else{}

        if (n[1] < n[2]) { n[1] += n[2];  n[2] = n[1] - n[2];  n[1] -= n[2]; }
        else{}
        if (n[1] < n[3]) { n[1] += n[3];  n[3]= n[1] - n[3];  n[1] -= n[3]; }
        else{}
        if (n[1] < n[4]) { n[1] += n[4];  n[4] = n[1] - n[4];  n[1]-= n[4]; }
        else{}

        if (n[2]< n[3]) { n[2] += n[3];  n[3] = n[2] - n[3];  n[2] -= n[3]; }
        else {}
        if (n[2] < n[4]) {n[2]+= n[4];  n[4] = n[2] - n[4];  n[2] -= n[4]; }
        else {}

        if (n[3] < n[4]) { n[3] += n[4];  n[4] = n[3] - n[4];  n[3] -= n[4]; }
        else{}

        System.out.print("["+n[4]+"]"+" "+"["+n[3]+"]"+" "+"["+n[2]+"]"+" "+"["+n[1]+"]"+" "+"["+n[0]+"]"+" ");


    }

    public void cualquiera(int[] n){
       //aqui utilize dos ciclos if para comparar los elementso del array que ambos empiezan en 0 y terminan dependiendo los elementos del array con .length; y aumentan de uno a la vez
        int b;//utilice este variable para almacenar n[i] y despues n[j]
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i] < n[j]) {
                    b = n[i];
                    n[i] = n[j];
                    n[j] = b; } } }

       for(int i=0; i<n.length; i++){
            System.out.print("["+n[i]+"]"+" ");
       }

    }
// no puede decir la recursividad profe :(
   /*public void recurisividad(int[] n){
        int aux;
        if(n<1){
            for (int j = 0; j < n.length; j++) {
                if (n[j] < n[j+1]) {
                    aux = n[j];
                    n[j] = n[j+1];
                    n[j+1] = aux; } }

                    recurisividad(n,n-1);


            }*/



    }





























