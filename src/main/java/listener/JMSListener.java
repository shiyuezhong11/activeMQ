package listener;
import org.apache.activemq.command.ActiveMQMapMessage;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * 消息监听
 * Created by yz.shi on 2018/4/9.
 */
public class JMSListener implements MessageListener{
    public void onMessage(Message message) {
        try {
            System.out.println("receive Message:"+((ActiveMQMapMessage)message).getContentMap());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
