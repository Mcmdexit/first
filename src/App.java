public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int x = 5;
        // to x einai ejna koyti to opoio exei mia "timh"
        // timh ->
        // a. mia aksia (px 5)
        // b. enas typos

        // 5, 5.0, "5", '5', 5.0f
        // int, double, String, char, float

        // ta antikeimena einai ligo diaforetika
        // -> apothikeyontai opws oi ypoloipes 'aples' times se metavlhtes
        // px. String onoma = "hello";
        // to onoma einai mia metavlhth poy krataei thn timh toy string poy grafei hello
        // to "hello" den einai ontws apothikeymeno mesa sto onoma
        // h metavlhth onoma krataei mia "anafora" sto antikeimeno (reference)
        // oi pinakes sthn java einai antikeimena

        // thelw enan pinaka me 5 akeraioys
        int[] array = new int[5];

        // to array "krataei" ena antikeimeno, ton pinaka
        // {0, 0, 0, 0, 0}
        // x y z a b
        // [0][1][2][3][4]

        // anathesh:
        // (metavlhth) = (timh)
        array[0] = x;
        array[1] = x + 1;
        array[2] = x + 2;
        array[3] = x + 3;
        array[4] = x + 4;

    }
}
