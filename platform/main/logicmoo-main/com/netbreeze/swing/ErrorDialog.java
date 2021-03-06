

package com.netbreeze.swing;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import com.netbreeze.util.Utility;

public class ErrorDialog extends JDialog {

  public static void main(String[] args) {
    (new ErrorDialog("Testing, testing...", new Exception("XYZ!"))).show();
  }

  public ErrorDialog(String message, Throwable error) {
    super();
    if (error instanceof RuntimeException) {
      setTitle("Runtime exception");
    } else if (error instanceof Exception) {
      setTitle("Exception");
    } else {
      setTitle("Error");
    }
    ErrorPanel errorPanel = new ErrorPanel(message, error);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add("Center", errorPanel);

    setModal(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    pack();
    Utility.centerWindow(this);

  }

  public ErrorDialog(Throwable error) {
    this("Something went wrong!", error);
  }

  public ErrorDialog(String message) {
    this(message, null);
  }

}