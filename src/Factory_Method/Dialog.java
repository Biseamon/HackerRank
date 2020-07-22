package Factory_Method;

public abstract class Dialog {

    public void renderWindow(){

        Button okButton = createButton();
        okButton.render();

    }

    protected abstract Button createButton();

}
