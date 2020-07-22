package Factory_Method;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 8.1")) {
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

}

