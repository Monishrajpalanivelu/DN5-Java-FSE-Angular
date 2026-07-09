import java.util.*;

class Order{
    int id;
    double price;

    Order(int id,double price){
        this.id=id;
        this.price=price;
    }
}

public class OrderSorting{

static void bubbleSort(Order arr[]){
    for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr.length-1;j++)
            if(arr[j].price>arr[j+1].price){
                Order t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
}

static void quickSort(Order arr[],int low,int high){
    if(low<high){
        int p=low;
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
}
}