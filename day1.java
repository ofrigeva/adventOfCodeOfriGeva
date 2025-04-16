class Main {
    public static void main(String[] args) {
        System.out.println(challengeSolutions.day1());
    }
}

class challengeSolutions {
    public static int day1() {
            int[] list1 = {2, 2, 2, 2};
        int[] list2 = {1, 1, 1, 1};
        int difference = 0;
        for(int i = 0; i < list1.length; i++) {
            difference = difference + (list1[i]-list2[i]);
        }
        return difference;
        }
    
}
