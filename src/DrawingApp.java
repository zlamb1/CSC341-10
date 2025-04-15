import view.BottomToolbar;
import view.Canvas;
import view.Frame;
import view.container.BasicFrameContentBuilder;
import view.container.IFrameContent;

public class DrawingApp {
    public void startApp() {
        BasicFrameContentBuilder builder = new BasicFrameContentBuilder();
        IFrameContent frameContent = builder
           .setCanvas(new Canvas())
           .setBottomToolbar(new BottomToolbar())
           .build();

        Frame.createInstance(frameContent);
        Frame frame = Frame.getInstance();
        frame.setTitle("Drawing");
    }
}
