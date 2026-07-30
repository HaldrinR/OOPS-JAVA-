import java.util.Scanner;
public class Select{
    public static void main(String[]args){
     //   int [] arr={9,3,7,4,6,1};
        int i,j,temp,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(i=0;i<arr.length-1;i++){
            min = i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                   min = j;
                }
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        System.out.println("Sorted array:");
        for(i=0;i<arr.length;i++){                                                                                                                                                                                                                                                                                                                                                                                                                                                       
            System.out.println(arr[i]);
        }   
    }
};