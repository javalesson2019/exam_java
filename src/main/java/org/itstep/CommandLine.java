package org.itstep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CommandLine {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Добро пожаловать в Java Command Line!");
        while(true) {
            System.out.print("$ ");
            line = input.readLine();
            line = line == null ? "exit" : line.trim();
            // TODO: write your code here
            if("help".equalsIgnoreCase(line)) {
                usage();
            } else if("exit".equalsIgnoreCase(line)) {
                break;
            }
        }
    }

    private static void usage() {
        System.out.println("Java Command Line\n\n" +
                "Применение: java CommandLine.class \"команда\"  \"аргумент №1\" \"аргумент №2\" ... \"аргумент №N\"\n" +
                "Где \"команда\":\n" +
                "    dir — выводит список файлов в текущей директории\n" +
                "    cd «путь» — перейти в директорию, путь к которой задан первым аргументом\n" +
                "    pwd — вывести полный путь до текущей директории\n" +
                "    cat «имя_файла» - выводит содержимое текстового файла «имя_файла»\n");
    }


}
