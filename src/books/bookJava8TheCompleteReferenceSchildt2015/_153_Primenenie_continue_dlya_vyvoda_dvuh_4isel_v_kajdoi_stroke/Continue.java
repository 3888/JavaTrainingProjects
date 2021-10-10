package books.bookJava8TheCompleteReferenceSchildt2015._153_Primenenie_continue_dlya_vyvoda_dvuh_4isel_v_kajdoi_stroke;

// ѕродемонстрировать применение оператора continue
class Continue {
    public static void main(String args[]) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}

