package test;

import action.Action1;
import com.opensymphony.xwork2.ActionProxy;

import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

public class Action1Test extends StrutsTestCase {
//
//    @Before
//    public void setUp() throws Exception {
//        super.setUp();//必须要有，初始化用，参见UML图
////        //模拟request,response
////        request = new MockHttpServletRequest();
////        request.setCharacterEncoding("UTF-8");
////        response = new MockHttpServletResponse();
////
////        //创建mock对象
////       // testService = EasyMock.createMock(TestService.class);
//
//    }

    @Test
    public void testSuccessQuery() {
        request.setParameter("Author", "Margaret Mitchell");
        ActionProxy proxy = getActionProxy("/action");
        assertNotNull(proxy);

    }

    @Test
    public void testFailQuery() {
        request.setParameter("Author", " ");
        ActionProxy proxy = getActionProxy("/action");
        Action1 action = (Action1) proxy.getAction();
        try {
            proxy.execute();

            assertEquals(action.sayHello(), "success");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }



    @Test
    public void testListExample() throws Exception {
        try {
            //设置 请求参数

            //获取要测试Action
            ActionProxy proxy = getActionProxy("/action");
            Action1 ea = (Action1) proxy.getAction();
            proxy.execute();

            //获取Action中执行结果
            String jsonMsgBean = ea.sayHello();
            System.out.print(jsonMsgBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected String[] getContextLocations() {
        return new String[]{"struts.xml"};
    }
}
