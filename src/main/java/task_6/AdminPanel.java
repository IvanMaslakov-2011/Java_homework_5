package task_6;

public class AdminPanel {
    public void deleteUser(User admin, User target) {

        if (admin.isActive() && target.isActive()) {
            AuthService authService = new AuthService();

            if (authService.hasAccess(admin, "admin")) {
                target.setActive(false);
            }
        } else {
            throw new IllegalStateException("Помилка! Один або обидва аккаунти деактивовані!");
        }
    }

    public void listAllUsers(User admin, User[] allUsers) {
        if (admin.isActive() && allUsers != null) {
            System.out.println("Усі користувачі: ");

            for (User user : allUsers) {
                if (user.isActive()) {
                    System.out.println(user.getUsername() + ", ");
                }
            }
        } else {
            throw new IllegalStateException("Помилка admin аккаунт має бути активним та список не може бути порожнім!");
        }
    }
}
