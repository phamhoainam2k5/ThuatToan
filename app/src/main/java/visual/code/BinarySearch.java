package visual.code;

// Tim kiem tuyen tinh la loai tim kiem yeu cau [] phai duoc sap xep =)))

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;

        // Vòng lặp while lặp đến bao h có kết quả
        while (left <= right) {
            int mid = left + (right - left)/2;
            
            // Kiểm tra phần tử giữa
            if (arr[mid] == target) {
                return mid; // Trả về chỉ số của phần tử
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else { // Nếu lớn hơn, tìm nửa bên trái
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Phan tu " + target + " duoc tim thay tai chi so: " + result);
        } else {
            System.out.println("Phan tu " + target + " khong duoc tim thay.");
        }
    }
}
