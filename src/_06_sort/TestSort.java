package _06_sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 * Created by linmanyun on 2021/11/8 下午8:51.
 */
public class TestSort {

    public static void main(String[] args) {
        bubbling(getArr(10000));
        insertSort(getArr(10000));
        mergeSort(getArr(10000));
        quickSort(getArr(10000));
    }

    private static int[] getArr(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    private static void bubbling(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("cost:" + (System.currentTimeMillis() - start) + "ms,bubbling:" + Arrays.toString(arr));
    }


    private static void insertSort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j=i;
            for (; j > 0; j--) {
                if(tmp < arr[j-1]) {
                    arr[j] = arr[j-1];
                } else {
                    break;
                }
            }
            arr[j] = tmp;
        }
        System.out.println("cost:" + (System.currentTimeMillis() - start) + "ms,insertSort:" + Arrays.toString(arr));
    }


    private static void mergeSort(int[] arr) {
        long start = System.currentTimeMillis();
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("cost:" + (System.currentTimeMillis() - start) + "ms,mergeSort:" + Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }
        int mid = (startIndex + endIndex) / 2;
        mergeSort(arr, startIndex, mid);
        mergeSort(arr, mid+1, endIndex);
        combine(arr, startIndex, mid, endIndex);
    }

    private static void combine(int[] arr, int startIndex, int mid, int endIndex) {
        int[] tempArr = new int[endIndex - startIndex + 1];
        int i = startIndex, j = mid + 1, k = 0;
        while (i <= mid && j <= endIndex) {
            if (arr[i] < arr[j]) {
                tempArr[k++] = arr[i++];
            } else {
                tempArr[k++] = arr[j++];
            }
        }
        int start = i <= mid ? i : j;
        int end = i <= mid ? mid : endIndex;
        while (start <= end) {
            tempArr[k++] = arr[start++];
        }
        for (int m = 0; m < tempArr.length; m++) {
            arr[startIndex++] = tempArr[m];
        }
    }

    private static void quickSort(int[] arr) {
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("cost:" + (System.currentTimeMillis() - start) + "ms,quickSort:" + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivot = getPivot(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivot - 1);
        quickSort(arr, pivot + 1, endIndex);
    }

    private static int getPivot(int[] arr, int startIndex, int endIndex) {
        int i = startIndex, j = startIndex;
        int value = arr[endIndex];
        for(;j<endIndex;j++) {
            if(arr[j]<value){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, endIndex);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}


