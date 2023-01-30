public class pyramidPrinting {
        public static void main(String[] args) {
            printAsterisksAsPyramid(20);
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
    }

