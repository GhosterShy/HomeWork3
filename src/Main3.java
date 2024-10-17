//YAGNI
//Избегание создания многофункционального класса:
//Класс `User` не должен содержать избыточных методов. Отправку писем и сохранение в базу данных лучше вынести в отдельные классы:

 class User {

    private String name;

    private String email;


    public User(String name, String email) {

        this.name = name;

        this.email = email;

    }




}


class UserService {

    public void saveToDatabase(User user) {

// Код для сохранения пользователя в базу данных

    }


    public void sendEmail(User user) {

// Код для отправки электронного письма пользователю

    }

}


 //Удаление ненужных настроек или конфигураций:

// Если параметры буферизации не нужны, их можно убрать:


 class FileReader {

     public String readFile(String filePath) {

// Логика чтения файла

         return "file content";

     }

 }






 class ReportGenerator {

     public void generatePdfReport() {

// Генерация PDF отчета

     }

 }



public class Main3 {
    public static void main(String[] args) {


    }
}
