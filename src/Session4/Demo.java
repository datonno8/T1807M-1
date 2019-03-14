package Session4;

import Lab_session3.SoNguyenTo;

import java.util.ArrayList;

public class Demo {
    public static void main(String args[]){
        int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        //x.length

        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(4);
        arr.add("hello");
        arr.add("world");

        arr.add(2,5);

        SoNguyenTo soNguyenTo = new SoNguyenTo(7);

        //arr.add(1,soNguyenTo);

        for (int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println(arr.indexOf(5));

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("abc xyz");
        strArray.add("aabbbb");
        strArray.add("cccc");

        for (int i=0;i<strArray.size();i++){
           // System.out.println(strArray.get(i));
        }

        for(String str:strArray){
            System.out.println(str);
        }


        ArrayList<SoNguyenTo> soNguyenToArrayList = new ArrayList<>();
        soNguyenToArrayList.add(soNguyenTo);
        for (SoNguyenTo snt:soNguyenToArrayList){
            System.out.println(snt.timSoNguyenToTiepTheo());
        }


    }
}
