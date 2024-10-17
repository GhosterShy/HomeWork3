//DRY
class Logger {

    public void log(String message, String logType) {

        System.out.println(logType + ": " + message);

    }
}
//Использование общих конфигурационных настроек:
//
//Чтобы не дублировать строку подключения, можно вынести её в одно место, например, в статическое поле или в конфигурационный файл:
class Configuration {

    public static final String CONNECTION_STRING = "Server=myServer;Database=myDb;User=myUser;Password=myPass;";

}


class DatabaseService {

    public void connect() {

        String connectionString = Configuration.CONNECTION_STRING;

    }

}


class LoggingService {

    public void log(String message) {

        String connectionString = Configuration.CONNECTION_STRING;


    }

}





public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("This is an error message", "ERROR");
        logger.log("This is a warning message", "WARNING");
        logger.log("This is an info message", "INFO");

    }
}

