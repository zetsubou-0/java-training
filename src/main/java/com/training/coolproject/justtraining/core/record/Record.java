package com.training.coolproject.justtraining.core.record;

import com.training.coolproject.justtraining.core.currency.Currency;
import com.training.coolproject.justtraining.core.currency.CurrencyCode;

import java.time.LocalDateTime;

/**
 * Предстовляет собой абстракную запись в таблице
 */
public interface Record {

    /**
     * Возвращает дату ассоциированную с текущей записью
     * @return дату ассоциированную с текущей записью
     */
    LocalDateTime getDate();

    /**
     * Возвращает сумму затрат для стандартного кода (US -> $)
     * @return сумму затрат
     */
    Currency getValue();

    /**
     * Возвращает сумму затрат для задданого кода
     * @param currencyCode задааный код валюты
     * @return сумму затрат
     */
    Currency getValue(CurrencyCode currencyCode);
}
