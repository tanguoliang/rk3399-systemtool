package com.rk3399.tool;

public class Led502 {
    /**
     * 开红色led
     */
    public static void openLedRed() {
        closeAllLed();
        WriteTool.writeSysFile(WriteTool.ledred, "1");
    }

    /**
     * 开绿色led
     */
    public static void openLedGre() {
        closeAllLed();
        WriteTool.writeSysFile(WriteTool.ledgre, "1");
    }

    /**
     * 开白色 led 1  识别补光
     */
    public static void openLedDsled2() {
        WriteTool.writeSysFile(WriteTool.dsled2, "1");
    }

    /**
     * 开白色 led 2 扫描补光
     */
    public static void openLedDsled3() {
        WriteTool.writeSysFile(WriteTool.dsled3, "1");
    }
    /**
     * 开红外 led
     */
    public static void openLedIrled() {
        WriteTool.writeSysFile(WriteTool.irled, "1");
    }

    /**
     * 关闭所有led
     */
    public static void closeAllLed() {
        WriteTool.writeSysFile(WriteTool.ledred, "0");
        WriteTool.writeSysFile(WriteTool.ledgre, "0");
        WriteTool.writeSysFile(WriteTool.dsled2, "0");
        WriteTool.writeSysFile(WriteTool.dsled3, "0");
        WriteTool.writeSysFile(WriteTool.irled, "0");
    }
}
