package def.stompjs.stompjs;
import def.js.Function;
public class Client extends def.js.Object {
    native public Object connect(String user, String pass, Function callback, Object errCallback);
    native public Subscription subscribe(String pipe, Function onMessage);
    native public Object send(String pipe, Options options, Object message);
    public Heartbeat heartbeat;
}

