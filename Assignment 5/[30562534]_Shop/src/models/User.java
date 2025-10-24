package models;

public class User 
{
    // attributes here
    private String Username;
    private String Password;
    private String FirstName;
    private String LastName;
    
    
    
    // getters go here
    public String getUsername()
    {
        return Username;
    }
    
    public String getPassword()
    {
        return Password;
    }
    
    public String getFirstName()
    {
        return FirstName;
    }
    
    public String getLastName()
    {
        return LastName;
    }
    
    // setters go here
    public void setUsername(String UsernameIn)
    {
        Username = UsernameIn;
    }
    
    public void setPassword(String PasswordIn)
    {
        Password = PasswordIn;
    }
    
    public void setFirstName(String FirstNameIn)
    {
        FirstName = FirstNameIn;
    }
    
    public void setLastName(String LastNameIn)
    {
        LastName = LastNameIn;
    }
    
    // 0 constructor
    public User()
    {
        Username = "username1";
        Password = "password1";
        FirstName = "FirstName1";
        LastName = "LastName1";
    }
    
    // 4 constructor for all attributes
    public User(String UsernameIn, String PasswordIn, String FirstNameIn, String LastNameIn)
    {
        Username = UsernameIn;
        Password = PasswordIn;
        FirstName = FirstNameIn;
        LastName = LastNameIn;
    }
}
