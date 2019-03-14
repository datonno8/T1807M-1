package Lab_session3;

public class Main {
    public static void main(String args[]){
        SoNguyenTo snt = new SoNguyenTo(4);

        for (int i=0;i<30;i++){
            System.out.println("SNT: "
                    +snt.timSoNguyenToTiepTheo());
        }

    }
}
