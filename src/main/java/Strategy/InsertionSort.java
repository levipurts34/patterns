package Strategy;

public class InsertionSort implements SortingStrategy{

    @Override
    public void sort(double[] numbers) {
        for (int firstUnsortedIndex=1;firstUnsortedIndex<numbers.length;firstUnsortedIndex++) {
            double newElement=numbers[firstUnsortedIndex];
            int i;
            for (i=firstUnsortedIndex;i>0 && numbers[i-1]>newElement;i--) {
                numbers[i]=numbers[i-1];
            }
            numbers[i]=newElement;
        }
    }
}
