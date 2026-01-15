package zipzip_mart;

class ZipZipMartSorter {

    static void mergeSort(Transaction[] arr, int left, int right) {

        if(left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(Transaction[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for(int i = 0; i < n1; i++) L[i] = arr[l + i];
        for(int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2) {

            if(L[i].date.compareTo(R[j].date) < 0 ||
               (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) {

                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while(i < n1) arr[k++] = L[i++];
        while(j < n2) arr[k++] = R[j++];
    }
}
