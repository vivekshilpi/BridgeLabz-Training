package examcell;

class ExamCellSorter {

    static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(Student[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        // Sort in descending order of score (highest rank first)
        while (i < n1 && j < n2) {
            if (L[i].score >= R[j].score) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Merge two pre-sorted centers (demonstrates "center-wise merging")
    static Student[] mergeTwoCenters(Student[] c1, Student[] c2) {

        int n1 = c1.length, n2 = c2.length;
        Student[] merged = new Student[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (c1[i].score >= c2[j].score) {
                merged[k++] = c1[i++];
            } else {
                merged[k++] = c2[j++];
            }
        }

        while (i < n1) merged[k++] = c1[i++];
        while (j < n2) merged[k++] = c2[j++];

        return merged;
    }
}
