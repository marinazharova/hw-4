class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
      System.out.println("Measure height");
      System.out.println("Measure air pressure");
    }
}
class Altimeter {
    @Override
    public String toString() {
        return "Measure height";
    }
}
class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}
class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();
    public void control() {
        altimeter.toString();
        airGauge.toString();
    }

}
