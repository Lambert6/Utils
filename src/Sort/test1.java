package Sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class test1 {
	public static List<TemScoreSort> getTemScoreSort(int mxScore,int scoreAll){
		//mxScore  �Ǳ��β�ѯ�����п�Ŀ�����ɼ�
		//scoreAll �Ǳ���Ҫ�Զ��ٷ����ֶε���
		List<TemScoreSort> t = new ArrayList<TemScoreSort>();//Ҫ�洢�����ε�List
		int p = 0;
		if(mxScore % scoreAll == 0) {
			for(int i = 0; i<= mxScore/scoreAll-1; i++) {
				TemScoreSort ts = new TemScoreSort();
				
					if(i == mxScore/scoreAll-1) {
						ts.setMinScore(new BigDecimal(p));
						ts.setMaxScore(new BigDecimal(10000000));
						t.add(ts);
					}else {
						ts.setMinScore(new BigDecimal(p));
						ts.setMaxScore(new BigDecimal(p+scoreAll));
						p = p+scoreAll;
						t.add(ts);
					}
		}			
		}else {
			for(int i = 0; i<= mxScore/scoreAll; i++) {
				TemScoreSort ts = new TemScoreSort();
					if(i == mxScore/scoreAll) {
						ts.setMinScore(new BigDecimal(p));
						ts.setMaxScore(new BigDecimal(10000000));
						t.add(ts);
					}else {
						ts.setMinScore(new BigDecimal(p));
						ts.setMaxScore(new BigDecimal(p+scoreAll));
						p = p+scoreAll;
						t.add(ts);
					}
			}
		}
	
		return t;
	}
	
	public static void main(String[] args) {
		List<TemScoreSort> t = test1.getTemScoreSort(800, 10);
		int u = 1;
		for(TemScoreSort a : t) {
			System.out.println("��"+u+"����   "+a.getMinScore()+" ���� "+a.getMaxScore());
			u++;
		}

		
	}
}
