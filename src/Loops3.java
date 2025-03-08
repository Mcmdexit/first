public class Loops3 {
    public static void main(String[] args) {
        int fores = 0;
        String temp = "";

        while (fores < 5) {
            // kalyterh proseggish tha htan:
            // na ftiaksw prwta ena terastio string (px StringBuilder)
            // na to ektypwsw
            temp += "mhlo " + fores + "\n";
            fores++;
        }

        System.out.println(temp);

        // setup();
        // while(true)
        // {
        // draw();
        // }
    }
}
