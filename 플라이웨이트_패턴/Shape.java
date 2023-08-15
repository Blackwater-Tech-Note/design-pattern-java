class Line implements Shape {
    public Line() {
        System.out.println("Create Line Object");
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}
