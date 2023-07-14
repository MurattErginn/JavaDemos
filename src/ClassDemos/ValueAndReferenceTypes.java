package ClassDemos;

public class ValueAndReferenceTypes {
    public static void main(String[] args) {
        // reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;

        // value
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        num1 = 30;
        System.out.println(num2);

        //Example of reference
        int[] nums1 = new int[] {1, 2, 3}; // F.e. nums1 has an adress 101 in Stack, and array {1, 2, 3} created in heap
        int[] nums2 = new int[] {4, 5, 6}; // nums2 has an adress 102 in Stack, and array {4, 5, 6} created in heap
        nums2 = nums1; // in this line, we change nums2 reference number to nums1's reference number.
        nums1[0] = 10; // we change nums1[0] element, which was 1, to 10.
        System.out.println(nums2[0]); /* that if we want to print nums2[0], 10 will be printed. Because, nums2's reference
        number is nums1's reference number, so the first element of the array we hold on Heap is 10. */
    }
}
