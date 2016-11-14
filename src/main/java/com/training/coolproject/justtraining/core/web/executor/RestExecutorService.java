package com.training.coolproject.justtraining.core.web.executor;

import java.io.IOException;
import java.util.Map;

/**
 * Предоставляет функционал работы с Web через GET/POST/DELETE запросы
 */
public interface RestExecutorService {

    /**
     * Выполняет GET запрос по задонному URL, возвращает ответ в виде строки,
     * иначе статус код в виде Status code: XXX
     * @param url запрашиваемый URL
     * @param params дополнительные параметры
     * @return ответ в виде строки или статус код в виде Status code: XXX (при неуспешном завершении)
     * @throws IOException
     */
    String executeGet(final String url, final Map<String, String> params) throws IOException;

    /**
     * Выполняет POST запрос по задонному URL, возвращает статус код
     * @param url запрашиваемый URL
     * @param params дополнительные параметры
     * @return статус код
     * @throws IOException
     */
    int executePost(final String url, final Map<String, String> params) throws IOException;

    /**
     * Выполняет DELETE запрос по задонному URL, возвращает статус код
     * @param url запрашиваемый URL
     * @return статус код
     * @throws IOException
     */
    int executeDelete(final String url) throws IOException;
}
