public class placeFlower {
    public static boolean canPlaceFlower(int[] flower, int n) {
        int size = flower.length;
        if (n == 0)
            return true;
        for (int i = 0; i < size; i++) {
            if (flower[i] == 0 && (i == 0 || flower[i - 1] == 0)
                    && (i == size - 1 || flower[i + 1] == 0)) {
                n--;
                if (n == 0)
                    return true;
                flower[i] = 1;

            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] flower = { 1, 0, 0, 0, 1 };
        System.out.println(canPlaceFlower(flower, 1));
    }

}
