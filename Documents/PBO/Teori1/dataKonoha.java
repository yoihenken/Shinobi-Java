/**
 * dataKonoha
 */
 class dataKonoha {

    private static int no;
    private static String nama;
    private static String peringkat;


    dataKonoha(){}
    dataKonoha(int no, String nama, String peringkat){
        this.no = no;
        this.nama = nama;
        this.peringkat = peringkat;
    }

    /**
     * @param no the no to set
     */
    public static void setNo(int no) {
        dataKonoha.no = no;
    }

    /**
     * @return the no
     */
    public static int getNo() {
        return no;
    }

    /**
     * @param nama the nama to set
     */
    public static void setNama(String nama) {
        dataKonoha.nama = nama;
    }

    /**
     * @return the nama
     */
    public static String getNama() {
        return nama;
    }
    /**
     * @param peringkat the peringkat to set
     */
    public static void setPeringkat(String peringkat) {
        dataKonoha.peringkat = peringkat;
    }

    /**
     * @return the peringkat
     */
    public static String getPeringkat() {
        return peringkat;
    }
}