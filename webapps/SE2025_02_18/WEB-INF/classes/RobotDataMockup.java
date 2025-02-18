import java.util.Vector;

public class RobotDataMockup {
    int id;
    String name;
    String company;
    String url;
    float height;
    float weight;
    float speed;
    float payload;
    float battery;

    public RobotDataMockup(int id, String name, String company, String url, float height, float weight, float speed, float payload, float battery) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.url = url;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.payload = payload;
        this.battery = battery;
    }
    
    public static void main(String[] args) {
        Vector<RobotDataMockup> vec = getRobotList();
        for (RobotDataMockup robot : vec) {
            System.out.println(robot.name + " - " + robot.company);
        }
    }
    public static Vector<RobotDataMockup> getRobotList() {
        Vector<RobotDataMockup> vec = new Vector<>();
        
        vec.addElement(new RobotDataMockup(1, "FIGURE 01", "Figure AI", "http://www.figure.ai/", 1.68f, 59.9f, 4.2f, 20.0f, 5.0f));
        vec.addElement(new RobotDataMockup(2, "PHOENIX", "Sanctuary AI", "https://www.sanctuary.ai/", 1.70f, 70.3f, 4.8f, 25.0f, -1));
        vec.addElement(new RobotDataMockup(3, "APOLLO", "Apptronik", "https://apptronik.com/",1.73f, 72.6f, -1, 25.0f, 4.0f));
        vec.addElement(new RobotDataMockup(4, "OPTIMUS GEN 2", "Tesla", "https://www.tesla.com/es_es/AI", 1.73f, 62.6f, 2.1f, 20.4f, -1));
        vec.addElement(new RobotDataMockup(5, "DIGIT", "Agility Robotics", "https://agilityrobotics.com/", 1.75f, 63.5f, 5.3f, 15.9f, -1));
        vec.addElement(new RobotDataMockup(6, "H1", "Unitree Robotics", "https://www.unitree.com/", 1.78f, 46.7f, 11.9f, -1, -1));
       return vec;
    }
}
