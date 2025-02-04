
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Map<String, String> boddy = new HashMap<String, String>() {
        };

        boddy.put("Boddy", "Boddy");
        boddy.put("Boddy1", "Boddy1");
        boddy.put("Boddy2", "Boddy2");

        HttpRequest<Map> Req = new HttpRequestBuilder<Map>()
                .SetUrl("https://api.example.com")
                .SetMethod(HttpMethod.POST)
                .AddToHeader("Authorization", "Bearer xyz123")
                .AddToHeader("Accept", "application/json")
                .AddQueryString("ID", "2")
                .SetBody(boddy)
                .build();

        HttpRequest<String> Reqq = new HttpRequestBuilder<String>()
                .SetUrl("https://api.example.com")
                .SetMethod(HttpMethod.POST)
                .AddToHeader("Authorization", "Bearer xyz123")
                .AddToHeader("Accept", "application/json")
                .AddQueryString("ID", "2")
                .SetBody("{\"key\":\"value\"}")
                .build();

        System.out.println(Req.toString());
        System.out.println(Reqq.toString());
    }
}