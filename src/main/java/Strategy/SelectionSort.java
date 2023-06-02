package Strategy;
public class SelectionSort implements SortingStrategy{
    @Override
    public void sort(double[] numbers) {
        for (int lastUnsortedIndex=numbers.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest = 0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                if(numbers[i]>numbers[largest]){
                    largest=i;
                }
            }
            swap(numbers, largest, lastUnsortedIndex);
        }
    }
    public static void swap(double[] array, int i, int j) {
        if (i==j) {
            return;
        }
        double temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
