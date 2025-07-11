package klassnayadzz.klassnayadzz.enkapsulasiya;
public class enkapsulyasiya {
        public static void main(String[] args) {
            User user = new User();


            user.setUsername("nadir414");
            user.setEmail("nadirmail.com");
            user.setPassword("123");


            user.setEmail("nadir@mail.com");
            user.setPassword("secret123");


            user.showProfile();
        }
    }

    class User {

        private String username;
        private String email;
        private String password;

        public void setUsername(String username) {
            this.username = username;
        }

        public void setEmail(String email) {

            if (email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Неверный email!");
            }
        }

        public void setPassword(String password) {
            if (password.length() >= 6) {
                this.password = password;
            } else {
                System.out.println("Пароль слишком короткий!");
            }
        }

        public void showProfile() {
            System.out.println("Имя пользователя: " + username);

            if (email != null) {
                System.out.println("Email: " + email);
            } else {
                System.out.println("Email не задан");
            }
        }
    }
