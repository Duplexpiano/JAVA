package four;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import javax.swing.*;

public class CalcuJFrame extends JFrame {
	private JPanel panel;// 用于嵌套组件
	private String str = " ";// text field
	private static final String[] bs = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "=", ".",
			"+" };// 按键名称

	public CalcuJFrame() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setTitle("Calculator");
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout()); // 边框布局

		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4)); // 网格布局
		JTextField text = new JTextField(30); // 文本域

		List<JButton> buttons = new ArrayList<JButton>(); // button集合
		for (int i = 0; i < bs.length; i++) {
			JButton b = new JButton(bs[i]);
			buttons.add(b);
			b.addActionListener(new ActionListener() { // 匿名内部类

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 获得文本域字符串
					String input = e.getActionCommand(); // 获取命令字符串
					int flag = 1; // 运算结束标志
					if (input.equals("+") || input.equals("-") || input.equals("/") || input.equals("*")) {
						str = str + " " + input + " "; // 每个命令字符串之间用" "(空格)间隔
					} else if (input.equals("=")) {
						str = str + input + calculate(str);
						text.setText(str);
						str = " "; // 运算结束初始化
						flag = 0;
					} else {
						str = str + input;
					}

					if (flag == 1) {
						text.setText(str);
					}
				}

				public String calculate(String str) {
					// TODO: 简单四则运算
					String[] res = str.split(" "); // 空格作为分隔符
					double sum = Double.parseDouble(res[1]); // 获取第一个数值

					for (int i = 2; i < res.length; i++) {
						if (i % 2 == 0) { // 自下标2开始的偶下标均为运算符号
							if (res[i].equals("+")) {
								sum += Double.parseDouble(res[i + 1]);
							} else if (res[i].equals("-")) {
								sum -= Double.parseDouble(res[i + 1]);
							} else if (res[i].equals("*")) {
								sum *= Double.parseDouble(res[i + 1]);
							} else if (res[i].equals("/")) {
								sum /= Double.parseDouble(res[i + 1]);
							}
						}
					}
					String result = String.valueOf(sum); // sum转化成字符串
					return result;
				}

			});
			panel.add(b); // 添加按键到面板对象panel
		}

		this.add("Center", panel);
		text.setHorizontalAlignment(JTextField.RIGHT); // 文本域右对齐
		text.setEditable(false); // 禁止编辑文本域
		this.add("North", text); // 文本域置于button上方
	}

}
