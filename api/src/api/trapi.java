package api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/trapi")
public class trapi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public trapi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
									throws ServletException, IOException {
		String clientId = "hv4C67p2xNUw62V86Aw8"; // 애플리케이션 클라이언트 아이디값
        String clientSecret = "lrFEiX7QZi"; // 애플리케이션 클라이언트 시크릿값
        String txt = request.getParameter("txt");
        try {
        	request.setCharacterEncoding("UTF-8"); 
        	response.setContentType("text/html;charset=UTF-8");

            String text = URLEncoder.encode(txt, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
            URL url = new URL(apiURL); 
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST"); 
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            // post request
            String source = request.getParameter("source");
            String target = request.getParameter("target");
            String postParams = "source="+source+"&target="+target
            									+"&text=" + text;
            con.setDoOutput(true); // 서버로 보냄
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer sb = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            br.close();
            String str = sb.toString();
            String[] split = str.split(",");
            String split1 = split[split.length-1];
            split1 = split1.substring(18);
            split = split1.split("\"");
            request.setAttribute("result", split[0]);
            request.setAttribute("inputtxt",txt);
            RequestDispatcher dispatcher 
            				= request.getRequestDispatcher("/form.jsp");            
            dispatcher.forward(request, response);
        } catch (Exception e) {
        	}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
								throws ServletException, IOException {
		doGet(request, response);
	}

}
