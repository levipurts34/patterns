package Strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(double[] numbers) {
        int length=numbers.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    double temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
    }


}
