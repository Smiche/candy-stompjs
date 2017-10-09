package def.stompjs.stompjs;

import def.js.Map;

public class Message extends def.js.Object {
    public Message(){}
    
    @jsweet.lang.Optional
    public String command;

    //TODO: change to Map<String,String> somehow
    @jsweet.lang.Optional
    public Map<String, String> headers;

    @jsweet.lang.Optional
    public String body;

    @jsweet.lang.Optional
    public def.js.Function ack;

    @jsweet.lang.Optional
    public def.js.Function nack;
}

