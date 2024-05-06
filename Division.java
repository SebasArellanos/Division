class Division {
    private double x, y;

    @Override
    public String toString() {
        return "Division [x=" + x + ", y=" + y + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double mostrarResultado() {
        return this.x / this.y;
    }
}