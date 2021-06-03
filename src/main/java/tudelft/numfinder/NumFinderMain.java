package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        nf.find(new int[] {4, 7, 25, 13});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
