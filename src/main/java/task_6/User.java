package task_6;

public class User {
    public enum Role {
        admin, user, guest
    }

    private String username;
    private String password;
    private Role role;
    private boolean isActive;

    public User(String username, String password,  Role role, Boolean isActive) {
        this.isActive = isActive;
        setPassword(password);
        setUsername(username);
        this.role = role;
    }

    public String getPassword() {
        if (isActive) {
            return password;
        } else {
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }
    }

    public void setPassword(String password) {
        if (isActive || this.password == null) {
            if (password.length() > 4) {
                this.password = password;
            } else {
                throw new IllegalArgumentException("Помилка! Довжина паролю не може бути меншою 4 символів!");
            }
        } else {
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }
    }

    public String getUsername() {
        if (isActive) {
            return username;
        } else {
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }
    }

    public void setUsername(String username) {
        if (isActive || this.username == null) {
            if (username.length() > 2) {
                this.username = username;
            } else {
                throw new IllegalArgumentException("Помилка! Username має містити мінімум 2 символи!");
            }
        } else {
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }
    }

    public Role getRole() {
        if (isActive) {
            return role;
        } else {
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }
    }

    public void setRole(Role role) {
        if (isActive) {
            this.role = role;
        } else {
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}