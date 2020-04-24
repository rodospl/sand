package tomek;

public class Run {
    int licznik;

    public int chectOK(int j) {
        licznik = 0;
        for (int i = 0; i < 60; i++) {
            if (i % j == 0) {
                licznik++;
            }


        }
        return licznik;
    }
}
