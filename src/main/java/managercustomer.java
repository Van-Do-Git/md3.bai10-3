import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customer", value = "/customer")

public class managercustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<customer> customerList = new ArrayList<>();
        customerList.add(new customer("Mai Văn Hoàn", LocalDate.of(1983,8,20),"Hà Nội","https://cdn.tgdd.vn/Products/Images/42/219900/iphone-9-plus-600x600-600x600.jpg"));
        customerList.add(new customer("Nguyễn Văn Nam", LocalDate.of(1983,8,21),"Bắc Giang","https://cdn.tgdd.vn/Products/Images/42/219900/iphone-9-plus-600x600-600x600.jpg"));
        customerList.add(new customer("Nguyễn Thái Hòa", LocalDate.of(1983,8,22),"Nam Định","https://cdn.tgdd.vn/Products/Images/42/219900/iphone-9-plus-600x600-600x600.jpg"));
        customerList.add(new customer("Trần Đăng Khoa", LocalDate.of(1983,8,17),"Hà Tây","https://cdn.tgdd.vn/Products/Images/42/219900/iphone-9-plus-600x600-600x600.jpg"));
        customerList.add(new customer("Nguyễn Đình Thi", LocalDate.of(1983,8,19),"Hà Nội","https://cdn.tgdd.vn/Products/Images/42/219900/iphone-9-plus-600x600-600x600.jpg"));
        customerList.add(new customer("Mai Văn Hoàn", LocalDate.of(1983,8,20),"Hà Nội","https://cdn.tgdd.vn/Products/Images/42/219900/iphone-9-plus-600x600-600x600.jpg"));
        req.setAttribute("customer",customerList);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);
    }
}
