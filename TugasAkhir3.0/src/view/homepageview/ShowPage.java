package view.homepageview;

public class ShowPage extends LoginPage {

    public void show() {
        for (int i = 0; i < sC.getArrayList(); i++) {
            System.out.println("[" + (i + 1) + "]");
            System.out.println("===============================");
            System.out.println("nama        : " + sC.getData(i).getNama());
            System.out.println("alamat      : " + sC.getData(i).getAlamat());
            System.out.println("no telpon   : " + sC.getData(i).getNoTelpon());
            System.out.println("Npm         : " + sC.getArrNpm(i));
            System.out.println("Modul       : " + sC.getData(i).getMdl());
            System.out.println("Kelas       : " + sC.getData(i).getKls());
            System.out.println("jadwal      : " + sC.getData(i).getJdwl());
        }

    }
}
