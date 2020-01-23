package entity;

public class User  implements java.io.Serializable {


     private Integer userId;
     private String username;
     private String pasword;
     private String email;

    public User() {
    }

    public User(String username, String pasword, String email) {
       this.username = username;
       this.pasword = pasword;
       this.email = email;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasword() {
        return this.pasword;
    }
    
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}


