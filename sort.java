/*  Ejercicio 1.  Implementa el método selectionSortDescendingOrder moviendo el elemento más pequeño hacia el final (en lugar del más grande). 10 minutos.
    Ejercicio 2.  Implementa el método selectionSortAlternativeVersion buscando el elemento más pequeño y colocándolo a la izquierda (al principio del array) . 10 minutos. */

public class sort{
    public static void swap(int [] lista, int indice, int numero){
        int resguardo=lista[indice];
        lista[indice]=lista[numero];
        lista[numero]=resguardo;
    }

    static void type(int [] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    /*for(int i = 0; i < n-1 ; i++){
        int minimo = i;
        for(int j = i + 1 ; j < n ; j++){
                if(lista[j] < lista[minimo]){
                    minimo = j;
                }
        }
        intercambiar(lista , i , minimo);
    } */

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            swap(arr, i, minIndex);
        }
    }

    public static void selectionSortDescendingOrder(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int maxIndex = i;
            for (int j=i; j<n;j++)
                if (arr[j] > arr[maxIndex])
                    maxIndex=j;
            swap(arr, maxIndex, i);
        }
    }

    public static void selectionSortAlternativeVersion(int[] arr){
        int n = arr.length-1;
        for (int i = n; i > -1; i--){
            int minIndex = i;
            for (int j = i; j > n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex=j;
            swap(arr, minIndex, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 4, 1, 9, 2, 10};
        int[] arr2 = arr;
        int[] arr3 = arr;

        type(arr);

        selectionSort(arr);
        type(arr);

        selectionSortDescendingOrder(arr2);
        type(arr2);

        selectionSortAlternativeVersion(arr3);
        type(arr3);
    }
}