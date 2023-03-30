package sorting;

public class MergeSort {

    public static void main(String[] args){

        int[] input = new int[]{1,3,4,10,2,6,9,5,11,-1};

        sort(input,0, input.length-1);

        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }

    public static void sort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int mid = (left+right)/2;

        sort(arr, left, mid);
        sort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){

        int n1 = mid-left+1;
        int n2 = right -mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for(int i= 0;i<n1;i++){
            l[i] = arr[left+i];
        }

        for(int i=0; i<n2;i++){
            r[i] = arr[mid+1+i];
        }
        int k = left;
        int i=0;
        int j=0;


        while(n1>0 && n2>0){
            if(l[i]> r[j]){
                arr[k++] = r[j++];
                n2--;
            }
            else {
                arr[k++] = l[i++];
                n1--;
            }
        }

        while(n1>0){
            arr[k++] = l[i++];
            n1--;
        }

        while(n2>0){
            arr[k++] = r[j++];
            n2--;
        }

    }
}
