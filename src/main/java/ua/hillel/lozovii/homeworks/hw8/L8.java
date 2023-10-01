package ua.hillel.lozovii.homeworks.hw8;

public class L8 {
    public static void main(String[] args) {
        //        // O(N)
//        int N = 1000000;
//        for (int i = 0; i < N; i++) {
//
//        }
//
//
//        // O(N^2)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//
//            }
//        }
//
//        // O(N^3)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k < 4; k++) {
//
//                }
//            }
//        }



        // Сортування бульбашкою (Bubble Sort)
//        int[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//
////        int counter = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
////                counter++;
//                if (array[j] < array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }

//        System.out.println("counter = " + counter);

//        System.out.println(Arrays.toString(array));



        // Сортування вставкою (Insertion Sort)
//        int[] arr = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > key) {
//                // Переміщення елементів, які більше за key, на одну позицію вперед
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            // Вставлення key на правильну позицію у відсортованій частині масиву
//            arr[j + 1] = key;
//        }
//        System.out.println(Arrays.toString(array));


        //Сортування вибором (Selection Sort)
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    // Знаходження індексу найменшого елемента у несортованій частині
//                    minIndex = j;
//                }
//            }
//            // Обмін місцями поточного елемента та найменшого елемента
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(array));



//        int[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        Arrays.sort(array);
////        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));





//        int[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//
//        int element = 234;
//        int index = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == element) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println("index = " + index);


//        int element = 234;
//        int index = -1;
//        int counter = 0;
//        int[] array = {-42, -5, 1, 6, 8, 9, 19, 23, 67, 123, 234, 456};
//        for (int i = 0; i < array.length; i++) {
//            counter++;
//            if (array[i] == element) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println("index = " + index);
//        System.out.println("counter = " + counter);



//        int element = 234;
//        System.out.println("element for search = " + element);
//        int index = -1;
//        int counter = 0;
//        int[] array = {-42, -5, 1, 6, 8, 9, 19, 23, 67, 123, 234, 456};
//
//        System.out.println("array = " + Arrays.toString(array));
//
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left <= right) {
//            counter++;
//            int mid = (left + right) / 2;
//            System.out.println("middle = " + mid);
//            System.out.println("middle index value = " + array[mid]);
//
//            if (array[mid] == element) {
//                index = mid;
//                break;
//            } else if (array[mid] < element) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//
//        }
//
//        System.out.println("index = " + index);
//        System.out.println("counter = " + counter);


    }




    // Сортування злиттям (Merge Sort)
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            // Рекурсивно сортуємо обидві половини
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // Об'єднуємо сортовані половини
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Копіюємо дані у тимчасові підмасиви L та R
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        // Зливаємо підмасиви L та R назад у arr[]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Копіюємо залишок елементів L, якщо такі є
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Копіюємо залишок елементів R, якщо такі є
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }






    // Швидке сортування (Quick Sort)
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            // Рекурсивно сортуємо дві половини навколо півпута
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Обмін місцями елементів, які менше за півпута
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Обмін місцями півпута та першого елемента більше за півпута
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Повертаємо індекс півпута
    }
}
