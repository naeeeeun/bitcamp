package com.bitcamp.openp.customview;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

public class DownloadView extends AbstractView {

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		File file = (File) model.get("downloadFile");

		response.setContentType("application/download; charset=utf-8");
		response.setContentLength((int) file.length());

		String userAgent = request.getHeader("User-Agent");
		
		System.out.println("User-Agent : " + userAgent );
		
		
		boolean ie = 
				userAgent.indexOf("rv") > -1 || userAgent.indexOf("MSIE") > -1 ;

		String fileName = null;

		if (ie) {

			// MS IE
			fileName = URLEncoder.encode(file.getName(), "utf-8");

		} else {

			// etc
			fileName = new String(file.getName().getBytes("utf-8"), "iso-8859-1");

		}
		
		
		response.setHeader(
				
				"Content-Disposition",								
				"attachment; filename=\""+fileName+".jpg\";"
				
				); 
		
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		OutputStream out = response.getOutputStream();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			FileCopyUtils.copy(fis, out);
		} finally {
			if( fis != null) {				
				fis.close();
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
