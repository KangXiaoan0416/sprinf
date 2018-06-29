package com.xiaoan.part1.knights;

import java.io.PrintStream;

/**
 * 功能描述: TODO
 * 屠龙勇士类
 * @author: 康小安
 * @date: 18-6-29 下午3:43
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Embarking on quest to slay the dragon!");
    }
}
