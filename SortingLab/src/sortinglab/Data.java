/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortinglab;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class Data {
    int info[];
    int capacity;
    int size;
    
    public Data(){
        this(100);
    }
    public Data(int c){
        capacity = c;
        info = new int[capacity];
        size = 0;
    }
    public int addNewInfo(int newInfo){
        info[size] = newInfo;
        size++;
        return size;
    }
    public int clone(Data d){
        size = 0;
        for(int i = 0; i < d.size; i++){
            info[i] = d.info[i];
            size++;
        }
        return size;
    }
    public void swap(int index1,int index2){
        int temp = info[index1];
        info[index1] = info[index2];
        info[index2] = temp;
    }
    public void selectionSort(){
        for (int i = 0; i < size; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < size; j++) {
                if(info[j] < info[smallestIndex]){
                    smallestIndex = j;
                }
            }
            swap(i,smallestIndex);
        }
    }
    public void insertionSort(){
        // 5, 23, 44, 55, 16
        //                55
        //            44, 55
        //        23, 44, 55
        //    16, 23, 44, 55
        // 5, 16, 23, 44, 55
        for (int i = 0; i < size; i++) {
            int valueAti = info[i];
            int j;
            for (j = i-1; j >= 0 && info[j] > valueAti; j--) {
                info[j + 1] = info[j];
            }
            info[j + 1] = valueAti;
        }
    }
    public void bubbleSort(){
        //50           8
        //8         8 50
        //25    10 10 10
        //30 10 25 25 25
        //10 30 30 30 30
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if(info[j - 1] > info[j]){
                    swap(j-1, j);
                }
            }
        }
    }
    public void quickSort(int first, int last){
        if(first >= last){
            return; // anchor for the recursion
        }
        //partition
        int pivot = info[first];
        int lower = first + 1;
        int upper = last;
        while(lower <= upper){
            while(lower <= last && info[lower]<pivot){
                lower++;//search info that is bigger than pivot
            }
            while(upper > first && info[upper] >= pivot){
                upper--;//search info that is smaller than pivot
            }
            if(lower < upper){
                swap(lower, upper);
                lower++;
                upper--;    
            }
        }
        swap(first, upper);
        quickSort(first, upper - 1);
        quickSort(upper + 1, last);
    }
    
    public void radixSort(){
        int radix = 10;
        int digits = 4;
        Queue<Integer> [] q = new Queue[10];
        for(int i = 0; i < radix; i++){
            q[i] = new LinkedList<>();
        }
        //4512: 2 <= (4512/1)%10
        //4512: 1 <= (4512/10)%10
        //4512: 5 <= (4512/100)%10
        //4512: 4 <= (4512/1000)%10
        int factor = 1;
        //pass
        for(int i = 0; i <= digits; factor *= 10, i++){
            // add each number into the correct queue
            for(int j = 0; j < size; j++){
                q[(info[j]/factor) % 10].add(info[j]);
            }
            //dequeue data back to og info array
            for (int j = 0, k = 0; j < radix; j++){
                while( !q[j].isEmpty()){
                    info[k] = q[j].remove(); //dequeue
                    k++;
                }
            }
        }
    }
    
    public void mergeSort(int first, int last){
        if(first < last){
            int mid = (first+last)/2;
            mergeSort(first,mid);
            mergeSort(mid+1, last);
            merge(first,last);
        }
    }
    
    public void merge(int first, int last){
        int[] result = new int[last - first + 1];
        int mid = (first+last)/2;
        int left = first, right = mid+1;
        int kAtResult = 0;
        while(left <= mid && right <= last){
            if(info[left]<info[right]){
                result[kAtResult++] = info[left++];
            }else{
                result[kAtResult++] = info[right++];
            }
        }
        while(left<=mid){
            // we have info at left remains in the left array
            result[kAtResult++] = info[left++];
        }
        while(right <= last){
            result[kAtResult++] = info[right++];
        }
        for(int i = 0; i < last-first+1; i++){
            info[first + i] = result[i];
        }
    }
    
    public void shellSort(){
        for(int shell = 5; shell >=1 ; shell -= 2){
            for(int j = 0; j < shell; j++){
                insertionSort4ShellSort(j, shell);
            }
        }
    }
    
    public void insertionSort4ShellSort(int first, int shell){
        for (int i = first; i < size; i+=shell) {
            int valueAti = info[i];
            int j;
            for (j = i-shell; j >= 0 && info[j] > valueAti; j-=shell) {
                info[j + shell] = info[j];
            }
            info[j + shell] = valueAti;
        }
    }
    
    public void printAll(){
        for (int i = 0; i < size; i++) {
            System.out.print(info[i] + " ");
        }
        System.out.println("");
    }
}
