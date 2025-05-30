package com.tuaev.utils_bot.services;

import com.tuaev.utils_bot.enums.QuestionsPassword;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

public interface PasswordGeneratorService {

    void deleteResponsesUserAboutQuestionsAboutPassword(String userId);

    String generationPassword(String userId);

    boolean isCallbackResponse(String text);

    boolean isInlineButtonCharacter(String text);

    InlineKeyboardMarkup getInlineKeyboardNextQuestion();

    InlineKeyboardMarkup getKeyboardGenerationPassword();

    InlineKeyboardMarkup getInlineKeyboardCharacters();

    String getTextQuestionPasswordByIterator(int iterator);

    QuestionsPassword getQuestionPasswordByIterator(int iterator);

    void addResponseOnQuestionAboutPassword(String userId, String text, QuestionsPassword question);

    int getLengthQuestionsPassword();
}
