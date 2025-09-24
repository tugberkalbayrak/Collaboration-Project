

public class SumOfElements {

    public static int sumOfElements(int arr[], String str) {
        int sum = 0;
        if(str.equals("even")){
            for(int i = 0; i < arr.length;i++){
                if(i % 2 == 0){
                    sum += arr[i];
                }
            }
        }
        else if(str.equals("odd")){
            for(int i = 0; i < arr.length;i++){
                if(i % 2 != 0){
                    sum += arr[i];
                }
            }
        }
        return sum;

        
    }
}
