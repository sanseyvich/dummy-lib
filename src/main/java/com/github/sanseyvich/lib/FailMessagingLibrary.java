/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.sanseyvich.lib;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class FailMessagingLibrary {
    public String onFail() throws IOException {
        return FigletFont.convertOneLine("Oops, the test failed!");
    }
}
