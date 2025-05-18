import java.util.Scanner;

public class BinarySearch{

    public static void main(String args[]){

        Scanner snr=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=snr.nextInt();
        int array[]=new int[size],element,middle,first,last;
        System.out.println("Enter the elements of the array");
       
        for(int i=0;i<size;i++){
            array[i]=snr.nextInt();
        }

        System.out.println("Enter the element to be searched");
        element=snr.nextInt();
        first=0;
        last=size-1;
        middle=(first+last)/2;
        System.out.print("The element is in index : ");

        while(first<=last){
            if(array[middle]>element){
                last=middle-1;
            }

            else if(array[middle]==element){
                System.out.print(middle);
                break;
            }

            else{
                first=middle+1;
            }

            middle=(first+last)/2;
        }
    }
}
