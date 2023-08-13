package com.driver;
//
//public class Main {
//    public static void main(String[] args) {
//        Product p = new Product();
//        p.product(2,5);
//        p.product(2,5,4);
//        p.product(3.4,4.47);
//    }
//    static class Product{
//        public int product(int x,int y){
//            return x*y;
//        }
//        public int product(int x,int y,int z){
//            return x*y*z;
//        }
//        public double product(double x,double y){
//            return x*y;
//        }
//    }
//
//}
class Main {
    static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        int result1 = p.product(2, 3);
        System.out.println("Result 1: " + result1);

        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        double result3 = p.product(2.5, 3.0);
        System.out.println("Result 3: " + result3);
    }
}
