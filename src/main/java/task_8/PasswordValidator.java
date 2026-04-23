package task_8;

public class PasswordValidator {

    public boolean isLongEnough(String password, int minLength){
        if (password.length() == 0 || minLength <= 0){
           throw new IllegalArgumentException("Помилка! Перевірте значення!");
        }

        if (password.length() >= minLength){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasDigit(String password){
        for (char c : password.toCharArray()){
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public boolean hasUpperCase(String password){
        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    public boolean hasSpecialChar(String password){
        for (char c : password.toCharArray()){
            if (!Character.isLetterOrDigit(c)){
                return true;
            }
        }
        return false;
    }

    public int getStrengthScore(String password){
        int score = 0;

        if (isLongEnough(password, 12)){
            score++;
        }

        if (hasDigit(password)){
            score++;
        }

        if (hasUpperCase(password)){
            score++;
        }

        if (hasSpecialChar(password)){
            score++;
        }

        return score;
    }
}
