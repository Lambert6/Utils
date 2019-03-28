//package suanfa.face;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//
//public class getStrHZ {
///**
// * 有一个字符串，求出每个字符出现的次数
// */
//	public static void main(String[] args) {
//		String str = "asdascsdfcsfdasfasdfwea";
//		List<StrBean> pd = new ArrayList<StrBean>();
//		Collection<StrBean> c = new ArrayList<StrBean>();
//		StrBean sn1 = new StrBean();
//		System.out.println(sn1.hashCode());
//		sn1.setName(".");
//		sn1.setHz(1);
//		pd.add(sn1);
//		c.add(sn1);
//		//Collections.sort(pd.);
//		for(int i = 0 ; i < str.length() ; i++) {
//			String tem = String.valueOf((str.charAt(i)));
//			int flag = 0;
//			int flag2 = 0;
//			for(StrBean s : pd) {
//				if(!s.getName().equals(tem)) {
//					flag = 1;
//				}else {
//					s.setHz(s.getHz()+1);
//					flag2 = 1;
//				}
//			}
//			if(flag == 1 && flag2 != 1) {
//				StrBean sn = new StrBean();
//				sn.setName(tem);
//				sn.setHz(1);
//				pd.add(sn);
//			}
//		}
//		//冒泡排序
////		for(int i = 0 ; i < pd.size() -1; i++) {
////			for(int j = 0 ; j < pd.size() -1 -i ; j++) {
////				if(pd.get(j).getHz() < pd.get(j+1).getHz()) {
////					StrBean s = pd.get(j);
////					pd.set(j, pd.get(j+1));
////					pd.set(j+1, s);
////				}
////			}
////		}
//		//选择排序
//		for(int i = 0 ; i < pd.size()-1 ; i++) {
//			int k = i ;
//			for(int j = k+1; j<pd.size() ; j++) {
//				if(pd.get(k).getHz() < pd.get(j).getHz()) {
//					k = j;
//				}
//			}
//			StrBean tems = pd.get(k);
//			pd.set(k, pd.get(i));
//			pd.set(i, tems);
//		}
//		
//		
//		for(int i = 0 ; i < pd.size() ; i++) {
//			if(pd.get(i).getName().equals(".")) {
//				pd.remove(i);
//			}
//			System.out.println();
//			System.out.println(pd.get(i).getName()+"------"+pd.get(i).getHz());
//		}
//		
//		
//	}
//}
