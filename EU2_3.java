class Punkt {
    private String id = "";
    private double x = 0;
    private double y = 0;
    
    public Punkt(String namn, double x, double y) {
        this.id = namn;
        this.x = x;
        this.y = y;
    }
    public Punkt(Punkt punkt) {
        this.id = punkt.GetId();
        this.x = punkt.GetX();
        this.y = punkt.GetY();
    }

    public double Distance(Punkt punkt) {
        return Math.sqrt(Math.pow(this.x - punkt.GetX(), 2) +
                Math.pow(this.y - punkt.GetY(), 2));
    }
    public boolean Equals(Punkt punkt) {
        return (this.x == punkt.GetX() && this.y == punkt.GetY());
    }
    public void SetId(String id) {
        this.id = id;
    }
    public String GetId() {
        return this.id;
    }
    public void SetX(double x) {
        this.x = x;
    }
    public void SetY(double y) {
        this.y = y;
    }
    public double GetX() {
        return this.x;
    }
    public double GetY() {
        return this.y;
    }
}
