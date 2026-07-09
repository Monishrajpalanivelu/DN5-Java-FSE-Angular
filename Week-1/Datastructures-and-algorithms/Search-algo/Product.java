class Product{

static int linearSearch(int arr[],int key){
    for(int i=0;i<arr.length;i++)
        if(arr[i]==key) return i;
    return -1;
}

static int binarySearch(int arr[],int key){
    int l=0,r=arr.length-1;

    while(l<=r){
        int m=(l+r)/2;

        if(arr[m]==key) return m;
        else if(arr[m]<key) l=m+1;
        else r=m-1;
    }

    return -1;
}

public static void main(String args[]){
    int a[]={1,2,3,4,5};
    System.out.println(binarySearch(a,2));
}
}