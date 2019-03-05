package algorithm;

public class Sort {

    long executionTime = 0;

    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */
    public static void main(String[] args) {

       public int[] selectionSort ( int[] array){
           final long startTime = System.currentTimeMillis();
            int[] list = array;

            for (int j = 0; j < array.length - 1; j++) {
               int min = j;
              for (int i = j + 1; i < array.length; i++) {
                   if (array[i] < array[min])
                        min = i;
               }


               int temp = array[min];
                array[min] = array[j];
               array[j] = temp;


                }


           }
            final long endTime = System.currentTimeMillis();
           final long executionTime = endTime - startTime;
          this.executionTime = executionTime;
           return list;
       }

        public int[] insertionSort ( int[] array){
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            //implement here


            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
       }

        public int[] bubbleSort ( int[] array){
           // int[] list = array;
            //implement here
            int[] list = {6, 3, 8, 1, 5, 7, 0, 2};

            int temp;
            for (int cursor = list.length-1; cursor >= 0; cursor--) {
                for (int i = 0; i < list.length-1; i++) {
                    if (list[i] > list[i + 1]) {
                        temp = list[i + 1];
                        list[i + 1] = list[i];
                        list[i] = temp;
                    }
                }
            }


            for (int n = 0; n < list.length; n++) {
                System.out.println(list[n]);
            }
        }
}


            return list;
        }


       public int[] mergeSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }


        public int[] quickSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }

        public int[] heapSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }


        public int[] bucketSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }

        public int[] shellSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }

        public static void printSortedArray ( int[] array){
            for (int i = 0; i < array.length; i++)
           System.out.println(array[i]);
            }
       }
   }
}
}