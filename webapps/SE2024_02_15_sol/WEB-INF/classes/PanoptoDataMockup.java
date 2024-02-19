import java.util.Vector;

public class PanoptoDataMockup {
    int    order;
    String title;
    String duration;
    String panoptoId;
    
    PanoptoDataMockup (int order, String title, String duration, String panoptoId) {
        this.order = order;
        this.title  = title;
        this.duration   = duration;
        this.panoptoId = panoptoId;
    }
    public static Vector<PanoptoDataMockup> getPanoptoList() {
        Vector<PanoptoDataMockup> vec = new Vector<PanoptoDataMockup>();
        vec.addElement(new PanoptoDataMockup(8, "JavaScript en ficheros HTML", "1:18", "8f538e51-d1e3-4271-b38b-ab9700af34c7"));
        vec.addElement(new PanoptoDataMockup(9, "Ejemplos JavaScrip en pagina HTML", "4:47", "14966b44-c83c-46ae-b636-ab9700b19203"));
        vec.addElement(new PanoptoDataMockup(10, "Ejemplos manipulacion DOM", "4:46", "e7106efb-9654-4e62-9aca-ab9700b39d08"));
        vec.addElement(new PanoptoDataMockup(11, "JSON", "4:39", "69b3a602-fcbc-435d-a099-ab9700ba5248"));
        return vec;
    }
    public static PanoptoDataMockup getPanopto(int i) {
        return getPanoptoList().elementAt(i - 8);
    }
    
}
