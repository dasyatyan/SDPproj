public abstract class Page implements Observer{
    viewBehavior viewBehavior;

    public Page(){};
    public void setViewBehavior(viewBehavior viewBehavior) {
        this.viewBehavior = viewBehavior;
    }

    public  void create(){};

    public void update(){};
}
