package com.poly.yellowcat.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class MsgBox {

    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Yellow Cat Shop", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(Component perent, String mess) {
        int result = JOptionPane.showConfirmDialog(perent, mess, "Yellow Cat Shop", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    public static String promt(Component parent, String mess) {
        return JOptionPane.showInputDialog(parent, mess, "Yellow Cat Shop", JOptionPane.INFORMATION_MESSAGE);
    }
}
