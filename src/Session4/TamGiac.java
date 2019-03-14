package Session4;

import java.util.ArrayList;

public class TamGiac {
    ArrayList<Integer> canh = new ArrayList<>();
    HinhChuNhat hcn;

    public TamGiac(){
        this.canh.add((int)(Math.random()*10));
        this.canh.add((int)(Math.random()*10));
        this.canh.add((int)(Math.random()*10));
    }

    public void tinhChuVi(){
        int chuvi = 0;
        for (Integer c:this.canh){
            chuvi+= c;
        }
        System.out.println("chu vi tam giac: "+chuvi);
    }
}
