package com.KRONOS.DynamicArray;
public class Main{
    public static void main(String[] args) {
        DynamicArray<String>  D= new DynamicArray<>(4);
        D.add("Ayush");
        D.add("Ravi");
        D.add("Parag");
        D.add("Raju");
        D.add("JAS");

        int size = D.size();
        System.out.println("Size = "+size);
        System.out.println(D.isEmpty());
        System.out.println(D.toString());
        System.out.println(D.remove("JAS"));
        System.out.println(D.toString());
    }
}
