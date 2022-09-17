public class Javaapplication3 {
    public static void main(String[] args) throws Exception {
        Hewan h = new Hewan();
        h.setTelinga("Pendek");
        System.out.println(h.getTelinga());

        h.setMata("Dua");
        System.out.println(h.getMata());

        h.setTangan(2);
        System.out.println(h.getTangan());


        Manusia M = new Manusia();

        M.setRambut("Biru");
        System.out.println(M.getRambut());

        System.out.println(M.tidur(true));

        Telpon pt= new Telpon();

        pt.setKabel("LURUS");
        System.out.println(pt.getKabel());

        System.out.println(pt.terima_panggilan(true));

    }
}