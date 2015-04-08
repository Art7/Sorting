package main;

/**
 * Created by Artur on 08.04.2015.
 */
public class Sort {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min, i, j, cur_ind;
        for(i = 0; i < 10; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int ind = 0; ind < array.length; ind++){
            min =  array[ind];
            cur_ind = ind;
            for(j = ind; j < array.length; j++) {
                if(array[j] <= min){
                    min = array[j];
                    cur_ind = j;
                }
            }
            array[cur_ind] = array[ind];
            array[ind] = min;
            System.out.print(array[ind] + " ");
        }
    }
}
