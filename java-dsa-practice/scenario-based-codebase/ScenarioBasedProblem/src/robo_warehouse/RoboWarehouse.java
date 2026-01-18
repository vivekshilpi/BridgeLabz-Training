package robo_warehouse;

class RoboWarehouse {

    // Inserts the latest package into its correct position
    static void insertInOrder(Package[] shelf, int totalPackages) {

        Package key = shelf[totalPackages - 1];   // Newly arrived package
        int j = totalPackages - 2;

        // Shift heavier packages to the right
        while (j >= 0 && shelf[j].weight > key.weight) {
            shelf[j + 1] = shelf[j];
            j--;
        }

        // Place new package in correct position
        shelf[j + 1] = key;
    }
}
