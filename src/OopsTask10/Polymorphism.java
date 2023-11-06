package OopsTask10;
class Tea {
    private String name;
    public Tea(String name) {
        this.name = name;
    }
    public void prepare() {
        System.out.println("Preparing " + name + " tea.");
    }
    public void serve() {
        System.out.println("Serving " + name + " tea.");
    }
}
class BlackTea extends Tea {
    public BlackTea(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + getName() + " black tea.");
    }
}
class GreenTea extends Tea {
    public GreenTea(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + getName() + " green tea.");
    }
}
class HerbalTea extends Tea {
    public HerbalTea(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + getName() + " herbal tea.");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Tea[] teas = {
                new BlackTea("Earl Grey"),
                new GreenTea("Matcha"),
                new HerbalTea("Chamomile"),
                new Tea("English Breakfast") 
        }

        for (Tea tea : teas) {
            tea.prepare();
            tea.serve();
            System.out.println();
        }
    }
}

