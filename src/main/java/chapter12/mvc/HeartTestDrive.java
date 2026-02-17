package chapter12.mvc;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModelInterface model = new HeartModel();
        ControllerInterface controller = new HeartController(model);
    }
}
