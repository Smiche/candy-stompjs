package def.stompjs.stompjs;

public class Message extends def.js.Object {
    public Message(){}
    
    @jsweet.lang.Optional
    public String command;

    //TODO: change to Map<String,String> somehow
    @jsweet.lang.Optional
    public def.js.Object headers;

    @jsweet.lang.Optional
    public String body;

    @jsweet.lang.Optional
    public def.js.Function ack;

    @jsweet.lang.Optional
    public def.js.Function nack;
}

