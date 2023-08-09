public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, -2, -4, 2, 3, 6, -7, 88, -558, 77, 15, 67, 80, 69, 50};
        double sum = 0;
        int count = 0;
        boolean negativeNum = false;
        for (double currentElem : numbers) {
            if (negativeNum) {
                if (currentElem > 0) {
                    sum += currentElem;
                    count++;
                }
            }else {
                    if (currentElem < 0) {
                        negativeNum = true;
                    }

                }
            }


                if (count > 0) {


                    double average = sum / count;
                    System.out.println("Средняя Арифметическое " +  average);
                } else {
                    System.out.println("Неполучилось");
                }

    }
}









        
