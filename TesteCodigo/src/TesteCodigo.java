import java.util.Scanner;

    class Programa {
        public static void main (String[]args){
            int n, c, d, swap;
            Scanner in = new Scanner(System.in);
            System.out.println("Entre a quantidade de numeros inteiros a processar= ");
            n= in.nextInt();
            int[] array = new int[5];
            for (c=0;c<5;c++){
                array[c]= c+1;
            }
            System.out.println("Entre "+n+" valores inteiros");
            for(c=0;c<(n-1);c++){
                for(d=0;d<n-c-1;d++){
                    if(array[d] > array[d+1])
                    {
                        swap=array[d];
                        array[d]=array[d+1];
                        array[d+1]=swap;
                    }
                }
            }
            System.out.println("resultado");
            for(c=0;c<n;c++)
                System.out.println(array[c]);
        }
    }
