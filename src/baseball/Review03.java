package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam Tokyo=new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam Yokohama=new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam Hanshin=new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam Kyozin=new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam Hiroshima=new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam Dragons=new BaseBallTeam("中日ドラゴンズ",66,75,2);

        Tokyo.report();
        Yokohama.report();
        Hanshin.report();
        Kyozin.report();
        Hiroshima.report();
        Dragons.report();
    }

}
