package def.stompjs.stompjs;

import def.js.Map;

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
    
    public Map<String, String> getHeadersAsStrings(){
    	Map<String, String> map = new Map<String, String>();
    	
    	if(this.headers == null) {
    		return null;
    	}
    		
    	for(def.js.String key : def.js.Object.keys(this.headers)) {
    		map.set(key.toString(), this.headers.$get(key));
    	}
    	
    	return map;
    }
}

