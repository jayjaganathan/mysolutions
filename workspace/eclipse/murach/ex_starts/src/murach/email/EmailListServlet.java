package murach.email;

import java.io.*;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;

import com.jj.beans.UserBeanLocal;

import model.User1 ;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {
   
	@EJB(name = "ejb/UserBean")
	private UserBeanLocal ub;
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/eclipse/murach/ex_starts/ch05_ex1_email/web/index.jsp";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // store data in User object
            User1 user = new User1();
            user.setEmail(email);
            user.setfirstname(firstName); 
            user.setLastname(lastName);

            // validate the parameters
            String message;
            // User1 usr = ub.selectUser(user.getEmail());
            
            UserDB userDB = new UserDB();
            if (userDB.emailExists(user.getEmail())) {
                message = "This email address already exists.<br>" +
                          "Please enter another email address.";
                url = "/eclipse/murach/ex_starts/ch05_ex1_email/web/index.jsp";
            }
            else {
                message = "";
                url = "/eclipse/murach/ex_starts/ch05_ex1_email/web/thanks.jsp";
               // UserDB.insert(user);
                ub.insert(user);
            }
            
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
}