public class DataType {
    public static void main(String[] args) {
        //整数扩展 进制 二进制0b 八进制0 十进制  十六进制0x
        int i2 = 0b10;
        int i8 = 010;
        int i10 = 10;
        int i16 = 0x12; //16+2
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i10);
        System.out.println(i16);

        System.out.println("======================================================");
        System.out.println("//浮点数扩展？ 银行业务怎么表示？");
        //bigDecimal 数学工具类
        System.out.println("======================================================");
        // float  舍入误差 接近但不等于
        // double
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);
        System.out.println(f);
        System.out.println(d);
        System.out.println("======================================================");

        float d1 = 12312312312312f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);
    }
}
