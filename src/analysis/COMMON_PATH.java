package analysis;

import java.io.File;

/**
 * ����ʽ������COMMON_PATH,�洢�������ļ�·��
 * */
public class COMMON_PATH {

	/** �洢 ԭʼsyslog �ļ���·�� */
	public final static String RAW_LOG_FILE_PATH = "C:/Users/Administrator/Desktop/LogMining/RawLog";

	/** �洢 syslog��Lucene �ļ�·�� */
	public final static String LUCENE_PATH = "C:/Users/Administrator/Desktop/LogMining/LuceneFile";

	/** �洢 �������ձ�ǩ���syslog��Lucene �ļ�·�� */
	public final static String LABELED_LUCENE_PATH = "C:/Users/Administrator/Desktop/LogMining/LabeledLuceneFile/";

	/** �洢 ���зִ� �ļ�·�� */
	public final static String AllTOKEN_SET_PATH = "C:/Users/Administrator/Desktop/LogMining/AllTokenSet.txt";

	/** �洢 �ִʿ� �ļ�·�� */
	public final static String TOKEN_SET_PATH = "C:/Users/Administrator/Desktop/LogMining/TokenSet.txt";

	/** �洢 syslog��Message���������� �ļ�·�� */
	public final static String VECTOR_PATH = "C:/Users/Administrator/Desktop/LogMining/Vector.txt";

	/** �洢 FPTree �ļ�·�� */
	public final static String FPTREE_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/FPTree/";

	/** �洢 ����ʱ��ǵ�Message������ �ļ�·�� */
	public final static String LABEL_VECTOR_PATH = "C:/Users/Administrator/Desktop/LogMining/LabelVector.txt";

	/** �洢 ѵ��syslog��ʱ����ԭʼ���� �ļ�·�� */
	public final static String LABEL_RAW_DATA_PATH = "C:/Users/Administrator/Desktop/LogMining/LabelRawData.txt";

	/** �洢 ��ʱ��ǩ���ñ�ǩ������docIds �ļ�·�� */
	public final static String LABEL_DOCIDS_PATH = "C:/Users/Administrator/Desktop/LogMining/LabelDocIds.txt";

	/** �洢 ���շ������ �ļ�·�� */
	public final static String LABEL_SET_PATH = "C:/Users/Administrator/Desktop/LogMining/LabelSet.txt";

	/** �洢 syslogʱ��������� �ļ�·�� */
	public final static String TIMESTAMP_LABEL_PATH = "C:/Users/Administrator/Desktop/LogMining/TimeStampLabel.txt";

	/** �洢 ���ձ�ǩ��ǩ���ñ�ǩ������docIds �ļ�·�� */
	public final static String LABEL_SET_DOCIDS_PATH = "C:/Users/Administrator/Desktop/LogMining/LabelSetDocIds.txt";

	/** �洢 ���� �ļ�·�� */
	public final static String FEATURE_PATH = "C:/Users/Administrator/Desktop/LogMining/Feature/Feature.txt";

	/** �澯��־ �ļ�·�� */
	public final static String WARNING_LOG_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/WarningLog/";

	/** �洢 �ϲ�����־ �ļ�·�� */
	public final static String MERGE_LOG_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/MergeLog/";

	/** �洢 �Ƴ��޹�syslog��label �ļ�·�� */
	public final static String REMOVED_LABEL_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/RemoveLabel.txt";

	/** �洢 Ƶ����ļ� ���ļ� ·�� */
	public static String FREQUENT_ITEM_SETS_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/";

	/** �洢 syslog���澯��־���� �ļ�·�� */
	public final static String FEATURE_FOLDER_PATH = "C:/Users/Administrator/Desktop/LogMining/Feature/";

	/** �洢 ��������ͳ������ �ļ�·�� */
	public final static String STATISTICS_PATH = "C:/Users/Administrator/Desktop/LogMining/STATISTICS.txt";
	
	/** �洢 Vector Lucene �ļ�·�� */
	public final static String VECTOR_LUCENE_PATH = "C:/Users/Administrator/Desktop/LogMining/VectorLucene/";
	
	/** �洢 ip�б� �ļ�·�� */
	public final static String IP_LIST_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/IPList.txt";
	
	/** �洢 warning log label�б� �ļ�·�� */
	
	/** �洢 �򻯺�����շ������ �ļ�·�� */
	public final static String FINAL_LABEL_SET_PATH = "C:/Users/Administrator/Desktop/LogMining/Final_Label_Set.txt";

	/** �洢 ����Label����TmpLabel��Ӧ��� �ļ�·�� */
	public final static String FINAL_TMP_LABEL_PATH = "C:/Users/Administrator/Desktop/LogMining/Final_Tmp_Label.txt";

	/** �洢 FPTree���ڵ㵽����Ҷ�ӽڵ�·�� �ļ�·�� */
	public final static String R2L_FOLDER_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/FPTreePaths/";

	/** �洢 FPTree���ڵ㵽����Ҷ�ӽڵ�·�� ��ϸ���� �ļ�·�� */
	public final static String R2L_DETAILS_FOLDER_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/FPTreePathsDetails/";

	/** �洢 FPTree���ڵ㵽����Ҷ�ӽڵ�·�� ��ϸ���� �ļ�·�� */
	public final static String WARNING_LOG_LABEL_DESCRIBE_PATH = "C:/Users/Administrator/Desktop/LogMining/LogMerge/WarningLogLabelDes.txt";

	public static int VECTOR_COUNT = 40506707;
	public static void SET_VECTOR_COUNT(int count){
		COMMON_PATH.VECTOR_COUNT = count;
	}
	
	private static final COMMON_PATH single = new COMMON_PATH();

	// ��̬��������
	public static COMMON_PATH getInstance() {
		return single;
	}

	/**
	 * ��ʼ���ļ����� ����ļ��в����ڣ����½��ļ��У�����ļ����Ѵ��ڣ���ɾ��·���������ļ����������ļ��м����ļ���
	 * 
	 * @param sPath
	 *            ����ʼ��Ŀ¼���ļ�·��
	 * @return Ŀ¼��ʼ���ɹ�����true�����򷵻�false
	 */
	public static boolean INIT_DIR(String sPath) {
		// ���sPath�����ļ��ָ�����β���Զ�����ļ��ָ���
		if (!sPath.endsWith(File.separator)) {
			sPath = sPath + File.separator;
		}
		File dirFile = new File(sPath);
		// ���dir��Ӧ���ļ������ڣ����߲���һ��Ŀ¼�����˳�
		if (!dirFile.exists() || !dirFile.isDirectory()) {
			dirFile.mkdir();
			return true;
		}
		boolean flag = true;
		// ɾ���ļ����µ������ļ�(������Ŀ¼)
		File[] files = dirFile.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {// ɾ�����ļ�
				flag = DELETE_FILE(files[i].getAbsolutePath());
				if (!flag)
					break;
			} else {// ɾ����Ŀ¼
				flag = INIT_DIR(files[i].getAbsolutePath());
				if (!flag)
					break;
			}
		}
		if (!flag)
			return false;
		return true;
	}

	/**
	 * ɾ�������ļ�
	 * 
	 * @param sPath
	 *            ��ɾ���ļ����ļ���
	 * @return
	 * @return �����ļ�ɾ���ɹ�����true�����򷵻�false
	 */
	public static boolean DELETE_FILE(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		// ·��Ϊ�ļ��Ҳ�Ϊ�������ɾ��
		if (file.isFile() && file.exists()) {
			file.delete();
			flag = true;
		}
		return flag;
	}
}