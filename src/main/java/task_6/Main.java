package task_6;

public class Main {
    public static void main(String[] args){

        // Створюємо користувачів - клас User
        User user1 = new User("Joe", "qwerty123", User.Role.user, true);
        User admin = new User("Petr", "rnmfemm_4^3$4", User.Role.admin, true);
        User quest = new User("guest1", "145156118fr", User.Role.guest, true);
        User user2 = new User("Mary", "w3en4undnbt5u9", User.Role.user, false);

        // Створюємо новий об'єкт - клас AuthService
        AuthService authService1 = new AuthService();

        // Перевіряємо користувачів на доступ - клас AuthService
        try {
            authService1.hasAccess(user1, "admin");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            authService1.hasAccess(admin, "admin");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            authService1.hasAccess(quest, "user");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            authService1.hasAccess(user2, "user");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }




    }
}
