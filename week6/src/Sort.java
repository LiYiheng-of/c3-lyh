import java.util.ArrayList;

public class Sort {
    void swap(int []array,int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public void BoobSort(int[] array) {
        System.out.println("Before:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");


        for (int i = 0; i < array.length - 1; i++)
            for (int j = 1; j < array.length - i; j++)
                if (array[j - 1] > array[j]) {
                    swap(array,j-1,j);
                }


        System.out.println("\nAfter:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public void InsertSort(int array[])
    {
        System.out.println("Before:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        for(int i=1;i<array.length;i++)
        {
            if(array[i]<array[i-1])
            {
                int temp=array[i];
                int j;
                for(j=i-1;array[j]>temp&&j>=0;j--)
                    array[j+1]=array[j];
                 array[j+1]=temp;
            }
        }

        System.out.println("\nAfter:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
    int Partition(int[] arr,int low,int high)
    {
        high--;
        int temp=arr[low];
        int i=low,j=high;
        while (i!=j)
        {
            while (i<j&&temp<=arr[j]) j--;
            while (i<j&&arr[i]<=j) i++;
            if(i<j) swap(arr,i,j);
        }
        arr[low]=arr[i];
        arr[i]=temp;
        return i;
    }
    void  Qsort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int mid=Partition(arr,low,high);
            Qsort(arr,low,mid-1);
            Qsort(arr,mid+1,high);
        }
    }
    public void QuickSort(int[] arr)
    {
        System.out.println("Before:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        Qsort(arr,0,arr.length);

        System.out.println("\nAfter:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
         void Heapsort(int []arr)
        {
            System.out.println("Before:");
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");

            for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }

            System.out.println("\nAfter:");
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");

    }
    void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k] >temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {1, 8, 9, 3, 1};
        Sort sort = new Sort();
        System.out.println("\n--------------------------------------------\n冒泡排序:");
        sort.BoobSort(nums.clone());
        System.out.println("\n--------------------------------------------\n堆排序:\n");
        sort.Heapsort(nums.clone());
        System.out.println("\n--------------------------------------------\n快速排序:\n");
        sort.QuickSort(nums.clone());
        System.out.println("\n--------------------------------------------\n插入排序:");
        sort.InsertSort(nums.clone());
//    }
    }
}
