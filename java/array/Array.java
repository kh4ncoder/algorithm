package array;

/**
 * 1) 数组的插入，删除，按照下标随机访问操作；
 * 2) 数组中的数据是int类型；
 *
 * Created by khan on 2019-02-13
 */
public class Array {
    public int data[];      //
    private int n;          //
    private int count;      //

    public Array(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    public int find(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        return data[index];
    }

    public boolean insert(int index, int value) {
        if (count == n) {
            System.out.println("数组已满，不可添加新元素");
            return false;
        }
        if (index < 0 || index > count) {
            System.out.println("偏移量非法");
            return false;
        }
        for (int i = count; i > index; --i) {
            data[i] = data[i-1];
        }
        data[index] = value;
        ++count;
        return true;
    }

    public boolean delete(int index) {
        if (index < 0 || index >= count) return false;
        for (int i = index; i < count - 1; i++) {
            data[i] = data[i + 1];
        }

//        int[] arr = new int[count-1];
//        for (int i = 0; i < count - 1; i++) {
//            arr[i] = data[i];
//        }
//        this.data = arr;

        count--;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n --- ");
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3,10);
        array.printAll();   //4 5 3 10 9
        array.delete(2);
        array.printAll();   //4 5 10 9
        array.insert(5, 8);
        int v = array.find(2);
        System.out.println(v);  // 10
//        array.find(8);
    }
}
