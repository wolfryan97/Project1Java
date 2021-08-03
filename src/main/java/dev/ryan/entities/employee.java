package dev.ryan.entities;

public class employee {
    int emp_id;
    String emp_firstname;
    String emp_lastname;
    boolean is_manager;
    String username;
    String password;

    public employee(int emp_id, String emp_firstname, String emp_lastname, boolean is_manager, String username, String password) {
        this.emp_id = emp_id;
        this.emp_firstname = emp_firstname;
        this.emp_lastname = emp_lastname;
        this.is_manager = is_manager;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "employee{" +
                "emp_id=" + emp_id +
                ", emp_firstname='" + emp_firstname + '\'' +
                ", emp_lastname='" + emp_lastname + '\'' +
                ", is_manager=" + is_manager +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
