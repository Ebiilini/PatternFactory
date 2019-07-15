public class CreamDoughnut implements DoughtInter {
    public CreamDoughnut makeDoughnut() {
        System.out.println("Пончик с кремом готов");
        return new CreamDoughnut();
    }
}
