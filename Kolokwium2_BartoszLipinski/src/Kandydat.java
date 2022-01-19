public class Kandydat implements Cloneable, Comparable<Kandydat>{

    private String nazwa;
    private int wiek;
    private String wyksztalcony;
    private int lataDoswiadczenia;


    public Kandydat(String nazwa, int wiek, String wyksztalcony, int lataDoswiadczenia) {
        this.lataDoswiadczenia = lataDoswiadczenia;
        this.wyksztalcony = wyksztalcony;
        this.wiek = wiek;
        this.nazwa = nazwa;


    }

    @Override
    public int compareTo(Kandydat k) {
        int compared = 0;

        if(this.wyksztalcony.equals("magister") ){
            if(k.wyksztalcony.equals("licencjat"))
                compared+=1000;
        }
        if(this.wyksztalcony.equals("licencjat")){
            if(k.wyksztalcony.equals("magister")){
                compared-=500;
            }
        }
        if(this.wiek > k.wiek)
            compared+=100;
        if(this.wiek < k.wiek)
            compared-=100;
        if(this.lataDoswiadczenia > k.lataDoswiadczenia)
            compared+=10;
        if(this.lataDoswiadczenia < k.lataDoswiadczenia)
            compared -=10;

        return compared;
    }

    public String getWyksztalcony() {
        return wyksztalcony;
    }

    public void setWyksztalcony(String wyksztalcony) {
        this.wyksztalcony = wyksztalcony;
    }

    public int getLataDoswiadczenia() {
        return lataDoswiadczenia;
    }

    public void setLataDoswiadczenia(int lataDoswiadczenia) {
        this.lataDoswiadczenia = lataDoswiadczenia;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}