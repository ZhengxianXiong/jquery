public class Test {
    /**
     * 将身份证转为数组arr1[],前17位和数组
     * arr2一一对应相乘并求和，结果i对11取
     * 余，返回arr3[i]和arr1[17]的比较结果
     * @param cardcode
     * @return
     */
    public static boolean cardCodeVerify2(String cardcode) {
        String arr1[] = cardcode.split("");
        int arr2[] = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        String arr3[] = {"1","0","x","9","8","7","6","5","4","3","2"};
        int i = 0;
        String lastnumber = "";
        for(int j=0;j<arr2.length;j++){
            i += Integer.parseInt(arr1[j]) * arr2[j];
        }
        System.out.println("2:i="+i);
        i = i % 11;
        lastnumber =arr1[17];
        return lastnumber.equals(arr3[i]);
    }

    public static void main(String[] args) {
        String cardCode = "360122199303054513";
        boolean flag = Test.cardCodeVerify2(cardCode);
    }
}
