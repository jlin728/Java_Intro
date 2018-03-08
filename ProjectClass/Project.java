public class Project {
    private String name;
    private String desc;

    // Empty Project
    // ex. new Project ()
    public Project (){
    }

    // Project with just name
    // ex. new Project ("Venture Cap")
    public Project(String nameParam){
        name = nameParam;
        // return name;
    }

    // public String Project(String name){
    //     this.name = name;
    //     return this;             <-- "Project cannot be converted to String"
    // }

    // Project with name & desc
    // ex. new Project ("Mt. Valley Pitch", "Second round funding")
    public Project(String nameParam, String descParam){
        name = nameParam;
        desc = descParam;
    }

    // setter
    public void setName(String nameParam){
        name = nameParam;
    }

    public void setDesc(String descParam){
        desc = descParam;
    }

    // getter
    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    

    

}