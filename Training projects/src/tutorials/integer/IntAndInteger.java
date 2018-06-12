package tutorials.integer;

class IntAndInteger {

//  http://habrahabr.ru/post/104231/
//  ... статичный метод java.lang.Integer.valueOf(int), который, как вы можете увидеть в исходниках,
//  кэширует значения от -128 до 127 (в более свежей реализации верхнюю границу кэша можно менять).

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a==b);
        System.out.println(c==d);
    }
}