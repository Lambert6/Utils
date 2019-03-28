package com.xksd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
//		for(int i = 3 ; i < 71 ; i++) {
//			//BigDecimal total3 = total2.add(sco.get());
//			int j = i-1;
//			System.out.println("BigDecimal total"+i+" = total"+j+".add(sco.get());");
//		}
//		BigDecimal a = new BigDecimal(1);
//		BigDecimal b = new BigDecimal(1);
//		BigDecimal c = new BigDecimal(1);
//		List<BigDecimal> l = new ArrayList<BigDecimal>;
//		l.add(a);
//		l.add(b);
//		l.add(c);
//		int sum = 0;
//		for(int p = 0 ; p < l.size() ; p++) {
//			sum=sum.add(l.get(p));
//		}
//		for(int i = 1 ; i < 71 ; i++) {
//			System.out.println("if(km.getC"+i+"t7() != 0) {");
//			System.out.println("tre.setC"+i+"t7(km.getC"+i+"t7());");
//			System.out.println("}");
//		}
		for(int i = 1 ; i < 71 ; i++) {
			for(int j = 1 ; j < 8 ; j++) {
//				<div v-if="item.itemid == '1' && item.courseid == '1'">
//				<el-input v-model="tableDataCourseinfo[scope.$index].c1t1" 
//				placeholder="" @blur = "updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c1t1)"></el-input></div>				
//				<div v-if="item.itemid == '2' && item.courseid == '1'">
//				<el-input v-model="tableDataCourseinfo[scope.$index].c1t2"
//				placeholder="" @blur = "updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c1t2)"></el-input></div>
//				<div v-if="item.itemid == '3' && item.courseid == '1'">
//				<el-input v-model="tableDataCourseinfo[scope.$index].c1t3"
//				placeholder="" @blur = "updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c1t3)"></el-input></div>
//				<div v-if="item.itemid == '4' && item.courseid == '1'">
//				<el-input v-model="tableDataCourseinfo[scope.$index].c1t4"
//				placeholder="" @blur = "updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c1t4)"></el-input></div>
//				<div v-if="item.itemid == '5' && item.courseid == '1'">
//				<el-input v-model="tableDataCourseinfo[scope.$index].c1t5"
//				placeholder="" @blur = "updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c1t5)"></el-input></div>
//				<div v-if="item.itemid == '6' && item.courseid == '1'">
//				<el-input v-model="tableDataCourseinfo[scope.$index].c1t6"
//				placeholder="" @blur = "updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c1t6)"></el-input></div>
//				<div v-if="item.itemid == '7' && item.courseid == '1'">
//				<el-input v-model="tableDataCourseinfo[scope.$index].c1t7"
//				placeholder="" @blur = "updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c1t7)"></el-input></div>
				System.out.println("<div v-if=\"item.itemid == '"+j+"' && item.courseid == '"+i+"'\">");
				System.out.println("<el-input v-model=\"tableDataCourseinfo[scope.$index].c"+i+"t"+j+"\" ");
				System.out.println("placeholder=\"\" @blur = \"updatetableDataCourseinfo(item.courseid,item.itemid,tableDataCourseinfo[scope.$index].c"+i+"t"+j+")\"></el-input></div>");
				
			}
			System.out.println(" ");
		}
		
//		for(int i = 1 ; i < 71 ; i++) {
//			for(int j = 1 ; j < 8 ; j++) {
////				if(m.getCourseid().equals("1") && m.getItemid().equals("1")) {
////					  if( bde.compareTo(g.getC1t1()) > 0) {
////					     c1t1++;
////					  }
////					}
//
//				
//				System.out.println("if(m.getCourseid().equals(\""+i+"\") && m.getItemid().equals(\""+j+"\")) {");
//				System.out.println("   if( bde.compareTo(g.getC"+i+"t"+j+"()) == 0) {");
//				System.out.println("      c"+i+"t"+j+"++;");
//				System.out.println("    }");
//				System.out.println("}");
//				
//			}
//		}
//		// TODO 自动生成的方法存根
//	    BigDecimal a = new BigDecimal(3947);
//	    int b=49;
//	    DecimalFormat df=new DecimalFormat("0.00");
//	   System.out.println(a/b);
//	   
//		BigDecimal a;
//		BigDecimal b;
//		a = new BigDecimal(3872);
//		b = new BigDecimal(49);
//		System.out.print(a.divide(b, 2, RoundingMode.HALF_UP));
//		int j = i-1;
//		System.out.println("BigDecimal total"+i+"= total"+j+".add(sco.getC"+p+"t"+k+"());");
//		p++;k++;
		//int p = 1;  int k = 1;
//		for(int i = 52 ; i < 542; i++) {		
//			//BigDecimal total52 = total51.add(sco.getC1t1());	"BigDecimal total"+p+" = total"+k+
//				int	k = i-1;
//				System.out.println("BigDecimal total"+i+" = total"+k);
//			
//		}
//		for(int i = 1 ; i < 71; i++) {
//			System.out.println(" ");
//			System.out.println("case \""+i+"\":");
//			
//			
//			
//				System.out.println("    t.setC"+i+"t"+1+"(sd.getJcxpj());");
//				System.out.println("    t.setC"+i+"t"+2+"(sd.getFzxpj());");
//				System.out.println("    t.setC"+i+"t"+3+"(sd.getBkcj());");
//				System.out.println("    t.setC"+i+"t"+4+"(sd.getXxxs());");
//				System.out.println("    t.setC"+i+"t"+5+"(sd.getGcbx());");
//				System.out.println("    t.setC"+i+"t"+6+"(sd.getCscj());");
//				System.out.println("    t.setC"+i+"t"+7+"(sd.getZcj());");
////			for(int j = 1 ; j < 8; j++) {	
////					System.out.println("t.setC"+i+"t"+j+"(sd.getFzxpj());");
////				}
//			
//			
//				System.out.println("    break;	");
//		}
		
//		System.out.println("t.setC"+i+"t"+j+"(sd.getFzxpj());");
//		System.out.println("t.setC"+i+"t"+j+"(sd.getBkcj());");
//		System.out.println("t.setC"+i+"t"+j+"(sd.getXxxs());");
//		System.out.println("t.setC"+i+"t"+j+"(sd.getGcbx());");
//		System.out.println("t.setC"+i+"t"+j+"(sd.getCscj());");
//		System.out.println("t.setC"+i+"t"+j+"(sd.getZcj());");
//		BigDecimal a = new BigDecimal(1);
//		BigDecimal b = new BigDecimal(0);
//		BigDecimal c = new BigDecimal(2);
//		BigDecimal t1 = a.add(b);
//		BigDecimal t2= t1.add(c);
//		System.out.println(t2);
//		for(int i = 40; i <= 68 ; i++) {
////			if(sub.equals("2")) {
////				if(fs2.get().equals(BigDecimal.ZERO)) {
////					missExam++;
////				}
////			}
//			System.out.println("if(sub.equals(\""+i+"\")) {");
//			System.out.println("  if(fs2.get().equals(BigDecimal.ZERO)) {");
//			System.out.println("    missExam++;");
//			System.out.println("  }");
//			System.out.println("}");
//		}
		
//		for(int i = 40; i <= 68 ; i++) {
//			
////			if(sub.equals("2")) {
////				if(!g.get().equals(BigDecimal.ZERO) && b.compareTo(g.get()) > 0) {
////					failed++;
////				}
////			}
//			System.out.println(" ");
//			System.out.println("if(sub.equals(\""+i+"\")) {");
//			System.out.println("  if(!g.get().equals(BigDecimal.ZERO) && b.compareTo(g.get()) > 0) {");
//			System.out.println("     failed++;");
//			System.out.println("  } ");
//			System.out.println("} ");
//		}
	
	}
}
