package task_8;

public class SecurityApp {
    public static void main(String[] args){
        // Створюємо об'єкти для генерації та перевірки паролів - класи PasswordGenerator та PasswordValidator
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        PasswordValidator passwordValidator = new PasswordValidator();

        // Генеруємо паролі - клас PasswordGenerator (методи: generateSimple для простих та generateStrong для складних)
        String password1 = passwordGenerator.generateSimple(10);
        String password2 = passwordGenerator.generateStrong(25);
        String password3 = passwordGenerator.generateSimple(40);

        // Перевіряємо надійність паролів - клас PasswordValidator
        // Метод isLongEnough з класу PasswordValidator для перевірки довжини пароля
        passwordValidator.isLongEnough(password1, 12);
        passwordValidator.isLongEnough(password2, 12);
        passwordValidator.isLongEnough(password3, 12);

        // Метод hasSpecialChar з класу PasswordValidator для на наявність спеціальних символів у паролі
        passwordValidator.hasSpecialChar(password1);
        passwordValidator.hasSpecialChar(password2);
        passwordValidator.hasSpecialChar(password3);

        // Метод hasUpperCase з класу PasswordValidator для перевірки на наявність великих літер у паролі
        passwordValidator.hasUpperCase(password1);
        passwordValidator.hasUpperCase(password2);
        passwordValidator.hasUpperCase(password3);

        // Метод hasDigit з класу PasswordValidator для перевірки на наявність цифр у паролі
        passwordValidator.hasDigit(password1);
        passwordValidator.hasDigit(password2);
        passwordValidator.hasDigit(password3);

        // Метод getStrengthScore з класу PasswordValidator, який перевіряє усі умови та дає оцінку складності пароля (0-4)
        System.out.println("Рівень складності паролю становить: " + passwordValidator.getStrengthScore(password1));
        System.out.println("Рівень складності паролю становить: " + passwordValidator.getStrengthScore(password2));
        System.out.println("Рівень складності паролю становить: " + passwordValidator.getStrengthScore(password3));
    }
}
