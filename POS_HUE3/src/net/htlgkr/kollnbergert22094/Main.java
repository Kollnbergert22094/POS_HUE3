package net.htlgkr.kollnbergert22094;

import java.io.File;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Weapon> list = new LinkedList<>();

        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                        s[0],

                ))
    }
}
