public class Main2 {
    public static void main(String[] args) {
        int[] num = {83, 3, 41, 6, 41, 2, 5, 7, 46, 86};

        System.out.println("Несортированный массив:");
        printArray(num);

        selectionSort(num);

        System.out.println("Отсортированный массив:");
        printArray(num);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int Index = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[Index]) {
                    Index = j;
                }
            }

            int temp = array[Index];
            array[Index] = array[i];
            array[i] = temp;

        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
