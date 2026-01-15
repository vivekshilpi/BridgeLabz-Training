package hospital_queue;

class HospitalQueue {

    static void sortByCriticality(Patient[] queue) {
        int n = queue.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(queue[j].criticality < queue[j + 1].criticality) {
                    Patient temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                }
            }
        }
    }
}

