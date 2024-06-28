package liucheuski.siarhei.ai_camp_1.service;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;

public interface MessageHandler {
    void handle(Update upd, TelegramLongPollingBot bot) throws TelegramApiException, IOException;
}
