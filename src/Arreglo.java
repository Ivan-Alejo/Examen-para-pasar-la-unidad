public class Arreglo {

    public static void main(String[] args) {


        Arreglo x = new Arreglo();
        x.cualquiera( new int []{5,5,9,6,3, 5,5,6,3,4,-500});


       for (int i = 0; i <0 ; i++) {
           System.out.println();
       }


    }


    public static int[] cualquiera(int []n){
        int b;


        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i] < n[j]) {
                    b = n[i];
                    n[i] = n[j];
                    n[j] = b;
                }
            }
        }


        return n;
    }

}

























