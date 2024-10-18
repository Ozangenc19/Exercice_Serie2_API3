package be.condorcet;

public class Agent {
    private String name;
    private String role;
    private String nationality;




    public Agent(String name, String role, String nationality){
        this.name = name;
        this.role = role;
        this.nationality= nationality;
    }


    public String getName(){
        return this.name;
    }

    public String getRole(){
        return this.role;
    }

    public String getNationality(){
        return this.nationality;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setNationality(String nationality){ 
        this.nationality = nationality;
    }
}