package observer.pseudocode;

import java.io.File;

public class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String log_filename, String message) {
        log = new File(log_filename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("write to " + log.getName() + ": \"" + newMessage + "\"");
    }
}

// mình chợt nhận ra là, ngoài tình yêu ra, chả có cái gì khiến mình phải suy nghĩ nhiều hay buồn như này. Gia điinhf hânhj phúc, bạn bè hiểu, học tập hay công việc chưa được ổn định
// cũng coi là trải nghiệm tốt
