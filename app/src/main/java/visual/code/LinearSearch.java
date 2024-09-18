package visual.code;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target ) {
        // Vòng lặp kiểm tra các phần tử ở trong mảng có giống vs target hay là không ?
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // In ra khi tìm thấy giá trị
            }
        }
        return -1; // Trong trường hợp không tìm thấy giá trị 
    }
    
    public static void main(String[] args) {
        // mảng sẵn có
        int[] arr = { 5, 3, 0, 8, 7};
        // Gía trị cần tìm kiếm
        int target = 9;

        int result = linearSearch(arr, target);

        // Kiểm tra giá trị trả về
        if (result != -1) {
            System.out.println("Phan tu " + target + " duoc tim thay tai chi so: " + result);
        } else {
            System.out.println("Phan tu " + target + " khong duoc tim thay.");
        }
    }
}
