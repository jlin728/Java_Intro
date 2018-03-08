public class ProjectTest {
    
    public static void main (String[] args){

        // Project emptyProject = new Project();

        Project nameProject = new Project();        //Create new instance(s) of Project class
        Project fullProject = new Project();
        
        // Name Only
        nameProject.setName("Blackstone");           // set Project name
        String name = nameProject.getName();


        // Full Details - "Elevator pitch"
        fullProject.setName("Sequoia");
        fullProject.setDesc("Plated on red slate.");
        String name2 = fullProject.getName();
        String desc2 = fullProject.getDesc();

        System.out.println("Project name: " + name);
        System.out.println("Project name: " + name2 + " | " + "Description: " + desc2);
        
    }

}