public class PrintingString {
   private static void printAsterisks(int nub) {
       for (int i = 0; i < nub ; i++) {
           for (int x = 0; x < i + 1; x++)
               System.out.print("*");
           System.out.println("\n");
       }

   }


        private static void printAsterisksAsPyramid(int n) {
                int temp = n;
                for (int i = 0; i < n; i++) {
                    int pivot = 1;
                    if (temp != 1) {
                        pivot = temp / 2;
                        pivot += 1;
                    }
                    temp--;
                    if (i % 2 == 0) { //want to print online odd to simulate real pyramid
                        for (int j = 0; j < n + 1; j++) {
                            if (j >= pivot && j < pivot + i + 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                }
            }




    public static void main(String[] args) {
        int nub;
       nub = Integer.parseInt(InputCollector.collectInput("please enter how many asterisk u will like to print"));
        printAsterisks(nub);

        nub = Integer.parseInt( InputCollector.collectInput("please enter how many asterisk u will like to print"));
        printAsterisksAsPyramid(nub) ;

    }

    }







