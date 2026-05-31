package MidLevel.Stacks.Questions;

public class Pattern_Print {

    public static void Pattern_Star(int arr[]){

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        Pattern_Star(arr);
    }
    
}
