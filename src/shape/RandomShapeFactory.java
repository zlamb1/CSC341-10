package shape;

public class RandomShapeFactory implements IRandomShapeFactory {
    @Override
    public IShape createRandomShape() {
        return switch ((int) (Math.random() * 3)) {
            case 0 -> new CircleShape();
            case 1 -> new DoubleCircleShape();
            case 2 -> new TripleCircleShape();
            default -> null;
        };
    }
}
