package task_6;

public class AuthService {

    public boolean login(User user, String enteredPassword){
        if (!user.isActive()){
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }

        if (enteredPassword.length() > 4){
            if (user.getPassword().equals(enteredPassword)){
                return true;
            } else {
                System.out.println("Пароль не вірний!");
                return false;
            }
        } else {
            throw new IllegalArgumentException("Помилка! Пароль повинен бути більше 4 символів!");
        }
    }

    public boolean hasAccess(User user, String requiredRole){
        if (!user.isActive()){
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }

        if (requiredRole != null){
            return user.getRole().name().equalsIgnoreCase(requiredRole);
        } else {
            throw new IllegalArgumentException("Помилка! user та requiredRole не можуть бути пустими!");
        }
    }

    public void changePassword(User user, String oldPass, String newPass){
        if (!user.isActive()){
            throw new IllegalStateException("Помилка! Користувач деактивований!");
        }

        if (oldPass != null && newPass != null){
            if (user.getPassword().equals(oldPass)){
                user.setPassword(newPass);
            } else {
                throw new IllegalArgumentException("Помилка! user, oldPass та newPass не можуть бути пустими!");
            }
        }
    }
}
