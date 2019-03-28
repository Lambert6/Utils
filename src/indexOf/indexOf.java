package indexOf;

public class indexOf {
	public String transfer(String comment) {
		 String str = comment;
		 try {
			 if(str.indexOf("车辆备注") != 0) {
			 return str.substring(str.indexOf("车辆备注"));
		 }	
			} catch (Exception e) {
				// TODO: handle exception
			}
		 try {
			 if(str.indexOf("车") != 0) {
				 return str.substring(str.indexOf("车"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("何总") != 0) {
				 return str.substring(str.indexOf("何总"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("免费") != 0) {
				 return str.substring(str.indexOf("免费"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("免费") != 0) {
				 return str.substring(str.indexOf("免费"));
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 try {
			 if(str.indexOf("这辆车") != 0) {
				 return str.substring(str.indexOf("这辆车"));
			 }	
			} catch (Exception e) {
				// TODO: handle exception
			}
		 
		 
		 
		return "无";	      
	}
}
