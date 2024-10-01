package net.htlgkr.kollnbergert22094;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    List<Weapon> list;

    public FileReader(List<Weapon> list) {
        this.list = list;
    }

    public void readFile() {

        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                        s[0],
                        CombatType.valueOf(s[1]),
                        DamageType.valueOf(s[2]),
                        Integer.valueOf(s[3]),
                        Integer.valueOf(s[4]),
                        Integer.valueOf(s[5]),
                        Integer.valueOf(s[6])
                ));
    }


}
