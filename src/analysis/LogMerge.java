package analysis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LogMerge {

	public static SimpleDateFormat DATE_TEMPLATE = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	public static Set<String> REMOVED_LABEL_SET = new HashSet<String>();
	public static List<String[]> TIME_LABEL_LIST = new ArrayList<String[]>();
	public static Set<String> IP_SET = new HashSet<String>();

	public static void main(String[] args) throws ParseException {
		System.out.println("running...");
		readWarningLog("/home/dingyu/alert_isp26_sys11.txt");
		mergeSort(TIME_LABEL_LIST, 0, 1);
		writeMergeLog("/home/dingyu/alert_isp26_sys11_sorted.txt");
		System.out.println("completed.");
	}

	// 璇诲叆warning log timeStamp+label
	private static void readWarningLog(String path) {
		try {
			File warningLogFile = new File(path);
			BufferedReader wReader = new BufferedReader(new InputStreamReader(
					new FileInputStream(warningLogFile), "UTF-8"));
			String line = null;
			while ((line = wReader.readLine()) != null) {
				if ("".equals(line.trim())) {
					continue;
				}
				String[] logArr = line.split("\t");
				if (logArr.length < 5)
					continue;
				String[] timeLabelArr = { logArr[1],
						logArr[0] + "_" + logArr[2] };
				if (timeLabelArr.length != 2)
					continue;
				TIME_LABEL_LIST.add(timeLabelArr);
			}
			wReader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	// 鍐欏叆鎺掑簭鍚庡悎骞舵棩蹇�
	private static void writeMergeLog(String path) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
					"/home/dingyu/alert_isp26_sys11_sorted.txt"), false));
			for (int i = 0; i < TIME_LABEL_LIST.size(); i++) {
				writer.write(TIME_LABEL_LIST.get(i)[0] + "\t"
						+ TIME_LABEL_LIST.get(i)[1]);
				writer.newLine();
				writer.flush();
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void merge(List<String[]> list, int s, int m, int t)
			throws ParseException {
		List<String[]> tmpList = new ArrayList<String[]>();
		int i = s, j = m;
		while (i < m && j <= t) {
			Date dateI = DATE_TEMPLATE.parse(list.get(i)[0]);
			Date dateJ = DATE_TEMPLATE.parse(list.get(j)[0]);
			if (dateI.getTime() <= dateJ.getTime()) {
				tmpList.add(list.get(i));
				i++;
			} else {
				tmpList.add(list.get(j));
				j++;
			}
		}
		while (i < m) {
			tmpList.add(list.get(i));
			i++;
		}

		while (j <= t) {
			tmpList.add(list.get(j));
			j++;
		}
		for (int c = 0; c < tmpList.size(); c++) {
			list.set(s + c, tmpList.get(c));
		}
	}

	/**
	 * @param a
	 * @param s
	 * @param len
	 *            姣忔褰掑苟鐨勬湁搴忛泦鍚堢殑闀垮害
	 * @throws ParseException
	 **/
	public static void mergeSort(List<String[]> list, int s, int len)
			throws ParseException {
		int size = list.size();
		int mid = size / (len << 1);
		int c = size & ((len << 1) - 1);
		// -------褰掑苟鍒板彧鍓╀竴涓湁搴忛泦鍚堢殑鏃跺�缁撴潫绠楁硶-------//
		if (mid == 0)
			return;
		// ------杩涜涓�稛褰掑苟鎺掑簭-------//
		for (int i = 0; i < mid; ++i) {
			s = i * 2 * len;
			merge(list, s, s + len, (len << 1) + s - 1);
		}
		// -------灏嗗墿涓嬬殑鏁板拰鍊掓暟涓�釜鏈夊簭闆嗗悎褰掑苟-------//
		if (c != 0)
			merge(list, size - c - 2 * len, size - c, size - 1);
		// -------閫掑綊鎵ц涓嬩竴瓒熷綊骞舵帓搴�-----//
		mergeSort(list, 0, 2 * len);
	}
}
