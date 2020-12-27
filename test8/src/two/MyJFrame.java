package two;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;
import javax.swing.*;

public class MyJFrame extends JFrame {
	private JFileChooser jfc;
	private File file;
	private JPanel panel;
	private static int fileCount, folderCount;

	// 静态变量初始化
	{
		fileCount = folderCount = 0;
	}

	public MyJFrame() {
		panel = new JPanel();

		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("FileManage");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField textField = new JTextField(20); // 统计结果文本显示域

		JButton button = new JButton("choose");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 打开文件
				jfc = new JFileChooser("D:\\"); // 操作目录
				jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // 选择文件或者目录
				int val = jfc.showOpenDialog(null);
				if (val == JFileChooser.APPROVE_OPTION) {
					fileCount = folderCount = 0;
					file = new File(jfc.getSelectedFile().toString());

					if (file.isDirectory()) { // true: 统计统计该目录下（包括子目录）文件的数目、文件夹的数目并显示出来; false: 仅为一个文件
						count(fileCount, folderCount, file);
					} else {
						inFileCount();
					}

					textField.setText("fileCount: " + fileCount + "\nfolderCount: " + folderCount);
				} else {
					// TODO: 未正常选择
					textField.setText("Choose nothing..");
				}
			}

			public void count(int fileCount, int folderCount, File file) {
				// TODO: 递归统计
				File[] files = file.listFiles();
				for (File f : files) {
					if (f.isFile()) {
						inFileCount();
					} else if (f.isDirectory()) {
						inFolderCount();
						count(fileCount, folderCount, f);
					}
				}
			}

		});
		panel.add(button);
		textField.setEditable(false); // 文本域设置为不可编辑
		panel.add(textField);
		frame.add(panel);
	}

	static void inFileCount() {
		// TODO: fileCount+1
		fileCount++;
	}

	static void inFolderCount() {
		// TODO: folderCount+1
		folderCount++;
	}
}
