package meusBeans;

public class UserData implements java.io.Serializable {
    private String username;
    private String email;
    private int age; 
    public void setUsername( String value )
    {
        username = value;
    }
    public void setUsername( )
    {

    }
    
    public void setEmail( String value )
    {
        email = value;
    }
    public void setAge( int value )
    {
        age = value;
    }
    
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public int getAge() { return age; } 
}
