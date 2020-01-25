package Lesson19.Study;


import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class FileCopyUtilsImpl implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileNotFoundException {
        File sour = new File(source);
        File dest = new File(destination);
        if (!sour.exists()) {
            throw new FileNotFoundException("Source file is not found!");
        } else if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

            int c;

            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
            if (!dest.exists()) {
                throw new FileCopyFailedException("Ошибка! Копирование не завершено:-(");
            } else {
                System.out.println("Файл скопирован!");
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }


    public void copyFile1(String source, String destination) throws FileCopyFailedException, FileNotFoundException {
        File sour = new File(source);
        File dest = new File(destination);

        if (!sour.exists()) {
            throw new FileNotFoundException("Source file is not found!");
        } else if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }
        try {
            FileChannel sourceChannel = new FileInputStream(source).getChannel();
            FileChannel destChannel = new FileOutputStream(destination).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            sourceChannel.close();
            destChannel.close();
            if (!dest.exists()) {
                throw new FileCopyFailedException("Ошибка! Копирование не завершено:-(");
            } else {
                System.out.println("Файл скопирован!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyFile2(String source, String destination) throws FileCopyFailedException, FileNotFoundException {
        File sour = new File(source);
        File dest = new File(destination);

        if (!sour.exists()) {
            throw new FileNotFoundException("Source file is not found!");
        } else if (dest.exists()) {
            throw new FileAlreadyExistsException("File destination is already exist!");
        }

        try {
            Files.copy(sour.toPath(), dest.toPath());
            if (!dest.exists()) {
                throw new FileCopyFailedException("Ошибка! Копирование не завершено:-(");
            } else {
                System.out.println("Файл скопирован!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


