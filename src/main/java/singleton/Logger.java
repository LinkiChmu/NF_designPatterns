package singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CopyOnWriteArrayList;

public class Logger {

    private static volatile Logger logger;
    private final CopyOnWriteArrayList<String> log;

    private Logger() {
        log = new CopyOnWriteArrayList<>();
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void classLogg(Object obj, String info) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        String formattedDate = currentDate.format(formatter);

        StringBuilder sb = new StringBuilder("Log info: ");
        sb.append(formattedDate);
        sb.append(" - ");
        sb.append(obj.getClass().getSimpleName());
        sb.append(" - ");
        sb.append(info);

        System.out.println(sb);
        log.add(sb.toString());
    }
}
