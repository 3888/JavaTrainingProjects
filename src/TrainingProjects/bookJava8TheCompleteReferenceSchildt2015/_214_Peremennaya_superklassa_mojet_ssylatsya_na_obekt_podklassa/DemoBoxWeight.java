package TrainingProjects.bookJava8TheCompleteReferenceSchildt2015._214_Peremennaya_superklassa_mojet_ssylatsya_na_obekt_podklassa;



class  DemoBoxWeight {
   public static void main(String args[]) {
       BoxWeight myboxl = new BoxWeight(10, 20, 15, 34.3);
       BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
       double vol;
       vol = myboxl.volume();
       System.out.println("объем myboxl равен " + vol);
       System.out.println("Bee myboxl равен " + myboxl.weight);
       System.out.println();
       vol = mybox2.volume();
       System.out.println("объем mybox2 равен " + vol);
       System.out.println("Bee mybox2 равен " + mybox2.weight);
   }
}