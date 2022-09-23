import java.util.Scanner;
/*public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int i = 0;

        for(i = 0; i<num.length; i++){
            System.out.println("请输入第"+(i+1)+"个数值");
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for(i = 0; i<num.length; i++){
            if(max < num[i]){
                max = num[i];
            }
            if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println("最大值"+max+",最小值" + min);
        sc.close();
    }
}*/





/*
public class Test01 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];// 定义一个长度为5的数组


        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "个整数");
            int nums = input.nextInt();// 循环输入10个整数
            arr[i - 1] = nums;// 将输入的整数存在数组里
        }

        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }

        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.print("最大数：" + max);
        System.out.println("最小数:" + min);
    }
}*/

/*
public class Test01 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];// 定义一个长度为5的数组
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "个整数");
            int nums = input.nextInt();// 循环输入10个整数
            arr[i - 1] = nums;// 将输入的整数存在数组里
        }
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.print("最大数：" + max);
        System.out.println("最小数" + min);
    }
}
*/


/*
public class Test01 {
    public static void main(String[] args) {
        int[] k = new int[5];
        int i = 0;
        Scanner sc = new Scanner(System.in);

        for(i = 0; i<5; i++){
            System.out.println("请输入第"+(i+1)+"个数值");
            k[i] = sc.nextInt();
        }

        int max = k[0];
        int min = k[0];
        for(i = 0; i<k.length; i++){
            if(max < k[i]){
                max = k[i];
            }

            if(min > k[i]){
                min = k[i];
            }
        }
        for(i = 0; i<k.length; i++){
            System.out.print(k[i]+" ");
        }
        System.out.println();

        System.out.println("最大值"+max+",最小值"+min);
    }
}
*/


// 比较大小
/*
public class Test01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int j = 1; j <= 5; j++){
            System.out.println("请输入第"+ j +"个数值");
            int nums = input.nextInt();
            arr[j - 1] = nums;
        }

        int max = arr[0];
        for(int j = 0; j<arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
            }
        }

        int min = arr[0];
        for(int j = 0; j<arr.length; j++){
            if(min > arr[j]){
                min = arr[j];
            }
        }

        for(int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        System.out.println("最大值："+max+"，最小值："+min);
    }
}
*/

//  排序
public class Test01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;


        for(int i = 0; i < 5; i++){
            System.out.println("请输入第"+ (i+1) +"个数值");
            int nums = input.nextInt();
            arr[i] = nums;
        }

        // 求最大值
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最大值："+max+"最小值："+ min);

        // 排序
        System.out.println("从小到大排序：");
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
