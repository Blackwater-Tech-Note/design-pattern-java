class Oval implements Shape {
    private boolean fillOption;

    public Oval(boolean b) {
        this.fillOption = b;
        System.out.println("Create Oval Object(Fill Option: "+b+")");
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
//		원을 그린다.
        circle.drawOval(x, y, width, height);
        if (fillOption) {
//			그린 원을 채운다.
            circle.fillOval(x, y, width, height);
        }
    }
}
