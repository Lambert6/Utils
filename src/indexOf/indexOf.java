package indexOf;

public class indexOf {
	public String transfer(String comment) {
		 String str = comment;
		 try {
			 if(str.indexOf("������ע") != 0) {
			 return str.substring(str.indexOf("������ע"));
		 }	
			} catch (Exception e) {
				// TODO: handle exception
			}
		 try {
			 if(str.indexOf("��") != 0) {
				 return str.substring(str.indexOf("��"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("����") != 0) {
				 return str.substring(str.indexOf("����"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("���") != 0) {
				 return str.substring(str.indexOf("���"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("���") != 0) {
				 return str.substring(str.indexOf("���"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("������") != 0) {
				 return str.substring(str.indexOf("������"));
			 }	
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
		 
		 
		return "��";	      
	}
}
