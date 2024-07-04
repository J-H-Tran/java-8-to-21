public class CallableAdapter {
    public ActionListener callableAdapter(Runnable runnable) {
        return e -> runnable.run();
    }
}