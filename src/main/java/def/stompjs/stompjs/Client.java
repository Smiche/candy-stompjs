package def.stompjs.stompjs;
import def.js.Function;
public class Client extends def.js.Object {
    native public Object connect(String user, String pass, java.util.function.Consumer<?> callback, java.util.function.Consumer<?> errCallback);
    native public Subscription subscribe(String pipe, java.util.function.Consumer<Message> onMessage);
    native public Object send(String pipe, Options options, Object message);
    public Heartbeat heartbeat;
}

