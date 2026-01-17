package icecream_rush;

class IceCreamSorter {

    static void sortByPopularity(Flavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if next flavor sold more
                if (flavors[j].weeklySales < flavors[j + 1].weeklySales) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }
}
