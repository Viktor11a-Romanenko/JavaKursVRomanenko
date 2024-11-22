package homework_45;

public class ValidateApp {
    public static void main(String[] args) throws lesson_45.validator.EmailValidateException {

        // Получаем email от пользователя (Сканером, из другого слоя приложения).
        String email = "test@email.com";
        String password = "Password123!";

        // Валидация email
        EmailAndPasswordValidator.isEmailValid(email);
        // Если мы дойдем до этой строчки кода,
        // значит email валидный
        System.out.println("Email прошел проверку");
        // User user = new User(email, password)


        // Валидация password
        try {
            EmailAndPasswordValidator.isPasswordValid(password);
            // Если мы дойдем до этой строчки кода,
            // значит password валидный
            System.out.println("Password прошел проверку");
            // User user = new User(email, password)
        } catch (PasswordValidateException e) {
            // password не прошел проверку.
            // Запросить у пользователя другой ввод
            System.err.println("Password is not valid");
            String message = e.getMessage();
            System.err.println(message);
        }

    }
}
