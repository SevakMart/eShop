package action;

import dataaccess.manager.IUserManager;
import dataaccess.manager.impl.UserManager;
import model.User;
import model.UserType;
import org.apache.struts2.interceptor.validation.SkipValidation;

import util.Validator;

import javax.annotation.PostConstruct;

/**
 * Created by forjava on 11/8/2016.
 */
public class LoginAction extends BaseAction {

    private String name;
    private String email;
    private String password;

    private User user;

    private IUserManager userManager = new UserManager();


    @SkipValidation

    public String view() {
        return SUCCESS;
    }

    @Override
    public void validate() {
        if (Validator.isEmpty(name)) addFieldError("name", "please input name");
        if (Validator.isEmpty(email)) addFieldError("name", "please input email");
        if (Validator.isEmpty(password)) addFieldError("name", "please input password");
    }


    public String register() {
        user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(name);
        user.setUserType(UserType.USER);
        userManager.create(user);
        return SUCCESS;
    }

    @SkipValidation
    public String login() {
        user = userManager.getUserByEmailAndPassword(email, password);
        if (user != null) {
            session.put("user", user);
            if (user.getUserType() == UserType.ADMIN) return "admin";
            if (user.getUserType() == UserType.USER) return "user";
        }
        return INPUT;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

